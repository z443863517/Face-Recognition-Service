package com.face.www.controller;

import com.face.www.domain.User;
import com.face.www.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	//注入Service对象
	@Autowired
	private IUserService userService;
	
	/**
	 * 需求：根据分类Id查询此分类内容信息
	 * 请求：/content/query/list
	 * 参数：Long categoryId,Integer page,Integer rows
	 * 返回值：EasyUIPageHelper
	 * 思考：引入服务
	 */
//	@RequestMapping("/face/v1/login")
//	@ResponseBody
//	public EasyUIPageHelper findContentByCategoryID(Long categoryId,Integer page,Integer rows){
//		EasyUIPageHelper pageHelper = contentService.findContentByCategoryID(categoryId, page, rows);
//		return pageHelper;
//	}
//
//	/**
//	 * 需求：保存分类内容
//	 * 请求：/content/save
//	 * 参数：TbContent content
//	 * 返回值:E3mallResult
//	 */
//	@RequestMapping("/content/save")
//	@ResponseBody
//	public E3mallResult saveContent(TbContent content){
//		//调用远程Service服务对象方法进行保存内容
//		E3mallResult result = contentService.saveContent(content);
//
//		return result;
//
//	}
	@RequestMapping("/face/v1/login")
	@ResponseBody
	public User findUserByID(Long userID){
		//EasyUIPageHelper pageHelper = contentService.findContentByCategoryID(categoryId, page, rows);
		return null;
	}
}
