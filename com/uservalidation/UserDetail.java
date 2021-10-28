package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserDetail {
	 private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@]{1}[a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z]{3})*$";
	    public boolean gmailTest(String password) {
	        boolean matchesString = Pattern.matches(EMAIL_PATTERN,password);
	        return matchesString;
	    }
	}