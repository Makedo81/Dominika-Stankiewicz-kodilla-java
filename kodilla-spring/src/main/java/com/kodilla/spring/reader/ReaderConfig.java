package com.kodilla.spring.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ReaderConfig {
    @Autowired
    Book book;

    @Bean
    public Reader getReader() {
        return new Reader(book);
    }

    @Bean(name = "book1")
    @Scope("prototype")
    public Book getBookOne() {
        return new Book ("The book number one");
    }
}
