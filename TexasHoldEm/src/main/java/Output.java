/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Class to ease output coding in App
 */
import java.util.Scanner;
public class Output {
    public static void showInstructions()
    {
        System.out.println("WELCOME TO TEXAS HOLD 'EM!");
        System.out.println("How to Play:");
        System.out.println("The computer will deal 5 cards to each of you.");
        System.out.println("After dealing, you will have the option to trade in up to all your cards for new ones.");
        System.out.println("The dealer will also get the same opportunity.");
        System.out.println("Then, the best hand wins!");
        System.out.println("");
        System.out.println("Here's the kind of hands you want, from least to greatest.");
        System.out.println("#10 - High Card");
        System.out.println("# 9 - One pair");
        System.out.println("# 8 - Two pairs");
        System.out.println("# 7 - Three of a Kind");
        System.out.println("# 6 - Straight");
        System.out.println("# 5 - Flush (of suits)");
        System.out.println("# 4 - Full House");
        System.out.println("# 3 - Four of a Kind");
        System.out.println("# 2 - Straight Flush");
        System.out.println("# 1 - Royal Flush");
        char answerOne;
        int answer;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Are there any of these you would like more info about? (y/n)");
        answerOne = myScanner.next().charAt(0);
        myScanner.nextLine();
        while(answerOne == 'y' || answerOne == 'Y')
        {
            System.out.println("Enter the number of the one you want to learn more about.");
            answer = myScanner.nextInt();
            switch(answer)
            {
                case 1:
                    System.out.println("ROYAL FLUSH");
                    System.out.println("A royal flush is a straight from ten to Ace in all the same suit.");
                    System.out.println("For example: 10 of Spades, Jack of Spades, Queen of Spades, King of Spades, Ace of Spades");
                    break;
                case 2:
                    System.out.println("STRAIGHT FLUSH");
                    System.out.println("A straight flush is a straight in all the same suit.");
                    System.out.println("For example: 5 of Diamonds, 6 of Diamonds, 7 of Diamonds, 8 of Diamonds, 9 of Diamonds");
                    break;
                case 3:
                    System.out.println("FOUR OF A KIND");
                    System.out.println("A set of all the cards of the same value in all the suits.");
                    System.out.println("For example: 3 of Spades, 3 of Diamonds, 3 of Clubs, 3 of Hearts");
                    break;
                case 4:
                    System.out.println("FULL HOUSE");
                    System.out.println("A set of three of a kind and a pair.");
                    System.out.println("For example: Ace of Spades, Ace of Hearts, Ace of Clubs, 10 of Diamonds, 10 of Spades");
                    break;
                case 5:
                    System.out.println("FLUSH");
                    System.out.println("Any five cards of the same suit.");
                    System.out.println("For example: Ace of Diamonds, 10 of Diamonds, 3 of Diamonds, 6 of Diamonds, Jack of Diamonds");
                    break;
                case 6:
                    System.out.println("STRAIGHT");
                    System.out.println("Any five cards in sequence (can be any suit).");
                    System.out.println("For example: Ace of Spades, 2 of Hearts, 3 of Clubs, 4 of Diamonds, 5 of Hearts");
                    break;
                case 7:
                    System.out.println("THREE OF A KIND");
                    System.out.println("Any set of three cards of the same value.");
                    System.out.println("For example: 5 of Diamonds, 5 of Clubs, 5 of Hearts");
                    break;
                case 8:
                    System.out.println("TWO PAIR");
                    System.out.println("Any set of two pairs of cards of the same value.");
                    System.out.println("For example: King of Spades, King of Hearts, Jack of Diamonds, Jack of Clubs");
                    break;
                case 9:
                    System.out.println("ONE PAIR");
                    System.out.println("Any pair of cards of the same value.");
                    System.out.println("For example: Queen of Spades, Queen of Hearts");
                    break;
                default:
                    System.out.println("HIGH CARD");
                    System.out.println("Highest card in your hand.");
                    System.out.println("For example: Ace of Spades");
            }
            System.out.println("Would you like to learn more about another one? (y/n)");
            answerOne = myScanner.next().charAt(0);
            myScanner.nextLine();
        }
        
    }
    public static void showHands(Hand myHand, Hand dealerHand)
    {
        System.out.println("");
        System.out.println("Dealer's Hand:");
        System.out.println(dealerHand);
        System.out.println("");
        System.out.println("Your Hand");
        System.out.println(myHand);
    }
    public static void showHand(Hand hand)
    {
        System.out.println(hand);
        System.out.println("");
    }
}
