/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Class for a player's hand when playing cards.
 */
import java.util.Scanner;
public class Hand {
    private Card[] hand = new Card[5];
    //constructor
    public Hand(Deck d) throws Exception
    {
        for(int i=0; i<5; i++)
        {
            hand[i] = d.dealCard();
            //System.out.println(hand[i]);
        }
    }
    //method to remove card from hand and get a new card
    //need to figure out a better way to do this...I know using a list
    //where I can pop and push would be perfect
    //but I want to try to do it without that first....
    public void removeCard(Deck d) throws Exception
    {
        char answer;
        int selection;
        int totalRemoved = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Would you like to remove a card? (y/n)");
        answer = myScanner.next().charAt(0);
        myScanner.nextLine();
        while(answer=='y' || answer=='Y')
        {
            System.out.println("Which card would you like to remove?");
            for(int i=0; i<5; i++)
            {
                System.out.println(i+1 + " - " + hand[i]);
            }
            
            selection = myScanner.nextInt() - 1;
            totalRemoved++;
            hand[selection].clearCard();
            System.out.println("Would you like to remove another?");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
        }
        if(totalRemoved == 0)
        {
            return;
        }
        System.out.println("Here's your new cards:");
        for(int i=0; i<5; i++)
        {
            if(hand[i].getSuit().equals(""))
            {
                hand[i] = d.dealCard();
                System.out.println(hand[i]);
            }
        }
        System.out.println("\n");
    }
    //overload toString method
    public String toString()
    {
        String output = "";
        for(int i=0; i<5; i++)
        {
            output += hand[i] + "   ";
        }
        return output;
    }
    //method to allow dealer to remove cards
    public void dealerRemoveCard(Deck d)
    {
        
    }
}
