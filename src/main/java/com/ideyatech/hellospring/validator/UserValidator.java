package com.ideyatech.hellospring.validator;

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
		
		System.out.println("validate");
	}

}