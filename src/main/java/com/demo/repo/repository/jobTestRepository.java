package com.demo.repo.repository;

import com.demo.repo.model.Book;
import com.demo.repo.model.JobTest;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface jobTestRepository extends MongoRepository<JobTest, String> {

//    @Aggregation(pipeline = {
//            "{'$match':{'transaction_type':?0, 'price': {$gt: ?1} }}",
//            "{'$sample':{size:?2}}",
//            "{'$sort':{'area':-1}}"
//    })
//    public List<JobTest> getByCategory1(String[] categories);

    @Aggregation(pipeline = {
            "{'$addFields': {'month': {'$month': {'$toDate': '$creationdate'} },'year': {'$year': {'$toDate': '$creationdate'} },'date' : {'$dayOfMonth': {'$toDate': '$creationdate' }},}",
            "{'$match': { '$and': [ {'year':2022},{'month:5'} ] } }",
            "{'$group':{'_id' : null,'jobsposted': {'$sum' :1},'jobscompleted': {'$sum' : {'$cond':{'if':{'$eq':['COMPLETED','$jobcurrentstatus'] },'then': 1, 'else': 0}}},'jobscancelled': {'$sum' : {'$cond':{'if':{'$eq':['$jobcurrentstatus', 'REJECTED']} ,'then': 1, 'else': 0}}},'activejobs': {'$sum' : {'$cond':{'if':{'$or': [{'$eq': ['$jobcurrentstatus', 'OPEN']},{'$eq': ['$jobcurrentstatus', 'ACTIVE']}]} ,'then': 1, 'else': 0}}},'jobspostedtoday': {'$sum' :{'$cond':{'if':{'$eq':['$date', 19] },'then': 1, 'else': 0}}},'jobscompletedtoday': {'$sum' : {'$cond':{'if':{'$and': [{'$eq':['COMPLETED','$jobcurrentstatus'] },{'$eq':['$date', 19] }]},'then': 1, 'else': 0}}},'jobscancelledtoday': {'$sum' : {'$cond':{'if':{'$and': [{'$eq':['$jobcurrentstatus', 'REJECTED']} ,{'$eq':['$date', 19] }]},'then': 1, 'else': 0}}},'activejobstoday': {'$sum' : {'$cond':{'if':{'$and': [{'$or': [{'$eq': ['$jobcurrentstatus', 'OPEN']},{'$eq': ['$jobcurrentstatus', 'ACTIVE']}]},{'$eq':['$date', 19] }]} ,'then': 1, 'else': 0}}},'jobspostedyesterday': {'$sum' :{'$cond':{'if':{'$eq':['$date', 18] },'then': 1, 'else': 0}}},'jobscompletedyesterday': {'$sum' : {'$cond':{'if':{'$and': [{'$eq':['COMPLETED','$jobcurrentstatus'] },{'$eq':['$date', 18] }]},'then': 1, 'else': 0}}},'jobscancelledyesterday': {'$sum' : {'$cond':{'if':{'$and': [{'$eq':['$jobcurrentstatus', 'REJECTED']} ,{'$eq':['$date', 18] }]},'then': 1, 'else': 0}}},'activejobsyesterday': {'$sum' : {'$cond':{'if':{'$and': [{'$or': [{'$eq': ['$jobcurrentstatus', 'OPEN']},{'$eq': ['$jobcurrentstatus', 'ACTIVE']}]},{'$eq':['$date', 18] }]} ,'then': 1, 'else': 0}}}}}",

    })
    public List<JobTest> getjobs();

}

//https://stackoverflow.com/questions/48375985/creating-a-nested-document-in-mongodb-using-spring
//https://stackabuse.com/spring-data-mongodb-guide-to-the-aggregation-annotation/