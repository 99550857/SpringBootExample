package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

/**
 * Created by 99550 on 2018/9/20.
 */

public interface BookService {
    List<Book> getAll();

    Book save(Book book);

    Book get(Integer id);


}
