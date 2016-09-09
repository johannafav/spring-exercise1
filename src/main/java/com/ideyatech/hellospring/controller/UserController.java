package com.ideyatech.hellospring.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ideyatech.hellospring.entity.User;
import com.ideyatech.hellospring.repository.UserRepository;
import com.ideyatech.hellospring.validator.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserValidator userValidator;
	
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
	
//	@RequestMapping(value="/list")
//	public String getEmployeeList(ModelMap model) {
//		List<Employee> employees = employeeRepository.findAll();
//		model.addAttribute("employees", employees);
//		return "employee-list";
//	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		binder.addValidators(userValidator);
	}
	
	@RequestMapping(value="/registration/{id}", produces = {"application/json"})
	public @ResponseBody String getUser(@PathVariable("id") Long id, ModelMap map) {
		System.out.println(id);
		User u = (User) userRepository.findOne(id);
		map.addAttribute("firstname",u.getFirstname());
		return u.toString();
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public ModelAndView submitForm(@Valid @ModelAttribute User user, BindingResult bindingResult, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {	

		if(bindingResult.hasErrors()){
			return new ModelAndView("/user-form");
		}
		else{
			userRepository.save(user);
			List<User> users = userRepository.findAll();
			map.addAttribute("users", users);
			if(user.getRole().equals("Admin")) return new ModelAndView("user-list");
			else return new ModelAndView("redirect:/skills");
//			if(user.getRole().equals("User")) return new ModelAndView("redirect:/skills");
//			else return new ModelAndView("/user-form");
		}
	
	}
}
