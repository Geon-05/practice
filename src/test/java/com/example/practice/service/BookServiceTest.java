package com.example.practice.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    BookService service;

    @Test
    void testSelectBook() {
        service.selectBook("B00001");
    }
}
