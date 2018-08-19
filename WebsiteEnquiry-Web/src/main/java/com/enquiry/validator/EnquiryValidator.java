package com.enquiry.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.enquiry.model.UsersQueries;

@Component
public class EnquiryValidator {

	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String ID_PATTERN = "[0-9]+";
	String STRING_PATTERN = "[a-zA-Z]+";
	String MOBILE_PATTERN = "[0-9]{10}";

	public boolean supports(Class<?> clazz) {
		return UsersQueries.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		UsersQueries user = (UsersQueries) target;
		ValidationUtils.rejectIfEmpty(errors, "name", "error.name.empty", "Name is required.");
		ValidationUtils.rejectIfEmpty(errors, "contactNumber", "error.contactNumber.empty",
				"ContactNumber is required.");
		ValidationUtils.rejectIfEmpty(errors, "email", "error.email.empty", "Email is required.");
		ValidationUtils.rejectIfEmpty(errors, "profession", "error.profession.empty", "Please select a profession.");
		ValidationUtils.rejectIfEmpty(errors, "comment", "error.comment.empty", "Comment is Required.");
		ValidationUtils.rejectIfEmpty(errors, "promotional_Information", "error.promotional_Information.empty",
				"Please Select atleast one interest.");

		if (user.getName() != null && user.getName() != "") {
			pattern = Pattern.compile(STRING_PATTERN);
			matcher = pattern.matcher(user.getName());
			if (!matcher.matches()) {
				errors.rejectValue("name", "error.name.length", "Enter Correct Name");
			}
		}

		if (user.getContactNumber() != null && user.getContactNumber() != "") {
			pattern = Pattern.compile(MOBILE_PATTERN);
			matcher = pattern.matcher(user.getContactNumber());
			if (!matcher.matches()) {
				errors.rejectValue("contactNumber", "contactNumber.incorrect", "Enter a correct Contact Number");
			}
		}

		if (!(user.getEmail() != null && user.getEmail().isEmpty())) {
			pattern = Pattern.compile(EMAIL_PATTERN);
			matcher = pattern.matcher(user.getEmail());
			if (!matcher.matches()) {
				errors.rejectValue("email", "email.incorrect", "Enter a correct email");
			}
		}
	}

}
