package com.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean result;
    public static String patternfirstname="[A-Z]{1}[a-z]{2,}";

    public boolean validateFirstName(String name) {
        Pattern pattern= Pattern.compile(patternfirstname);
        return pattern.matcher(name).matches();
    }
}
