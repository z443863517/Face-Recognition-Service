package com.face.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	/**
	 * 需求:跳转注册页面
	 */
	@RequestMapping("/page/register")
	public String showRegister(){
		return "register";
	}
	/**
	 * 需求：跳转登录页面
	 */
	@RequestMapping("/page/login")
	public String showLogin(){
		return "login";
	}
}

