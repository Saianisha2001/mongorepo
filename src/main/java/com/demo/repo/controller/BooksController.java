package com.demo.repo.controller;

import com.demo.repo.model.Book;
import com.demo.repo.service.BooksService;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    BooksService bs;

    @GetMapping("/")
    public List<Book> getAllBooks()
    {
        return bs.getAllBooks();
    }

    @PostMapping ("/addone")
    public Book addBooks(@RequestBody Book book)
    {
        return bs.addBooks(book);
    }

    @PutMapping("/updateone")
    public Book updateBooks(@RequestBody Book book)
    {
        return bs.updateBooks(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBooks(@PathVariable String id )
    {
        bs.deleteBooks(id);
        return "Deleted";
    }

    @GetMapping("/page")
    public Map<String,Object> getAllBooksByPage(@RequestParam(value="pageno",defaultValue = "0") int pageNo,@RequestParam(value="pageSIZE",defaultValue = "10") int pageSize,@RequestParam(value="fields",defaultValue = "title,pageCount") String [] fields,@RequestParam(value="sortby",defaultValue = "id") String sortBy)
    {
        return bs.getAllBooksByPage(pageNo,pageSize,fields,sortBy);
    }

    @GetMapping("/countpage")
    public Map<String,Object> countPage()
    {
        return bs.countPage();
    }

    @GetMapping("/category")
    public Map<String,Object> getByCategory(@RequestParam(value = "category",required = true) String[] cat)
    {
        return bs.getByCategory(cat);
    }


}


