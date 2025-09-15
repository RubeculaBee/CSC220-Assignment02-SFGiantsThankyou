/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Robin Lane
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Date;
import java.util.InputMismatchException;

public final class ChatSession {

    //  Static Data Fields
    private Club club;
    private University university;

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public ChatSession() {
    }

    public ChatSession(Club club, University university)
    {
        this.club = club;
        this.university = university;
    }

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //

    public void runChatSession() 
    {
        startChatSession();

        System.out.println();

        connectChatters();
        chat();

        System.out.println();

        runQuiz();
        stopChatSession();
    }

    private void startChatSession() 
    {
        System.out.print(Messenger.getConfig().getTimer().getDateformat().format(new Date()));
        System.out.println(getPhrase(16));
    }

    private void connectChatters() 
    {
        club.displayAbout();

        System.out.println();

        university.setStudent();
        university.displayAbout();

        System.out.println();

        club.setPlayer("Buster Posey");
        club.getPlayer().displayAbout();
    }

    private void chat() 
    {
        // Formatted Student First Name
        final String fname = university.getSudent().getFirstName() + ". ";
        
        club.getPlayer().say(0, fname, 1);
        club.getPlayer().say(Color.SFSUHighlight(university.getName().toUpperCase()), 2);
        
        university.getSudent().say();

        club.getPlayer().say(3, fname, 4);

        designThankYouCards();

        club.getPlayer().say(14, fname, 15);
    }

    private void designThankYouCards()
    {
        final String fname = university.getSudent().getFirstName() + ". ";
        
        int numCards = -1;
        int triesLeft = 4;
        while(true)
        {
            if(--triesLeft < 0)
                return;
            
            club.getPlayer().say(5, club.getShortName(), 6);

            try{
                numCards = university.getSudent().sayInt();
            }
            catch(InputMismatchException e){
                System.out.println(getPhrase(20) + triesLeft + getPhrase(22));
                System.out.println(e);
                continue;
            }

            
            if(numCards == 0)
                return;
            else if(numCards > 0)
                break;
            else
                System.out.println(getPhrase(21) + triesLeft + getPhrase(22));
        }

        club.getPlayer().say(7, "\n", 8, "\n", 9, "\n", 10);

        String[] recipients = new String[numCards];
        char[] symbols = new char[numCards];
        String[] messages = new String[numCards];


        for(int i = 0; i < numCards; i++)
        {
            club.getPlayer().say(11, String.valueOf(i+1), ":");
            recipients[i] = university.getSudent().say("[1]");
            
            try{
                symbols[i] = university.getSudent().say("[2]").charAt(0);
            }
            catch(StringIndexOutOfBoundsException e){
                symbols[i] = ' ';
            }

            messages[i] = university.getSudent().say("[3]");
        }

        club.getPlayer().say(12, fname, 13);

        for(int i=0; i< numCards; i++)
        {
            System.out.println();

            try{
                SFGiantsCardGenerator.generateSFGiantsCard(recipients[i], messages[i], university.getSudent().getFirstName(), university.getSudent().getEmail(), symbols[i], 12, "");
            }
            catch(Exception e){
                System.out.println(e.getMessage() + ": ERROR In Card Generation");
            }

            System.out.println();
        }

        university.getSudent().say();
    }

    private void runQuiz() 
    {
        String[] answers = new String[] {"abstract", "default", "yield", "permits", "gigantes", "ball game"};
        String response;
        int misses = 0;

        club.say(30,31);

        for(int i = 0; i < answers.length; i++)
        {
            club.say(32+i,25);
            response = university.getSudent().say().toLowerCase();

            if(response.equals(answers[i]))
                club.say(28,26);
            else
            {
                club.say(29,27);
                misses++;
            }
        }

        if(misses > 1)
            System.out.println(getPhrase(19));
        else
            System.out.println(getPhrase(18));
    }

    private void stopChatSession()
    {
        System.out.print(Messenger.getConfig().getTimer().getDateformat().format(new Date()));
        System.out.println(getPhrase(17));
    }
    

    //
    // Language
    //

    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getConfigPhrase(i);
    }
}