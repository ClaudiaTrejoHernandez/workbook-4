package com.pluralsight;

public class Main {
    public static void main(String[] args) {

// Create a generic person
        Person person = new Person("Jane", "Doe", "jane.doe@example.com", "female");

        // Print information about the person
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Gender: " + person.getGender());
        System.out.println(); // line break

        Student student = new Student(
                "Brian",                    // First name
                "Vega-Solano",                      // Last name
                "brianvs@example.com",              // Email
                "male",                             // Gender
                101,
                "https://github.com/BrianVegaSol",  // GitHub link
                "https://www.linkedin.com/in/brianvs/", // LinkedIn profile
                "Crash n' Burn",                    // Coding nickname
                "0",                                // Codewars XP (as String)
                "img/Avatar_Student_Male.jpg",      // Image URL
                "Windows",                          // Device type
                5,                                  // Workbook page number
                "81"                                // Currently working on (page/task)
        );

        Student myStudent = new Student(
                "Claudia",                   // First name
                "Trejo Hernandez",                    // Last name
                "ctrejohernandez@my.yearup.org",      // Email
                "female",                             // Gender
                101,
                "https://github.com/ClaudiaTrejoHernandez",  // GitHub link
                "www.linkedin.com/in/claudiatrejohernandez", // LinkedIn profile
                "Newbie",                           // Coding nickname
                "3",                                // Codewars XP (as String)
                "https://media.licdn.com/dms/image/v2/D5603AQGAIqGOUS01Eg/profile-displayphoto-shrink_400_400/B56ZXYof.kGsAs-/0/1743096251772?e=1752105600&v=beta&t=jNxcgQEa1zrYR4IUzcwUzeeNIU4CPJit1LsZsYV7gtk",      // Image URL
                "Windows",                          // Device type
                5,                                  // Workbook page number
                "81"                                // Currently working on (page/task)


        );

        System.out.println("Full Name: " + myStudent.getName());
        System.out.println("Email: " + myStudent.getEmail());
        System.out.println("Gender: " + myStudent.getGender());
        System.out.println("GitHub Link: " + myStudent.getGithub());

    }
}