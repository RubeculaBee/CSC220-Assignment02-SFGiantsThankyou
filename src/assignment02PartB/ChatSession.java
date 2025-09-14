/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Date;

public final class ChatSession {

    //  Static Data Fields

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public ChatSession() {
    }

    //TODO: Implement
    public ChatSession(Club club, University university){}

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    private void startChatSession() 
    {
        System.out.print(Messenger.getConfig().getTimer().getDateformat().format(new Date()));
        System.out.println(getPhrase(16));
    }
    private void connectChatters() {
    }
    private void chat() {
    }
    private void runQuiz() {
    }
    private void stopChatSession() {
    }
    public void runChatSession() 
    {
        startChatSession();
    }

    //
    // Language
    //

    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getConfigPhrase(i);
    }
}