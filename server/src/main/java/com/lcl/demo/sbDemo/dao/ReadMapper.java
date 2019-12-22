package com.lcl.demo.sbDemo.dao;

import com.lcl.demo.sbDemo.entity.Read;
import com.lcl.demo.sbDemo.entity.ReadKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReadMapper {
    int deleteByPrimaryKey(ReadKey key);

    int insert(Read record);

    int insertSelective(Read record);

    Read selectByPrimaryKey(ReadKey key);

    int updateByPrimaryKeySelective(Read record);

    int updateByPrimaryKey(Read record);
}