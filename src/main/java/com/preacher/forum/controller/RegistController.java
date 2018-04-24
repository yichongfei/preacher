package com.preacher.forum.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistController {
	
	@RequestMapping("/RegisterAccount")
	public void registerAccount(HttpServletRequest request,HttpServletResponse response) {
		Map<String, String[]> parameterMap = request.getParameterMap();
	}
	
	
}
