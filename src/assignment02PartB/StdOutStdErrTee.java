/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
import java.io.OutputStream;

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public class StdOutStdErrTee extends OutputStream {

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //

    //
    // Instance Methods
    //

    //TODO: Implement
    public void startLog(){}
    public void stopLog(){}

    public String getStdOutFilePath(){return Messenger.getConfig().getLanguage().getConfigPhrase(11);}
    public String getStdErrFilePath(){return Messenger.getConfig().getLanguage().getConfigPhrase(12);}

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
    public void write(int i){}
}