package kr.kaisys.mockTest.service;

import org.springframework.stereotype.Service;

@Service
public class MockTestServiceImpl implements MockTestService{

	@Override
	public String getOneMockTest() {
		return "Service Work";
	}
	
	
}
