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
    public void given_first_name_check_false() {
        try {
            user.validateLastName("Mali");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Last Name",e.getMessage());
        }
    }

    @Test
    public void given_last_name_check_false() {
        try {
            user.validateLastName("mali");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Last name",e.getMessage());
        }
    }

    @Test
    public void given_email_check_false() {
        try {
            user.validateEmail("omkar.@.com");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Email address", e.getMessage());
        }
    }

    @Test
    public void given_phone_number_check_false() {
        try {
            user.validatePhonenumber(".. 565445");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Phone number",e.getMessage());
        }
    }

    @Test
    public void given_password_check_false() {
        try {
            user.validatePassword("ab");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid password",e.getMessage());
        }
    }
}
