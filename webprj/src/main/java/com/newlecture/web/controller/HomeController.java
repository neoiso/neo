package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.Controller; //어노테이션이라 필요없음 자동정리 안됨

@Controller
@RequestMapping("/")
public class HomeController {

//	@RequestMapping("index")
//	public String index() {
//		return "root.index";
//	}
	
	@RequestMapping("index")
	public void index(HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello Index");
		//return "root.index";
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
