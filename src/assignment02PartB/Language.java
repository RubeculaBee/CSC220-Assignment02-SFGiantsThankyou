/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
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
    private String[] greetingPhrases;
    private String[] universityPhrases;
    private String[] clubPhrases;

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
            "-".repeat(70),
            "Language: ",
            "Time Zone: ",
            "Color Sequences: ",
            "Standard Output Log: ",
            "Standard Error Log: ",
            "Receipt Log: ",
            "Receipt-*-*.log",
            "Default University: ",
            "Default Club: ",
        };

        timerPhrases = new String[]
        {
            "INVALID time zone. Please enter your time zone.",
            "Pacific Standard Time not in Day Light Saving",
            "Pacific Standard Time in Day Light Saving",
            "Central Standard Time not in Day Light Saving",
            "Central Standard Time in Day Light Saving",
            "Eastern Standard Time not in Day Light Saving",
            "Eastern Standard Time in Day Light Saving"
        };
        
        greetingPhrases = new String[] {""};
        greetingPhrases = new String[] {""};
        greetingPhrases = new String[] {""};
    }

    // TODO: Implement
    public void populateAlienPhrases(){}

    public String getLanguage(){return languageName;}
    public String getConfigPhrase(int i){return configPhrases[i];}
    public String getTimerPhrase(int i){return timerPhrases[i];};
    public String getGreetingPhrase(int i){return "";}
    public String getUniversityPhrase(int i){return "";}
    public String getClubPhrase(int i){return "";}

    // Future Implementation
    public void populateChinesePhrases(){}
    public void populateFrenchPhrases(){}
    public void populateSpanishPhrases(){}
    public void populateYourLanguagePhrases(){}

    //
    // Language
    //
}