package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetail {
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@]{1}[a-zA-Z0-9]+[.a-z]{3,4}([.a-zA-Z]{3})*$";

    public static boolean gmailTest(String email, boolean actualValue) {
        boolean matchesString = Pattern.matches(EMAIL_PATTERN, email);
        if(matchesString == actualValue)
            return actualValue;
        else
            return false;
    }
}