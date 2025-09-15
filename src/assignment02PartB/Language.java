/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Robin Lane
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

import java.util.Scanner;
import java.util.Arrays;
public final class Language {
    //
    // Static Data Fields
    //    
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default
    private static final String[] validLanguages = {"english", "alien", "chinese", "french", "spanish"};

    //
    // Instance Data Fields
    //

    private String languageName;

    private String[] configPhrases;
    private String[] timerPhrases;
    private String[] universityPhrases;
    private String[] clubPhrases;
    private String[] playerPhrases;
    private String[] greetingPhrases;

    //
    // Constructors
    //
    public Language() {
    }
    public Language(String language) {

        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }

    }

    //
    // Static Methods
    //

    public static void displayAppHeader()
    {
        System.out.println(Config.getOfficialAppHeader());
    }
    public static Language setLanguagePreference()
    {
        Scanner input = new Scanner(System.in);

        String choice;

        while(true)
        {
            System.out.print("Language: ");
            choice = input.nextLine();
            
            for(String validChoice : validLanguages)
            {
                if(choice.toLowerCase().equals(validChoice))
                    return new Language(choice);
            }
            System.out.println("Language: UNSUPPORTED language. Please enter your language.");
            System.out.println("Language: English, Chinese, French, Spanish, Alien");
        }
    }


    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //

    
    public void populateEnglishPhrases()
    {
        languageName = "ENGLISH";

        configPhrases = new String[] 
        {
            "-".repeat(70),                     // 0
            "Language: ",                       // 1
            "Time Zone: ",                      // 2
            "Color Sequences: ",                // 3
            "Standard Output Log: ",            // 4
            "Standard Error Log: ",             // 5
            "Receipt Log: ",                    // 6
            "Receipt-*-*.log",                  // 7
            "Default University: ",             // 8
            "Default Club: ",                   // 9
            Config.getDefaultColorSequences(),  // 10
            Config.getDefaultStdOutFilePath(),  // 11
            Config.getDefaultStdErrFilePath(),  // 12
            Config.getDefaultLogDirectoryPath(),// 13
            Config.getDefaultUniversity(),      // 14
            Config.getDefaultClub(),            // 15
            " - Chat session Started.",         // 16
            " - Chat session Ended.",           // 17

            "*** Congrats! You won FREE TICKETS to SF GIANTS Games ***",// 18
            "____ Please try again at your graduation ceremony. ____",  // 19

            "Please enter an INTEGER. ",//20
            "Please enter a NON-NEGATIVE integer. ",//21
            " tries left"               //22
        };

        timerPhrases = new String[]
        {
            "INVALID time zone. Please enter your time zone.",  // 0
            "Pacific Standard Time not in Day Light Saving",    // 1
            "Pacific Standard Time in Day Light Saving",        // 2
            "Central Standard Time not in Day Light Saving",    // 3
            "Central Standard Time in Day Light Saving",        // 4
            "Eastern Standard Time not in Day Light Saving",    // 5
            "Eastern Standard Time in Day Light Saving"         // 6
        };
        
        universityPhrases = new String[]
        {
            "San Francisco State University",   // 0
            "-".repeat(70),                     // 1
            "Your first name and last name",    // 2
            "Your school email address",        // 3
            ", please: ",                       // 4
            "Welcome to my university!",        // 5
            "Official Name:",                   // 6
            "Motto in Latin",                   // 7
            "Motto in English",                 // 8
            "Type:",                            // 9
            "Year of Establishment:",           // 10
            "Location:",                        // 11
            "Address:",                         // 12
            "Colors:",                          // 13
            "Nickname:",                        // 14
            "Mascot:",                          // 15
            "Website:"                          // 16
        };

        clubPhrases = new String[]
        {
            "San Francisco Giants",                 // 0
            "-".repeat(70),                         // 1
            "SF Giants: ",                          // 2
            "Welcome to the SAN FRANCISCO GIANTS!", // 3
            "Club:",                                // 4
            "Short Name",                           // 5
            "Established in:",                      // 6
            "Colors:",                              // 7
            "Ballpark:",                            // 8
            "World Series Titles:",                 // 9
            "NL Pennants:",                         // 10
            "Division Titles:",                     // 11
            "Wild card Berths:",                    // 12
            "Owners:",                              // 13
            "President:",                           // 14
            "General Manager:",                     // 15
            "Manager:",                             // 16

            "Thank You. ",                              // 17
            "We are connecting you with our player...", // 18

            "Player:",      // 19
            "Position:",    // 20
            "Number:",      // 21
            "Bats:",        // 22
            "Throws",       // 23
            "MLB Debut:",   // 24

            "?",        // 25
            "!",        // 26 
            "...",      // 27
            "Correct",  // 28
            "Oops",     // 29
            
            "*** FREE TICKETS to SF GIANTS Games ***",                  // 30
            " _ 1 miss allowed _",                                      // 31
            "Which type of class has 'protected' constructors",         // 32
            "What type of method did Java 8 add to 'interface'",        // 33
            "What new keyword did Java 13 add to 'switch' statement",   // 34
            "In Java 15, what keyword pairs with 'sealed'",             // 35
            "Giants in Spanish",                                        // 36
            "Take me out to the...",                                    // 37
        };

        playerPhrases = new String[]
        {
            "Hello ",                                   // 0
            "C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!",           // 1
            ". Way to go!",                             // 2
            "Likewise, ",                               // 3
            "Very nice chatting w/ you.",               // 4
            "How many ",                                // 5
            " Thank You cards would you like to order?",// 6
            "In 3 lines, please provide",               // 7
            "   [1] Recipient name",                    // 8
            "   [2] Art symbol (a character)",          // 9
            "   [3] Message to recipient",              // 10
            "Card #",                                   // 11
            "Thanks, ",                                 // 12
            "Please confirm your order:",               // 13
            "Thank you again, ",                        // 14
            "See you at your graduation ceramony!"      // 15
        };
    }

    // TODO: Implement
    public void populateAlienPhrases()
    {
        languageName = Language.defaultAlienSound;

        configPhrases = new String[23];
        timerPhrases = new String[7];
        universityPhrases = new String[17];
        clubPhrases = new String[38];
        playerPhrases = new String[17];

        String[][] phraseList = new String[][] {configPhrases, timerPhrases, universityPhrases, clubPhrases, playerPhrases};

        for(String[] list : phraseList)
            for(int i = 0; i < list.length; i++)
                list[i] = Language.defaultAlienSound;
    }

    public String getLanguage(){return languageName;}
    public String getConfigPhrase(int i){return configPhrases[i];}
    public String getTimerPhrase(int i){return timerPhrases[i];};
    public String getUniversityPhrase(int i){return universityPhrases[i];}
    public String getClubPhrase(int i){return clubPhrases[i];}
    public String getPlayerPhrase(int i){return playerPhrases[i];}
    public String getGreetingPhrase(int i){return "";}

    // Future Implementation
    public void populateChinesePhrases(){}
    public void populateFrenchPhrases(){}
    public void populateSpanishPhrases(){}
    public void populateYourLanguagePhrases(){}

    //
    // Language
    //
}