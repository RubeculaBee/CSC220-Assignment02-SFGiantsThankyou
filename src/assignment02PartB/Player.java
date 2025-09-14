/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields

    private Club club;
    private String position;
    private int number;
    private String battingHand;
    private String throwingHand;
    private int debut;

    //
    // Constructors
    //
    public Player() {
    }

    public Player(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    //
    // Instance Methods
    //

    public void displayAbout()
    {
        System.out.println(". . . . .");
        System.out.println(getPhrase(1));
        System.out.printf("%-25s %-50s %n", this.getPhrase(19), this.getFirstName() + " " + this.getLastName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(4), this.club.getName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(20), this.position);
        System.out.printf("%-25s %-50s %n", this.getPhrase(21), this.number);
        System.out.printf("%-25s %-50s %n", this.getPhrase(22), this.battingHand);
        System.out.printf("%-25s %-50s %n", this.getPhrase(23), this.throwingHand);
        System.out.printf("%-25s %-50s %n", this.getPhrase(24), this.debut);
        System.out.println(getPhrase(1));
        System.out.println(". . . . .");
    }

    public void say(Object... messageParts)
    {
        StringBuilder message = new StringBuilder();

        for (Object part : messageParts) {
            if(part instanceof String s)
                message.append(s);
            else if(part instanceof Integer i)
                message.append(getPlayerPhrase(i));
        }

        System.out.printf("%s %s, %d: %s\n", getFirstName(), getLastName(), number, message);
    }

    //
    // Additional Instance Methods
    //

    public void setClub(Club club){this.club = club;}
    public void setPosition(String position){this.position = position;}
    public void setNumber(int number){this.number = number;}
    public void setBattingHand(String battingHand){this.battingHand = battingHand;}
    public void setThrowingHand(String throwingHand){this.throwingHand = throwingHand;}
    public void setDebut(int debut){this.debut = debut;}
    
    //
    // Language
    //

    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getClubPhrase(i);
    }

    private String getPlayerPhrase(int i) {
        return Messenger.getConfig().getLanguage().getPlayerPhrase(i);
    }

    //
    // @Override
    //

    //TODO: Implement
    @Override
    public void sayGreeting(String greeting){}
}
