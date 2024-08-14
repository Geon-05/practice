package com.example.practice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.practice.dto.BookDto;

@Mapper
public interface BookMapper {

    @Select("select to_char(sysdate, 'yyyy-mm-dd') from dual")
    String selectDate();

    BookDto selectBook(String b_no);
}
