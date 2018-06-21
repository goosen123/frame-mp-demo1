package com.goosen1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goosen1.service.UserService;

/**
 * 用户Controller
 * @author Goosen
 * @version 2018-05-08
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {
	
	protected Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = {"list"})
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了<<<<<<<<<<<<<<<<<<<<");
		
		return "modules/test/success";
	}
	
	@RequestMapping(value = {"sayHello"})
	public String sayHello(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了mg的sayHello<<<<<<<<<<<<<<<<<<<<");
		
		String words = userService.sayHello("hello!");
		log.info("say:" + words);
		
		return "modules/test/success";
	}
	
	@RequestMapping(value = {"loginhtml"})
	public String loginhtml(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了<<<<<<<<<<<<<<<<<<<<");
		model.addAttribute("ctxPath","/frame-mp-demo1");
		model.addAttribute("name","Goosen1");
		
		return "login";
	}
	
	@RequestMapping(value = {"hello"})
	public String hello(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了beetl的hello<<<<<<<<<<<<<<<<<<<<");
		
		return "/user/hello";
	}
	
	@RequestMapping(value = {"hello2"})
	public String hello2(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了beetl的hello2<<<<<<<<<<<<<<<<<<<<");
		model.addAttribute("name","Goosen1");
		
		model.addAttribute("ifflag","1");
		
		return "/user/hello";
	}
	
	@RequestMapping(value = {"index"})
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了beetl的index<<<<<<<<<<<<<<<<<<<<");
		
		return "index";
	}
	
	@RequestMapping(value = {"addDict"})
	public String addDict(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了beetl的addDict<<<<<<<<<<<<<<<<<<<<");
		
		return "/system/dict/dict_add";
	}
	
	@RequestMapping(value = {"dict"})
	public String dict(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		log.info("进来了beetl的dict<<<<<<<<<<<<<<<<<<<<");
		
		return "/system/dict/dict";
	}
	
}
