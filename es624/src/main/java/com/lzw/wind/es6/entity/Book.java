package com.lzw.wind.es6.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "book", type = "java")
@Data
public class Book {

    @Id
    @Field(type = FieldType.Text)
    private String id;

    private String name;

    private String describe;
}
