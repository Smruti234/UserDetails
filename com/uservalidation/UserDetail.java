package com.uservalidation;

import java.util.regex.Pattern;

public class UserDetail {
    private final static String FirstName = "([A-Z]{1}[a-zA-Z]{2,})$";

    public boolean validateFirstName(String fName){
        Pattern pattern = Pattern.compile(FirstName);
        return pattern.matcher(fName).matches();
    }
}