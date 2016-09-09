package com.ideyatech.hellospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SKILL")
public class Skill extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name="SKILL")
	private String skill;
	
	@Column(name="RATING")
	private int skillLevel;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
}
