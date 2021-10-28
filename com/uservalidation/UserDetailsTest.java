package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;

	   @Test
	   public void givenEmailWhenShouldReturnTrue(){
		   UserDetail userDetails = new UserDetail();
	         boolean testStatus = userDetails.gMail("smruti.lenka@gsdg.com.in");
	         Assert.assertTrue(testStatus);
	   }
}
