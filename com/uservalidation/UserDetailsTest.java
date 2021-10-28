package com.uservalidation;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import org.junit.jupiter.api.Assertions;

public class UserDetailsTest {
	 @Test
	   public void givenNameWhenPropershouldReturnTrue(){
		 UserDetailsTest userDetails = new UserDetailsTest();
	         boolean testStatus = userDetails.lastName("Lenka");
	         Assert.assertTrue(testStatus);
	   }
