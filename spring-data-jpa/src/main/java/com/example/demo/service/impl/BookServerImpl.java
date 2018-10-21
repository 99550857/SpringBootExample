package com.example.demo.service.impl;

import com.example.demo.dao.BookRepository;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 99550 on 2018/9/20.
 */
@Service
public class BookServerImpl implements BookService {
    @Resource
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book get(Integer id) {
        return bookRepository.findById(id).get();
    }
}
