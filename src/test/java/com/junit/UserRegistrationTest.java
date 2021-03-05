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
    public void given_first_name_check_true() throws UserRegistrationException{
        boolean result=user.validateFirstName("Omkar");
        Assert.assertTrue(result);
    }

    @Test
    public void given_first_name_check_false() {
        try {
            user.validateFirstName("omkar");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_last_name_check_true() throws UserRegistrationException {
        boolean result= user.validateLastName("Mali");
        Assert.assertTrue(result);
    }

    @Test
    public void given_last_name_check_false() {
        try {
            user.validateLastName("mali");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_email_check_true() throws UserRegistrationException{
        boolean result=user.validateEmail("omkar@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void given_email_check_false() {
        try {
            user.validateEmail("omkar.@.com");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_phone_number_check_true() throws UserRegistrationException{
        boolean result=user.validatePhonenumber("91 9029209892");
        Assert.assertTrue(result);
    }

    @Test
    public void given_phone_number_check_false() {
        try {
            user.validatePhonenumber(".. 565445");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_password_check_true() throws UserRegistrationException{
        boolean result=user.validatePassword("Maha@22hahah");
        Assert.assertTrue(result);
    }


    @Test
    public void given_password_check_false() {
        try {
            user.validatePassword("ab");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
