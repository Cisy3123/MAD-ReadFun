package com.lcl.demo.sbDemo.dao;

import com.lcl.demo.sbDemo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Long bookId);
    //@Param("keyword") 定义 mybatis识别变量名 #{keyword}

    List<Book> selectByLikeTitle(@Param("keyword") String  keyword);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}