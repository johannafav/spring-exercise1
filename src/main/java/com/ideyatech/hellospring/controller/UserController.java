package com.ideyatech.hellospring.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ideyatech.hellospring.entity.User;

@Controller
public class UserController {
	
	@ModelAttribute(name = "user")
	public User newUser() {
		return new User();
	}
	
	@RequestMapping(value="/")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value ="/registration")
	public String userForm() {
		return "user-form";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute User user, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		map.addAttribute("firstname", user.getFirstname());
		map.addAttribute("middlename", user.getMiddlename());
		map.addAttribute("lastname", user.getLastname());
		map.addAttribute("email", user.getEmail());
		map.addAttribute("password", user.getPassword());
		map.addAttribute("role", user.getRole());
		
		if(user.getRole().equals("User")) return new ModelAndView("redirect:/skills");
		else return new ModelAndView("/user-form");
	
	}
}
