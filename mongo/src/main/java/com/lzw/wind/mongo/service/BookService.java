package com.lzw.wind.mongo.service;

import com.lzw.wind.mongo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class BookService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 保存对象
     * @param book
     * @return
     */
    public String saveObj(Book book) {
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        mongoTemplate.save(book);
        return "添加成功";
    }

    /**
     * 查询所有
     * @return
     */
    public List<Book> findAll() {
        return mongoTemplate.findAll(Book.class);
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book getBookById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, Book.class);
    }

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    public Book getBookByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query, Book.class);
    }

    /**
     * 更新对象
     * @param book
     * @return
     */
    public String updateBook(Book book) {
        Query query = new Query(Criteria.where("id").is(book.getId()));
        Update update = new Update().set("publish", book.getPublish()).set("info", book.getInfo()).set("updateTime", book.getUpdateTime());
        // updateFirst 更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Book.class);
        // updateMulti 更新查询返回结果集的全部
        // mongoTemplate.updateMulti(query,update,Book.class);
        // upsert 更新对象不存在则去添加
        // mongoTemplate.upsert(query,update,Book.class);
        return "success";
    }

    /**
     * 删除对象
     * @param book
     * @return
     */
    public String deleteBook(Book book) {
        mongoTemplate.remove(book);
        return "success";
    }

    public String deleteBookById (String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query, Book.class);
        return "success";
    }

    /**
     * 模糊查询
     * @param search
     * @return
     */
    public List<Book> findByLikes(String search) {
        Criteria criteria = new Criteria();
        Query query = new Query(criteria);
//        criteria.where("name").regex(search);
        Pattern pattern = Pattern.compile("^.*" + search + ".*$" , Pattern.CASE_INSENSITIVE);
        criteria.where("name").regex(pattern);
        List<Book> bookList = mongoTemplate.findAllAndRemove(query, Book.class);
        return bookList;
    }

}
