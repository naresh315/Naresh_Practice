package com.programs;
 
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IPAddressRegEx {
    private String pattern;
    public IPAddressRegEx() {
        // Regular expression pattern for an IP address
        this.pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
    
    public boolean isValidIPAddress(String ipAddress) {
        /*
         * This method checks if a given string is a valid IP address or not.
         */
        // Matching the IP address string with the regular expression pattern
        Pattern p = Pattern.compile(this.pattern);
        Matcher m = p.matcher(ipAddress);
        
        // If the match is found, return true, else return false
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
}
