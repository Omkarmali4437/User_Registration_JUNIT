package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    public static String patternfirstname="[A-Z]{1}[a-z]{2,}";
    public static String patternlastname="[A-Z]{1}[a-z]{2,}";

    public boolean validateFirstName(String firstname) {
        Pattern pattern= Pattern.compile(patternfirstname);
        return pattern.matcher(firstname).matches();
    }
    public boolean validateLastName(String lastname)
    {
        Pattern pattern= Pattern.compile(patternlastname);
        return pattern.matcher(lastname).matches();
    }

}
