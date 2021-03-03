package com.junit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user;
    @Before
    public void intialize() {
        user=new UserRegistration();
    }

    @Test
    public void given_first_name_check_true() {
        boolean result=user.validateFirstName("Omkar");
        Assert.assertTrue(result);
    }
    @Test
    public void given_first_name_check_false() {
        boolean result=user.validateFirstName("omkar");
        Assert.assertFalse(result);
    }

    @Test
    public void given_last_name_check_true() {
        boolean result=user.validateLastName("Mali");
        Assert.assertTrue(result);
    }

    @Test
    public void given_last_name_check_false() {
        boolean result=user.validateLastName("mali");
        Assert.assertFalse(result);
    }

    @Test
    public void given_email_check_true() {
        boolean result=user.validateEmail("omkarmali@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void given_email_check_false() {
        boolean result=user.validateEmail("omkar.@.com");
        Assert.assertFalse(result);
    }
}
