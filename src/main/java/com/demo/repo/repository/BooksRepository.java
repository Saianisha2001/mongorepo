package com.demo.repo.repository;

import com.demo.repo.model.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends MongoRepository<Book,String>{

    @Query(value="{'categories':{$elematch:{$in:?0}}}",fields = "{'title':1}")
    public List<Book> getByCategory(String[] categories);

    @Aggregation(pipeline = {"{'$match':{'categories':{$in: ['Mobile','Java','Software Engineering']}}}",})
    public List<Book> getCat(Pageable pg);
}


//Different approaches
//   1)---> @Aggregation(pipeline = {
//            "{'$match':{'transaction_type':'For Sale', 'price' : {$gt : 100000}}",
//    })
//    List<Property> findExpensivePropertiesForSale();
//
//   2)---> @Aggregation(pipeline = {
//            "{'$match':{'transaction_type': ?0, 'price' : {$gt : ?1}}",
//    })
//    List<Property> findPropertiesByTransactionTypeAndPriceGTPositional(String transactionType, int price);
//
//   3)---> @Aggregation(pipeline = {
//            "{'$match':{'transaction_type': #{#transactionType}, 'price' : {$gt : #{#price}}}",
//    })
//    List<Property> findPropertiesByTransactionTypeAndPriceGTNamed(@Param("transactionType") String transactionType, @Param("price") int price);
//   4)---> @Aggregation(pipeline = {
//            "{'$match':{'transaction_type':?0, 'price': {$gt: ?1} }}",
//            "{'$sample':{size:?2}}",
//            "{'$sort':{'area':-1}}"
//    })
//    List<Property> findPropertiesByTransactionTypeAndPriceGT(String transactionType, int price, int sampleSize);
//   5)--->@Aggregation(pipeline = {
//            "{'$match':{'transaction_type':?0, 'price': {$gt: ?1} }}",
//            "{'$sample':{size:?2}}",
//            "{'$sort':{'area':-1}}"
//    })
//    Iterable<Property> findPropertiesByTransactionTypeAndPriceGTPageable(String transactionType, int price, int sampleSize, Pageable pageable);
//
//When calling the method from a controller, you'll want to construct a Pageable object to pass in:
//
//        int page = 1;
//        int size = 5;
//
//        Pageable pageable = new PageRequest.of(page, size);
//        Page<Property> = propertyRepository.findPropertiesByTransactionTypeAndPriceGTPageable("For Sale", 100000, 5, pageable);