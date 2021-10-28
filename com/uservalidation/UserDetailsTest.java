package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;
	 @Test
	    void givenNumberWithoutCC_CheckForValidation_ReturnFalse() {
	        UserDetail userDetails = new UserDetail();
	        boolean result = userDetails.validateMobileNumber("8917341746");
	        Assertions.assertFalse(result);
	    }
}
