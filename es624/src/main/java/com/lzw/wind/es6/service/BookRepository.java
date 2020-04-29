package com.lzw.wind.es6.service;

import com.lzw.wind.es6.entity.Book;
import com.lzw.wind.es6.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
}
