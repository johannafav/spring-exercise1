package com.ideyatech.hellospring.entity;

public class Resume {
	private String firstname, middlename, 
					lastname, birthdate,
					nationality, address, email;
	
	private String personalInfoFontName, personalInfoFontSize;
	private String personalHeaderFontName, personalHeaderFontSize;
	private String personalBgColor;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonalInfoFontName() {
		return personalInfoFontName;
	}

	public void setPersonalInfoFontName(String personalInfoFontName) {
		this.personalInfoFontName = personalInfoFontName;
	}

	public String getPersonalInfoFontSize() {
		return personalInfoFontSize;
	}

	public void setPersonalInfoFontSize(String personalInfoFontSize) {
		this.personalInfoFontSize = personalInfoFontSize;
	}

	public String getPersonalHeaderFontName() {
		return personalHeaderFontName;
	}

	public void setPersonalHeaderFontName(String personalHeaderFontName) {
		this.personalHeaderFontName = personalHeaderFontName;
	}

	public String getPersonalHeaderFontSize() {
		return personalHeaderFontSize;
	}

	public void setPersonalHeaderFontSize(String personalHeaderFontSize) {
		this.personalHeaderFontSize = personalHeaderFontSize;
	}

	public String getPersonalBgColor() {
		return personalBgColor;
	}

	public void setPersonalBgColor(String personalBgColor) {
		this.personalBgColor = personalBgColor;
	}

}
