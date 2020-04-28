package com.lzw.wind.es6.controller;

import com.google.common.collect.Lists;
import com.lzw.wind.es6.entity.User;
import com.lzw.wind.es6.service.UserRepository;
import org.apache.lucene.search.Query;
import org.elasticsearch.common.io.stream.StreamOutput;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryShardContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("findById")
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("searchMatch")
    public List<User> searchMatch(String word) {
        Iterable<User> userIterable = userRepository.search(QueryBuilders.matchQuery("interest", word));
        return Lists.newArrayList(userIterable);
    }

    @GetMapping("searchRange")
    public List<User> searchRange(Integer from, Integer to) {
        Iterable<User> userIterable = userRepository.search(QueryBuilders.rangeQuery("age").gt(from).lt(to));
        return Lists.newArrayList(userIterable);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        Iterable<User> elements = userRepository.findAll();
        ArrayList<User> list = Lists.newArrayList(elements);
        return list;
    }

    @GetMapping("/delete/{id}")
    public String remove(@PathVariable(name="id") String id) {
        userRepository.deleteById(id);
        return "success";
    }
}
