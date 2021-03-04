package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    public static String patternfirstname="[A-Z]{1}[a-z]{2,}";
    public static String patternlastname="[A-Z]{1}[a-z]{2,}";
    public static String patternemail="^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
    public static String patterphonenumber="^[0-9]{2}[ ][0-9]{10}$";
    public static String patterpassword="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    public void validateFirstName(String firstname) throws UserRegistrationException
    {
       if(!Pattern.compile(patternfirstname).matcher(firstname).matches())
           throw new UserRegistrationException("Invalid First name");
    }
    public void validateLastName(String lastname) throws UserRegistrationException

    {
        if(!Pattern.compile(patternlastname).matcher(lastname).matches())
            throw new UserRegistrationException("Invalid Last name");
    }
    public void validateEmail(String email) throws UserRegistrationException {
        if(!Pattern.compile(patternemail).matcher(email).matches())
            throw new UserRegistrationException("Invalid Email address");
    }
    public void validatePhonenumber(String phonenumber) throws UserRegistrationException {
        if(!Pattern.compile(patterphonenumber).matcher(phonenumber).matches())
            throw new UserRegistrationException("Invalid Phone number");
    }
    public void validatePassword(String password) throws UserRegistrationException {
        if(!Pattern.compile(patterpassword).matcher(password).matches())
            throw new UserRegistrationException("Invalid password");
    }

}
