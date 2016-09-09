package com.ideyatech.hellospring.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ideyatech.hellospring.entity.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> klass) {
		return User.class.isAssignableFrom(klass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", 
				"error.required", new Object[]{"First Name"});
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", 
				"error.required", new Object[]{"Last Name"});
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthdate", 
				"error.emptyOrWrongFormat", new Object[]{"Birthdate"});
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", 
				"error.required", new Object[]{"Email"});
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", 
				"error.required", new Object[]{"Password"});
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", 
				"error.required", new Object[]{"Confirm Password"});
		
		if(!errors.getFieldValue("password").equals(errors.getFieldValue("confirmPassword"))) {
			errors.rejectValue("confirmPassword", "error.passwordMismatch");
		}
		
		if(!validEmail((String)errors.getFieldValue("email"))) {
			errors.rejectValue("email", "error.invalid-email-format");
		}
		
		System.out.println("validate");
	}
	
	public boolean validEmail(String email) {
		Matcher matcher = 
				Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(email);
		return matcher.find();
	}

}
