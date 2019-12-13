/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * This class creates a card with a suit, value, and a boolean
 * to track whether it's been dealt or not.
 */
public class Card {
    private String suit;
    private String value;
    private boolean dealt;
    //constructor
    public Card(String su, String val)
    {
        suit = su;
        value = val;
        dealt = false;
    }
    //setter methods
    public void setDealt(boolean de)
    {
        this.dealt = de;
    }
    //getter methods
    public String getSuit()
    {
        return suit;
    }
    public String getValue()
    {
        return value;
    }
    public boolean getDealt()
    {
        return dealt;
    }
    //overloaded toString method to print out card value
    public String toString()
    {
        String output = "";
        if(suit.equals(""))
        {
            return output;
        }
        output += value + " of " + suit;
        return output;
    }
    //method to temporarily clear value of card
    public void clearCard()
    {
        this.suit = "";
        this.value = "";
    }
}
