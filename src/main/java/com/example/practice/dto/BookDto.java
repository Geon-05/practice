package com.example.practice.dto;

import lombok.Data;

@Data
public class BookDto {
    // 명명한 대소문자 확인 필수!!
    private String  book_no;
    private String  title;
    private String  author;
    private int     price;
    private String  pub_no;
    private String  rentyn;
    private String  delyn;
    private String  regdate;
    
}
