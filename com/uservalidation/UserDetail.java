package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserDetail {
	public boolean passwordTest(String password) {
        boolean matchesString = Pattern.matches("^[A-Za-z]{8,}$", password);
        return matchesString;
    }
}
    