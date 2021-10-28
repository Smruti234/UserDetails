package com.uservalidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class UserDetailsTest {
	 private  UserDetail validator;
	   private static String emailPattern;
	   private static boolean expectedResult;

	   public void UserDetail(String emailPattern, boolean expectedResult){
	      this.emailPattern = emailPattern;
	      this.expectedResult = expectedResult;
	   }

	   @Before
	   public void insilized(){
	      validator = new UserDetail();
	   }
	   @Parameterized.Parameters(name= "{index}: isValid({0})={1}")
	   public static Iterable<Object[]> data() {
	      return Arrays.asList(new Object[][]{
	                      {"abc-100@yahoo.com", true},
	                      {"abc.100@yahoo.com", true},
	                      {"abc111@gmail.com", true},
	                      {"abc-100@abc.com", true},
	                      {"abc-100@abc.com", true},
	                      {"abc@gmail.com.com", true},
	                      {"abc@gmail.com.com", true},
	                      {"abc@1.com", true},
	                      {"abc+100@gmail.com", true},
	                      {"abc", false},
	                      {".abc+100@gmail.com", false},
	                      {"abc+100@gmail.com", false},
	                      {"abc+100@gmail.a", false},
	                      {"abc+100@.gmail.com", false},
	                      {"abc+100*()@gmail.com", false}
	              }
	      );
	   }

	   @Test
	   public void givenFirstNameWhenPropershouldReturnTrue() {
	     boolean actualParameter = UserDetail.gmailTest(emailPattern, expectedResult);
	      System.out.println("sum of numbers = : "+actualParameter);
	      Assert.assertEquals(expectedResult,actualParameter);
	   }
	}