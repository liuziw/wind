package com.lzw.wind.es6.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Data
@Document(indexName = "user", type = "student")
public class User {

    @Id
    private String id;

    private String name;

    @Field
    private String age;

    private String interest;
}
