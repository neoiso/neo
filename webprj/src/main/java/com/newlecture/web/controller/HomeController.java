package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.mvc.Controller; //어노테이션이라 필요없음 자동정리 안됨

@Controller
@RequestMapping("/")
public class HomeController {

//	@RequestMapping("index")
//	public String index() {
//		return "root.index";
//	}
	
	//뷰 없이 출력하는 방법
//	@RequestMapping("index")
//	public void index(HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		out.println("Hello Index");
//	}
	
	@RequestMapping("index")
	@ResponseBody  //뷰없이 출력하는 방법2
	public String index() {
		return "Hello Index2";
	}
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC");
//		//mv.setViewName("index");
//		return mv;
//	}
	
	
	
	

}
