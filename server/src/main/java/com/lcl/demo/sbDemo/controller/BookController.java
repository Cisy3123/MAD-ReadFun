package com.lcl.demo.sbDemo.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcl.demo.sbDemo.dao.UserMapperProvider;
import com.lcl.demo.sbDemo.entity.Book;
import com.lcl.demo.sbDemo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lcl.demo.sbDemo.other.annotation.MyAnnotation;
import com.lcl.demo.sbDemo.other.util.MyFileUtil;
import com.lcl.demo.sbDemo.service.*;

@Controller
@RequestMapping("/Book")
public class BookController {
	@Autowired
	private BookServiceImpl bookService;

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public Book detail(@RequestParam Long id) {
		//bookService =new BookServiceImpl();
		Book book = bookService.getDataById(id);
		return book;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> search(@RequestParam String keyword) {
		List<Book> bookList = bookService.selectByLikeTitle(keyword);
		return bookList;
	}
	
//	@Value("${uploadPath}")
//	String uploadPath;
//
//	@Resource
//	BookService bookService;
//
//	@RequestMapping("/index")
//	public Object hello(String name){
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userList", bookService.getDatas(name));
//		mv.addObject("name", name);
//		mv.setViewName("user");
//		return mv;
//	}
//
//	@RequestMapping("/user/userList.admin")
//    @ResponseBody
//    public List<Map<String,Object>> userList(String name){
//		UserMapperProvider bookService;
//		return bookService.getDatas(name);
//	}
//
//	@RequestMapping("/user/uploadUserPage")
//	public Object uploadUser(){
//		return "upload";
//	}
//
//	@RequestMapping("/user/uploadUser")
//    @ResponseBody
//	@MyAnnotation(operate="根据模板批量添加用户")
//    public Object uploadUser(@RequestParam("excel") MultipartFile file,
//            HttpServletRequest request) {
//    	ModelMap resultMap = new ModelMap();
//    	if(file!=null && !file.isEmpty()){
//    		String msg = "SUCCESS";
//            String fileName = file.getOriginalFilename();
////            String filePath = "C:\\Users\\Administrator\\Desktop\\test\\upload\\img\\";
//            String filePath = uploadPath+"excel"+File.separator;
//            try {
//                MyFileUtil.uploadFile(file.getBytes(), filePath, fileName);
//                //根据上传的excel解析出用户信息，并添加至数据库，此处略。
//            } catch (Exception e) {
//            	msg = e.getMessage();
//            }
//            resultMap.put("msg", msg);
//    	}
//        return resultMap;
//    }
//
//	@RequestMapping("/user/downUser")
//	@MyAnnotation(operate="下载用户模板")
//	public void downUser(HttpServletResponse response){
//        try{
//            MyFileUtil.fileDownload(response,uploadPath+"excel"+File.separator+"userTemplate.xls","user.xls");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
	
}
