package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;
	 @Test
	   public void givenPasswordShouldReturnTrueWhenSpecialCharaterhaveAnyOne(){
	      UserDetail userDetails = new UserDetail();
	         boolean testStatus = userDetails.passwordTest("Chinku@1234");
	         Assert.assertTrue(testStatus);
	   }
	}