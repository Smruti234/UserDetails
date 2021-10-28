package com.uservalidation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserDetailsTest {
    @Test
    void givenFirstName_CheckValidation_ReturnTrue() {
        UserDetail userDetails = new UserDetail();
        boolean result = userDetails.validateFirstName("SMRUTI");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
        UserDetail userDetails = new UserDetail();
        boolean result = userDetails.validateFirstName("smruti");
        Assertions.assertFalse(result);
    }

    @Test
    void givenTwoLetters_CheckForValidation_ReturnFalse() {
        UserDetail userDetails = new UserDetail();
        boolean result = userDetails.validateFirstName("sm");
        Assertions.assertFalse(result);
    }
}