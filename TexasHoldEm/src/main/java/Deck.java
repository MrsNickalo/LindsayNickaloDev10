
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Class to build a deck of cards using the card class.
 */
public class Deck {
    private Card[] deck = new Card[52];
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] faces = {"Jack", "Queen", "King", "Ace"};
    private int totalDealt;
    //constructor
    public Deck()
    {
        for(int i=0; i<13; i++)
        {
            if(i<9)
            {
                deck[i] = new Card(suits[0], Integer.toString(i+2));
                deck[i+13] = new Card(suits[1], Integer.toString(i+2));
                deck[i+26] = new Card(suits[2], Integer.toString(i+2));
                deck[i+39] = new Card(suits[3], Integer.toString(i+2));
            }
            else
            {
                deck[i] = new Card(suits[0], faces[i-9]);
                deck[i+13] = new Card(suits[1], faces[i-9]);
                deck[i+26] = new Card(suits[2], faces[i-9]);
                deck[i+39] = new Card(suits[3], faces[i-9]);
            }
        }
        totalDealt = 0;
    }
    //shuffle deck (really just a method to make the user feel like
    //we're actually shuffling the deck...it doesn't do anything really...
    public void shuffleDeck()
    {
        System.out.println("Shuffling....\n\n\n");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //method that returns a card to simulate drawing a card from the deck
    public Card dealCard() throws Exception
    {
        if(totalDealt >= 52)
        {
            throw new Exception("All cards have been dealt.");
        }
        Random randomizer = new Random();
        int selection;
        do
        {
            selection = randomizer.nextInt(52);
        }while(deck[selection].getDealt());
        deck[selection].setDealt(true);
        totalDealt++;
        return deck[selection];
    }
    //method to reset the deck (sets all cards back to false for dealt)
    public void resetDeck()
    {
        for(int i=0; i<52; i++)
        {
            deck[i].setDealt(false);
        }
    }
}
