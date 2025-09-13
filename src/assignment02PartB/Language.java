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

    static String greetingPhrases[];
    static String configPhrases[];
    static String universityPhrases[];
    static String clubPhrases[];

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

    //TODO: Implement
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
                {
                    input.close();
                    return new Language(choice);
                }
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

    // TODO: Implement
    public void populateEnglishPhrases(){}
    public void populateAlienPhrases(){}

    public String getGreetingPhrase(int i){return "";}
    public String getConfigPhrase(int i){return "";}
    public String getLanguage(){return "";}
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