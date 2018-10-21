package com.example.demo.service;

import com.example.demo.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 99550 on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {
    @Resource
    private BookService bookService;

    @Test
    public void save() throws Exception {
        Book book = new Book();
        book.setDetail("1233212");
        book.setName("qew12321");
        book.setCover("ijidsanj");
        book.setPrice(25.23);
        book.setAuthor("xin");
        bookService.save(book);
    }

}