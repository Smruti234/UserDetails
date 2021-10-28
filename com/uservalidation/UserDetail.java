package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetail {
    	public boolean lastName(String name) {
            boolean mathPattern = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,15}$", name);
            return mathPattern;
        }
    }
    
    