package com.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedTestValidEmail {

    private String email;
    UserRegistration operation;

    public ParameterisedTestValidEmail(String email) {
        this.email = email;
    }

    @Before
    public void setUp() {
        operation = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[] {"abc@yahoo.com", "abc-100@yahoo.com,", "abc.100@yahoo.com", "abc111@abc.com,", "abc-100@abc.net,", "abc.100@abc.com.au", "abc@1.com,", "abc@gmail.com.com", "abc+100@gmail.com"});
    }

    @Test
    public void validEmailTest() {
        boolean result = operation.validateEmail(email);
        Assert.assertTrue(result);
    }
}