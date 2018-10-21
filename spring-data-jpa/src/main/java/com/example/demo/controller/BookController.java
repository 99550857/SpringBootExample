package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.impl.BookServerImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 99550 on 2018/9/20.
 */
@Controller
@RequestMapping(value = "/books")
public class BookController {

    private static final String BOOK_DETAIL_PATH_NAME = "bookDetail";
    private static final String BOOK_LIST_PATH_NAME = "bookList";

    @Resource
    private BookService bookService;

//    @GetMapping("/getAll")
//    private List<Book> getAllBooks(){
//       return bookService.getAll();
//    }
//
//    @GetMapping("/{id}")
//    private Book getBookById(Integer id){
//        return bookService.get(id);
//    }

    @GetMapping("/all")
    public String getAll(ModelMap model) {

        model.addAttribute("booksList", bookService.getAll());
        return BOOK_LIST_PATH_NAME;
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable Integer id, ModelMap modelMap) {
        Book book = bookService.get(id);
        modelMap.addAttribute("book", book);
        return BOOK_DETAIL_PATH_NAME;
    }


}
