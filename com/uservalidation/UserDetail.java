package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserDetail {
	 private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@]{1}[a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z]{3})*$";
	    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{3,15}$";
	    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{3,15}$";
	    private static final String MOBILE_NO_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";
	    private static final String PASSWORD_PATTERN = "([!@#$%^&*()]?[A-Za-z0-9]+){8,}$";

	    public boolean firstName(String firstName) {
	        boolean mathPattern = Pattern.matches(FIRST_NAME_PATTERN, firstName);
	        return mathPattern;
	    }

	    public boolean lastName(String lastName) {
	        boolean mathPattern = Pattern.matches(LAST_NAME_PATTERN, lastName);
	        return mathPattern;
	    }

	    public boolean mobileNumber() {
	        boolean matchesString = Pattern.matches(MOBILE_NO_PATTERN, "7504614661");
	        return matchesString;
	    }

	    public boolean passwordTest(String password) {
	        boolean matchesString = Pattern.matches(PASSWORD_PATTERN, password);
	        return matchesString;
	    }
	    public boolean gmailTest(String email) {
	        boolean matchesString = Pattern.matches(EMAIL_PATTERN, email);
	        return matchesString;
	    }

		public String messageContainHappyReturnHappyElseSad(String string) {
			// TODO Auto-generated method stub
			return null;
		}
}