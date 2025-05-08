package com.pluralsight;

public class NameFormatter {

    private String prefix;
    private String firstname;
    private String middlename;
    private String lastname;
    private String suffix;

    private NameFormatter() {}

    public static String format(String firstname, String lastname){
        return lastname + ", " + firstname;

    }

    public static String format(String prefix, String firstname, String middlename, String lastname, String suffix) {
        return lastname + ", " + prefix + " " + firstname + " " + middlename + ", " + suffix;

    }

    public static String format(String fullname) {
        return fullname;
    }

}
