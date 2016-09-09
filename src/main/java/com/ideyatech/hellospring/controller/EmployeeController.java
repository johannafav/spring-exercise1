//package com.ideyatech.hellospring.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.ideyatech.hellospring.entity.Employee;
//
//@Controller
//public class EmployeeController {
//	
//	@ModelAttribute(name = "employee")
//	public Employee initialEmployee() {
//		return new Employee();
//	}
//	
//	@RequestMapping(value ="/employee")
//	public String employeeForm() {
//		return "employee-form";
//	}
//	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
//	}
//	
//	@RequestMapping(value="/employee", method = RequestMethod.POST)
//	public String submitForm(@ModelAttribute Employee employee, ModelMap map,
//			HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("SUBMITTED");
//		System.out.println("SUBMITTED EMPLOYEE " + employee);
//		map.addAttribute("message", "Saving Success");
//	
//		return "employee-success";
//	}
//
//}
