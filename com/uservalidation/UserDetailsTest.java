package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;

	   @Test
	   public void givenEmailWhenShouldReturnTrue(){
		   UserDetailsTest userDetails = new UserDetailsTest();
	         boolean testStatus = userDetails.gMail("smruti.lenka@gsdg.com.in");
	         Assert.assertTrue(testStatus);
	   }
}
