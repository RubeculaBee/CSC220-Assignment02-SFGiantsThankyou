/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OwnerGroup.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class OwnerGroup extends Organization{
    //
    // Data fields
    //

    private String name;

    //
    // Constructors
    //
    public OwnerGroup(String name) 
    {
        this.name = name;
    }

    //
    // Instance Methods
    //

    public String getName()
    {
        return this.name;
    }

    //
    // Override
    //

    //TODO: Implement
    public void displayMission(){}
    public void displayAbout(){}
}