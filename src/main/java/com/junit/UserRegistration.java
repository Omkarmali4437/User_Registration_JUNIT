package com.junit;
import java.util.regex.Pattern;

@FunctionalInterface
interface valideCheck{
            boolean result(String pattern , String userInput);
}
public class UserRegistration {
    public boolean result;
    public static String patternname="[A-Z]{1}[a-z]{2,}";
    public static String patternemail="^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
    public static String patternphonenumber="^[0-9]{2}[ ][0-9]{10}$";
    public static String patternpassword="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    valideCheck check=(((pattern, userInput) ->Pattern.compile(pattern).matcher(userInput).matches()) );

    public boolean validateFirstName(String firstname) throws UserRegistrationException
    {
       if(check.result(patternname,firstname))
           return true;
       else
           throw new UserRegistrationException("Invalid First name");
    }

    public boolean validateLastName(String lastname) throws UserRegistrationException
    {
        if(check.result(patternname,lastname))
            return true;
        else
            throw new UserRegistrationException("Invalid Last name");
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        if(check.result(patternemail,email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email address");
    }

    public boolean validatePhonenumber(String phonenumber) throws UserRegistrationException {
        if(check.result(patternphonenumber,phonenumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Phone number");
    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        if(check.result(patternpassword,password))
            return true;
        else
            throw new UserRegistrationException("Invalid password");
    }

}
