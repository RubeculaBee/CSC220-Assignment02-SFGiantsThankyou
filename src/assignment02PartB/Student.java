/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: Robin Lane
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public final class Student extends Person {

    //
    // Instance Data Fields
    //

    private String email;
    private String colouredName;

    //
    // Constructors
    //
    public Student() {
    }

    public Student(String firstName, String lastName, String email)
    {
        super(firstName, lastName);
        this.email = email;
        
        this.colouredName = Color.SFSUHighlight(getFirstName() + " " + getLastName());
    }

    //
    // Instance Methods
    //

    public String say()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s: ", colouredName);

        return input.nextLine();
    }

    public String say(String startString)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s: %s ", colouredName, startString);

        return input.nextLine();
    }

    public int sayInt()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s: ", colouredName);

        return input.nextInt();
    }

    //
    // Additional Methods
    //

    public String getEmail()
    {
        return this.email;
    }

    //
    // Language
    //

    //
    // Override
    //

    //TODO: Implement
    @Override
    public void sayGreeting(String greeting){}
}