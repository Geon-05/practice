package com.example.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dto.BookDto;
import com.example.practice.mapper.BookMapper;

@Service
public class BookService {
    @Autowired
    BookMapper mapper;

    public BookDto selectBook(String b_no){
        return mapper.selectBook(b_no);
    }
}
