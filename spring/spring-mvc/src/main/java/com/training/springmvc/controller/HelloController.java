package com.training.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.springmvc.service.LoginService;

@Controller

public class HelloController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView displayHello() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/processLogin", method = RequestMethod.POST)
	public String validateUser(ModelMap map, HttpServletRequest request) {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		if(service.validateUser(userName, password)) {
			map.addAttribute("name",userName);
			return "home";
		}
		else {
			return "fail";
		}
		
	}

}
