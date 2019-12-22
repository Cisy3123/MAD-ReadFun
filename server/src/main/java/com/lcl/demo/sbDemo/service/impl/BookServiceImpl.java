package com.lcl.demo.sbDemo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.lcl.demo.sbDemo.entity.Book;
import org.springframework.stereotype.Service;

import com.lcl.demo.sbDemo.dao.BookMapper;
import com.lcl.demo.sbDemo.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Resource
	private BookMapper bookMapper;

    /*@Override
    public List<Map<String, Object>> getDatasByName(String name) {
        return bookMapper.getDatasByName(name);
    }*/

    @Override
	public Book getDataById(Long id) {
		return bookMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Book> selectByLikeTitle(String keyword) {
		return bookMapper.selectByLikeTitle(keyword);
	}

}
