package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;
	 @Test
	   public void givenPasswordShouldReturnTrue(){
		 UserDetail userDetails = new UserDetail();
	         boolean testStatus = userDetails.passwordTest("7504614661");
	         Assert.assertTrue(testStatus);
	   }
	}
