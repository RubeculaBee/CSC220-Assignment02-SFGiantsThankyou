/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: Robin Lane
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public final class University extends Organization {
    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    private Student student;
    private String name;
    private String mottoLatin;
    private String mottoEnglish;
    private String type;
    private int yearOfEstablishment;
    private String location;
    private String address;
    private String[] colors;
    private String nickname;
    private String mascot;
    private String website;

    //
    // Constructors
    //
    public University() {
    }
    
    public University(String university)
    {
        if(university == "San Francisco State University")
        {
            name = "San Francisco State University";
            mottoLatin = "Experientia Docet";
            mottoEnglish = "experience Teaches";
            type = "Public";
            yearOfEstablishment = 1899;
            location = "San Francisco, California, United States";
            address = "1600 Holloway Avenue, San Francisco, CA 94132";
            colors = new String[] {"Purple", "Gold"};
            nickname = "Gators";
            mascot = "Gator";
            website = "www.sfsu.edu";
        }
    }

    //
    // Instance Methods
    //

    public void setStudent()
    {
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        String email;

        System.out.print(Messenger.getConfig().getLanguage().getClubPhrase(2));
        System.out.print(getPhrase(2) + getPhrase(4));
        firstName = input.next();
        lastName = input.nextLine();
        System.out.print(Messenger.getConfig().getLanguage().getClubPhrase(2));
        System.out.print(getPhrase(3) + getPhrase(4));
        email = input.nextLine();

        student = new Student(firstName, lastName, email);
    }

    //
    // Additional Methods
    //

    public Student getSudent() {return student;};
    public String getName() {return name;};

    //
    // Language
    //

    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getUniversityPhrase(i);
    }

    //
    // Override
    //

    @Override
    public void displayAbout()
    {
        System.out.print(student.getFirstName() + student.getLastName() + ": ");
        System.out.println(getPhrase(5));
        System.out.println(getPhrase(1));
        System.out.printf("%-25s %-50s %n", this.getPhrase(6), name);
        System.out.printf("%-25s %-50s %n", this.getPhrase(7), mottoLatin);
        System.out.printf("%-25s %-50s %n", this.getPhrase(8), mottoEnglish);
        System.out.printf("%-25s %-50s %n", this.getPhrase(9), type);
        System.out.printf("%-25s %-50s %n", this.getPhrase(10), yearOfEstablishment);
        System.out.printf("%-25s %-50s %n", this.getPhrase(11), location);
        System.out.printf("%-25s %-50s %n", this.getPhrase(12), address);
        
        StringBuilder totalColors = new StringBuilder();
        for(String color : colors)
        {
            totalColors.append(color);
            totalColors.append(", ");
        }
        totalColors.append("\b\b");

        System.out.printf("%-25s %-50s %n", this.getPhrase(13), totalColors);
        System.out.printf("%-25s %-50s %n", this.getPhrase(14), nickname);
        System.out.printf("%-25s %-50s %n", this.getPhrase(15), mascot);
        System.out.printf("%-25s %-50s %n", this.getPhrase(16), website);
        System.out.println(getPhrase(1));
    }

    //TODO: Implement
    public void displayMission(){}
}