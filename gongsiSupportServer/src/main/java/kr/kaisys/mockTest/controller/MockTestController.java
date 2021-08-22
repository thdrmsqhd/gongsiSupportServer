package kr.kaisys.mockTest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kaisys.mockTest.service.MockTestService;

@Controller
public class MockTestController {
	
	@Autowired
	MockTestService service;
	
	
	@RequestMapping("/getOneMockTest")
	public void mockTestMapper(HttpServletRequest request) throws IOException {
		String id = (String) request.getParameter("id");
		String pwd = (String) request.getParameter("pwd");
		
		String title = (String) request.getParameter("title");
		String memo = (String) request.getParameter("memo");
		
		System.out.println(request.getAttributeNames());
		System.out.println(request.getInputStream().toString());
		
		System.out.println(id + " : " + pwd + " : " + title + " : " + memo);
		System.out.println(service.getOneMockTest());
	}
}
