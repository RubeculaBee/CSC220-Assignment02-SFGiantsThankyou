/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Robin Lane
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Scanner;

public class Timer {

    //
    // Static Data Fields
    //

    static private final String[] validTimeZones = {"PST", "CST", "EST"};

    //
    // Instance Data Fields
    //

    private DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss [SSSS 'ms'] a zz");

    //
    // Constructors
    //
    public Timer() {
    }

    //
    // Static Methods
    //

    public static Timer setTimeZonePreference()
    {
        Scanner input = new Scanner(System.in);
        Language language = Messenger.getConfig().getLanguage();
        
        String choice;

        Timer newTimer = new Timer();
        
        while(true)
        {
            System.out.print(language.getConfigPhrase(2));
            choice = input.nextLine().toUpperCase();

            for(String validChoice : validTimeZones)
            {
                if(choice.equals(validChoice))
                {
                    newTimer.dateformat.setTimeZone(TimeZone.getTimeZone(choice));
                    return newTimer;
                }
            }
            
            System.out.print(language.getConfigPhrase(2));
            System.out.println(language.getTimerPhrase(0));
        }
    }

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //

    public DateFormat getDateformat() {
        return dateformat;
    }

    //
    // Additional Instance Methods
    //

    public String getTimeZoneFormatted()
    {
        int timeZoneID = switch(dateformat.getTimeZone().getDisplayName(false, TimeZone.SHORT))
        {
            case "CST" -> 3;
            case "EST" -> 5;
            default -> 1;
        };

        if(dateformat.getTimeZone().inDaylightTime(new Date()))
            timeZoneID++;
        
        return getPhrase(timeZoneID);
    }

    //
    // Language
    //

    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getTimerPhrase(i);
    }
}