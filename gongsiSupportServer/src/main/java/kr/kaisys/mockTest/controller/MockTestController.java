package kr.kaisys.mockTest.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import kr.kaisys.mockTest.service.MockTestService;

@Controller
public class MockTestController {
	
	@Autowired
	MockTestService service;
	
	
	@RequestMapping("/getOneMockTest")
	@ResponseBody
	public Map<String,String> mockTestMapper(HttpServletRequest request) throws IOException {
		String id = (String) request.getParameter("id");
		String pwd = (String) request.getParameter("pwd");
		
		String title = (String) request.getParameter("title");
		String memo = (String) request.getParameter("memo");
		
		System.out.println(id + " : " + pwd + " : " + title + " : " + memo);
		System.out.println(service.getOneMockTest());
		Map<String,String> map = new HashMap<>();
		map.put("param", "param");
		return map;
	}
}
