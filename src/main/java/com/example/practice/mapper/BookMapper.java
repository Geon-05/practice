package com.example.practice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {

    @Select("select to_char(sysdate, 'yyyy-mm-dd') from dual")
    String selectDate();
}
