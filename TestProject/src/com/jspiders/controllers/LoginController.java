package com.jspiders.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login/{email}/{pwd}")
	public ModelAndView trylogin(@PathVariable("email") String email, @PathVariable("pwd") String pwd) {
		ModelAndView m1 = new ModelAndView("Login");

		m1.addObject("msg", "trylogin()->" + email + " " + pwd);
		return m1;
	}

	@RequestMapping("/signin/{email}/{pwd}")
	public ModelAndView trySignIn(@PathVariable Map<String, String> pathvars) {
		String email = pathvars.get("email");
		String pwd = pathvars.get("pwd");
		ModelAndView m1 = new ModelAndView("Login");

		m1.addObject("msg", "trySignIn()-> " + email + " " + pwd);
		return m1;
	}

}
