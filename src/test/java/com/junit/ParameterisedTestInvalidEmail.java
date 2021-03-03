package com.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)

public class ParameterisedTestInvalidEmail {
    private String email;
    UserRegistration option;
    public ParameterisedTestInvalidEmail(String email)
    {
        this.email=email;
    }

    @Before
    public void setup()
    {
        option = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[] {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"});
    }

    @Test
    public void given_email_check_false()
    {
        boolean result=option.validateEmail(email);
        Assert.assertFalse(result);
    }
 }

