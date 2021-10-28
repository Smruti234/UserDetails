package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;
	  @Test
	   public void givenPasswordShouldReturnTrue(){
		  UserDetailsTest userDetails = new UserDetailsTest();
	         boolean testStatus = userDetails.passwordTest("chinku");
	         Assert.assertTrue(testStatus);
	   }
	}