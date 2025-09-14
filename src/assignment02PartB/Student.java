/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Student extends Person {

    //
    // Instance Data Fields
    //

    private String email;

    //
    // Constructors
    //
    public Student() {
    }

    public Student(String firstName, String lastName, String email)
    {
        super(firstName, lastName);
        this.email = email;
    }

    //
    // Instance Methods
    //

    //
    // Additional Methods
    //

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