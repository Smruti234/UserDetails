package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {
	 private Assertions Assert;
	 @Test
	   public void givenFirstNameWhenPropershouldReturnTrue() {
	      UserDetail userDetails = new UserDetail();
	      boolean testStatus = userDetails.firstName("Smruti");
	      Assert.assertTrue(testStatus);
	   }

	   @Test
	   public void givenLastNameWhenPropershouldReturnTrue() {
	      UserDetail userDetails = new UserDetail();
	      boolean testStatus = userDetails.lastName("Lenka");
	      Assert.assertTrue(testStatus);
	   }

	   @Test
	   public void givenPasswordShouldReturnTrueWhenSpecialCharaterhaveAnyOne() {
	      UserDetail userDetails = new UserDetail();
	      boolean testStatus = userDetails.passwordTest("Smruti@345");
	      Assert.assertTrue(testStatus);
	   }

	   @Test
	   public void givenEmailShouldReturnTrueWhenalltheConditionSatisfied() {
	      UserDetail userDetails = new UserDetail();
	      boolean testStatus = userDetails.gmailTest("Smruti@gdf567");
	      Assert.assertTrue(testStatus);
	   }

	   @Test
	   public void givenMessageShouldReturnSadWhenTestIsPassed(){
	      MoodAnalyser mood =  new MoodAnalyser();
	      String testStatus = mood.messageContainHappyReturnHappyElseSad("This is Sad message");
	      Assert.assertEquals("Sad",testStatus);
	   }
	}