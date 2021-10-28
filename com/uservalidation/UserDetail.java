package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetail {
	 private final static String MOBILE_NUMBER = "^(\\d{2})( )([6-9]{1})(\\d{9})";
	    public boolean validateMobileNumber(String mobileNumber){
	        Pattern pattern = Pattern.compile(MOBILE_NUMBER);
	        return pattern.matcher(mobileNumber).matches();
	    }

	}