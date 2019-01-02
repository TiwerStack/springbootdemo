package com.xx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/**
	 * 测试
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		
		return "你好 ！my name is springboot";
	}
}
