package com.junit;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void given_first_name_check_true() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("Omkar");
        Assert.assertTrue(result);
    }
    @Test
    public void given_first_name_check_false() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("omkar");
        Assert.assertFalse(result);
    }
}
