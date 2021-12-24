package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;


public class ListController implements Controller {

	private NoticeService noticeService;
	
	public NoticeService getNoticeService() {
		return noticeService;
	}

	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@Override	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("notice.list"); // "/"에서 "."으로 바꾸면 tiles에서 처리해줌
		//mv.addObject("data", "Hello Spring MVC");
		//mv.setViewName("notice/list");
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);
		return mv;
	}

	
	
	

	
	
	
}
