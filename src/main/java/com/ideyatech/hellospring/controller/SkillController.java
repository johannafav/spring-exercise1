package com.ideyatech.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideyatech.hellospring.entity.Skill;

@Controller
public class SkillController {
	@ModelAttribute(name = "skill")
	public Skill newSkill() {
		return new Skill();
	}
	
	@RequestMapping(value ="/skills")
	public String skillForm() {
		return "skills";
	}
}
