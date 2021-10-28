package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserDetail {
	 public boolean passwordTest(String password) {
	        boolean matchesString = Pattern.matches("^[A-Za-z0-9]{8,}$",password);
	        return matchesString;
	    }
	}