package com.pluralsight;

public class NameFormatter {

    private String prefix;
    private String firstname;
    private String middlename;
    private String lastname;
    private String suffix;

    private NameFormatter() {}

    public static String format(String firstname, String lastname){

        String formattedName = lastname + ", " + firstname;
        return formattedName;

    }

    public static String format(String prefix, String firstname, String middlename, String lastname, String suffix) {
        StringBuilder formatted = new StringBuilder();

        formatted.append(lastname).append(", ");

        if (prefix != null && !prefix.isEmpty()){
            formatted.append(prefix).append(" ");
        }

        formatted.append(firstname).append(" ");

        if (middlename != null && !middlename.isEmpty()){
            formatted.append(middlename).append(" ");
        }

        if (suffix != null && !suffix.isEmpty()){
            formatted.append(", ").append(suffix);
        }

        return formatted.toString().trim();
    }

    public static String format(String fullname) {
        String [] fullParts = fullname.split(",");

        String lastname = fullParts[0].trim();
        String suffix = "";

        String [] nameParts;

        if (fullParts.length == 3) {
            nameParts = fullParts[1].trim().split("\\s+");
            suffix = fullParts[2].trim();
        }else if (fullParts.length == 2) {
            nameParts = fullParts[1].trim().split("\\s+");
        }else {
            return fullname;
        }

        String prefix = "";
        String firstname = "";
        String middlename = "";

        if (nameParts.length == 1) {
            firstname = nameParts[0];
        }

        if (nameParts.length == 2) {
            firstname = nameParts[0];
            middlename = nameParts[1];
        }

        if (nameParts.length >= 3) {
            prefix = nameParts[0];
            firstname = nameParts[1];
            middlename = nameParts[2];
        }

        return format(prefix, firstname, middlename, lastname, suffix);
    }

}
