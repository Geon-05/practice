package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.practice.dto.BookDto;
import com.example.practice.mapper.BookMapper;
import com.example.practice.service.BookService;

@Controller
@Slf4j
public class BookController {
    @GetMapping("/")
    public String getIndex() {
        log.info("/index - Calling");
        return "index";
    }

    @Autowired
    BookMapper mapper;
    
    @Autowired
    BookService service;

    @GetMapping("/hello")
    public String getHello(Model model) {
        String date = mapper.selectDate();
        model.addAttribute("date", date);
        return "hello";
    }

    @GetMapping("/bookDetail")
    public String getBookDetail() {
        log.info("/book/bookDetail - Calling");
        return "/book/bookDetail";
    }

    @GetMapping("/bookEdit")
    public String getBookEdit() {
        log.info("/book/bookEdit - Calling");
        return "/book/bookEdit";
    }

    @GetMapping("/bookList")
    public String getBookList() {
        log.info("/book/bookList - Calling");
        return "/book/bookList";
    }

    @GetMapping("/book")
    public String getMethodName(
        @RequestParam(required = false, name = "b_no") String no
        , Model model) {
            log.info(no+"======================");
            BookDto book = service.selectBook(no);
            model.addAttribute("book", book);
        return "newBook";
    }

}
