package com.newlecture.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("notice.detail"); // "/"에서 "."으로 바꾸면 tiles에서 처리해줌
		//mv.addObject("data", "Hello Spring MVC");
		//mv.setViewName("notice/detail");
		return mv;
		//...
	}

}
