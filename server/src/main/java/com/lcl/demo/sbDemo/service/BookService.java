package com.lcl.demo.sbDemo.service;

import com.lcl.demo.sbDemo.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

	Book getDataById(Long id);


	List<Book> selectByLikeTitle(String  keyword);

	//List<Map<String, Object>> getDatasByName(String name);

}
