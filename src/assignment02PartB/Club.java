/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Club extends Organization {

    //
    // Instance Data Fields
    //

    private String name;
    private String shortName;
    private int dateOfEstablishment;
    private String[] colors;
    private String ballpark;
    private int numWorldSeriesTitles;
    private int numNLPennants;
    private int numDivisionTitles;
    private int numWildCardBerths;
    private OwnerGroup owners;
    private President president;
    private GeneralManager generalManager;
    private Manager manager;

    private Player player;


    //
    // Constructors
    //
    public Club() {
    }

    public Club(String club)
    {
        if(club == "San Francisco Giants")
        {
            name = "San Francisco Giants";
            shortName = "SF Giants";
            dateOfEstablishment = 1883;
            colors = new String[] {"Orange", "Black", "Gold", "Cream"};
            ballpark = "Oracle Park";
            numWorldSeriesTitles = 8;
            numNLPennants = 23;
            numDivisionTitles = 8;
            numWildCardBerths = 3;
            owners = new OwnerGroup("San Francisco Baseball Associates LLC");
            president = new President("Farhan", "Zaidi");
            generalManager = new GeneralManager("Scott", "Harris");
            manager = new Manager("Gabe", "Kapler");
        }
    }

    //
    // Static Methods
    //

    public static String getOfficialSong(){return "Take Me out to the Ball Game";}

    //
    // Instance Methods
    //

    public void setPlayer(String player)
    {
        System.out.println(getPhrase(2) + getPhrase(17) + getPhrase(18));
        
        if(player == "Buster Posey")
        {
            this.player = new Player("Buster", "Posey");
            this.player.setClub(this);
            this.player.setPosition("Catcher");
            this.player.setNumber(28);
            this.player.setBattingHand("Right");
            this.player.setThrowingHand("right");
            this.player.setDebut(2009);
        }
    }

    public void say(Object... messageParts)
    {
        StringBuilder message = new StringBuilder();

        for (Object part : messageParts) {
            if(part instanceof String s)
                message.append(s);
            else if(part instanceof Integer i)
                message.append(getPhrase(i));
        }

        System.out.printf("%s: %s\n", getPhrase(2), message);
    }

    //
    // Additional Instance Methods
    //

    public Player getPlayer(){return player;}

    public String getName(){return name;}
    public String getShortName(){return shortName;}

    //
    // Language
    //

    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getClubPhrase(i);
    }
    
    //
    // Override
    //

    @Override
    public void displayAbout()
    {
        System.out.println(this.getPhrase(2) + this.getPhrase(3));
        System.out.println(this.getPhrase(1));
        System.out.printf("%-25s %-50s %n", this.getPhrase(4), this.name);
        System.out.printf("%-25s %-50s %n", this.getPhrase(5), this.shortName);
        System.out.printf("%-25s %-50s %n", this.getPhrase(6), this.dateOfEstablishment);

        StringBuilder totalColors = new StringBuilder();
        for(String color : colors)
        {
            totalColors.append(color);
            totalColors.append(", ");
        }
        totalColors.append("\b\b");

        System.out.printf("%-25s %-50s %n", this.getPhrase(7), totalColors);
        System.out.printf("%-25s %-50s %n", this.getPhrase(8), this.ballpark);
        System.out.printf("%-25s %-50s %n", this.getPhrase(9), this.numWorldSeriesTitles);
        System.out.printf("%-25s %-50s %n", this.getPhrase(10), this.numNLPennants);
        System.out.printf("%-25s %-50s %n", this.getPhrase(11), this.numDivisionTitles);
        System.out.printf("%-25s %-50s %n", this.getPhrase(12), this.numWildCardBerths);
        System.out.printf("%-25s %-50s %n", this.getPhrase(13), this.owners.getName());
        System.out.printf("%-25s %-50s %n", this.getPhrase(14), String.format("%s %s", this.president.getFirstName(), this.president.getLastName()));
        System.out.printf("%-25s %-50s %n", this.getPhrase(15), String.format("%s %s", this.generalManager.getFirstName(), this.generalManager.getLastName()));
        System.out.printf("%-25s %-50s %n", this.getPhrase(16), String.format("%s %s", this.manager.getFirstName(), this.manager.getLastName()));
        System.out.println(this.getPhrase(1));
    }

    //TODO: Implement
    public void displayMission(){}
}