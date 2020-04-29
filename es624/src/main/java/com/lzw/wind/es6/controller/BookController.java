package com.lzw.wind.es6.controller;

import com.google.common.collect.Lists;
import com.lzw.wind.es6.entity.Book;
import com.lzw.wind.es6.service.BookRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Book add(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("findById")
    public Book findById(String id) {
        return bookRepository.findById(id).get();
    }

    @GetMapping("searchMatch")
    public List<Book> searchMatch(String word) {
        Iterable<Book> userIterable = bookRepository.search(QueryBuilders.matchQuery("describe", word));
        return Lists.newArrayList(userIterable);
    }

    @GetMapping("/findAll")
    public List<Book> findAll(){
        Iterable<Book> elements = bookRepository.findAll();
        ArrayList<Book> list = Lists.newArrayList(elements);
        return list;
    }
}
