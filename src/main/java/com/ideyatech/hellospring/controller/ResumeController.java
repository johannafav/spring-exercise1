package com.ideyatech.hellospring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ideyatech.hellospring.entity.Resume;

@Controller
public class ResumeController {
	@ModelAttribute(name = "resume")
	public Resume newResume() {
		return new Resume();
	}
	
	@RequestMapping(value = "/resume")
	public String resumeForm() {
		return "resume-form";
	}
	
	@RequestMapping(value="/resume", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute Resume resume, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SUBMITTED");
		System.out.println("SUBMITTED RESUME " + resume);
		map.addAttribute("message", "Saving Success");
	
		map.addAttribute("firstname", resume.getFirstname());
		map.addAttribute("middlename", resume.getMiddlename());
		map.addAttribute("lastname", resume.getLastname());
		map.addAttribute("birthdate", resume.getBirthdate());
		map.addAttribute("nationality", resume.getNationality());
		map.addAttribute("address", resume.getAddress());
		map.addAttribute("email", resume.getEmail());
		
		map.addAttribute("personalBgColor", resume.getPersonalBgColor());
		map.addAttribute("personalHeaderFontName", resume.getPersonalHeaderFontName());
		map.addAttribute("personalHeaderFontSize", resume.getPersonalHeaderFontSize());
		map.addAttribute("personalInfoFontName", resume.getPersonalInfoFontName());
		map.addAttribute("personalInfoFontSize", resume.getPersonalInfoFontSize());
		
		return "resume-submit";
	}
}
