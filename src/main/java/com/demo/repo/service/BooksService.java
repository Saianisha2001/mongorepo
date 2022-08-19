package com.demo.repo.service;

import com.demo.repo.model.Book;
import com.demo.repo.repository.BooksRepository;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BooksService {

    @Autowired
    BooksRepository br;

    public List<Book> getAllBooks() {
        return br.findAll();
    }

    public Book addBooks(Book book) {
        return br.insert(book);
    }

    public Book updateBooks(Book book) {
        return br.save(book);
    }

    public void deleteBooks(String id) {
        br.deleteById(id);
    }

    public Map<String, Object> getAllBooksByPage(int pageNo, int pageSize, String[] fields, String sortBy) {
        Sort sort=Sort.by(sortBy);
        Pageable pageReq= PageRequest.of(pageNo,pageSize,sort);
        Page<Book> pg=br.findAll(pageReq);
        Map<String,Object> res=new HashMap<String,Object>();
        res.put("data",pg.getContent());
        res.put("no of elements",pg.getNumberOfElements());
        res.put("no of pages",pg.getTotalPages());
        return res;
    }
    //we cant include both pagenation and projection together
    //aggregation is not possible using mongo repository directly

    public Map<String, Object> countPage() {
        try
        {
            Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
            List<Book> book=br.getCat(firstPageWithTwoElements);
            Map<String,Object> res=new HashMap<String,Object>();
            res.put("data",book);
            return res;
        }
        catch(Exception e)
        {
            System.out.println("expection occured");
            return null;
        }

    }

    public Map<String, Object> getByCategory(String[] cat) {
        Map<String,Object> res=new HashMap<String,Object>();
        List<Book> book=br.getByCategory(cat);
        res.put("data",book);
        return res;
    }
}


