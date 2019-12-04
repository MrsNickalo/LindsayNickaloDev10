/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 * Let's play BlackJack!
 */
import java.util.Scanner;
import java.util.Random;
public class BlackJack {
    public static void main(String[] args){
        char playAgain;
        playAgain = 'y';
        do
        {
            boolean busted = false;
            //First let's build a deck
            int[] deck = new int[52];
            int[] deckH = new int[52];
            //Now let's fill the deck
            for(int i = 0; i<13; i++)
            {
                if(i>=10)
                {
                    deck[i] = 10;
                    deck[i+13] = 10;
                    deck[i+26] = 10;
                    deck[i+39] = 10;
                    deckH[i] = 10;
                    deckH[i+13] = 10;
                    deckH[i+26] = 10;
                    deckH[i+39] = 10;
                }
                else if(i==0)
                {
                    deck[i] = 1;
                    deck[i + 13] = 1;
                    deck[i + 26] = 1;
                    deck[i + 39] = 1;
                    deckH[i] = 11;
                    deckH[i + 13] = 11;
                    deckH[i + 26] = 11;
                    deckH[i + 39] = 11;
                }
                else
                {
                    deck[i] = i + 1;
                    deck[i+13] = i + 1;
                    deck[i+26] = i + 1;
                    deck[i+39] = i + 1;
                    deckH[i] = i + 1;
                    deckH[i+13] = i + 1;
                    deckH[i+26] = i + 1;
                    deckH[i+39] = i + 1;
                }
            }
            //Debugging code
            /*for(int i = 0; i<52; i++)
            {
                System.out.println(deck[i]);
            }*/
            //Declare variables
            int playerTotal, playerTotalHigh, playerCard, playerCardHigh, dealerTotal, dealerTotalHigh, dealerCardShow, dealerCardShowHigh, dealerCardHideHigh, dealerCardHide;
            Scanner myScanner = new Scanner(System.in);
            Random rGen = new Random();
            int ranNum;
            char answer;
            //Set Up Game
            System.out.println("Welcome to BlackJack!");
            System.out.print("Would you like to play (yes or no)? ");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
            if(answer=='n' || answer=='N')
            {
                return;
            }
            System.out.println("Dealing cards...");
            ranNum = rGen.nextInt(52);
            playerCard = deck[ranNum];
            playerCardHigh = deckH[ranNum];
            playerTotal = playerCard;
            playerTotalHigh = playerCardHigh;
            deck[ranNum] = 0;
            if(deckH[ranNum]==11)
            {
                System.out.println("Your first card has value of " + playerCard + " or " + playerCardHigh);
            }
            else
            {
                System.out.println("Your first card has value of " + playerCard);
            }
            do
            {
                ranNum = rGen.nextInt(52);
            }while (deck[ranNum] == 0);
            dealerCardHide = deck[ranNum];
            dealerCardHideHigh = deck[ranNum];
            deck[ranNum] = 0;
            do
            {
                ranNum = rGen.nextInt(52);
            }while (deck[ranNum] == 0);
            playerCard = deck[ranNum];
            playerCardHigh = deckH[ranNum];
            playerTotal = playerTotal + playerCard;
            playerTotalHigh = playerTotalHigh + playerCardHigh;
            deck[ranNum] = 0;
            if(deckH[ranNum]==11)
            {
                System.out.println("Your second card has value " + playerCard + " or " + playerCardHigh);
                System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
            }
            else
            {
                System.out.println("Your second card has value " + playerCard);
                System.out.println("Your total is now " + playerTotal);
            }
            do
            {
                ranNum = rGen.nextInt(52);
            }while (deck[ranNum] == 0);
            dealerCardShow = deck[ranNum];
            dealerCardShowHigh = deckH[ranNum];
            dealerTotal = dealerCardShow;
            dealerTotalHigh = dealerCardShowHigh;
            deck[ranNum] = 0;
            if(deckH[ranNum]==11)
            {
                System.out.println("The dealer's card showing has value " + dealerCardShow + " or " + dealerCardShowHigh);
            }
            else
            {
                System.out.println("The dealer's card showing has value " + dealerCardShow);
            }
            System.out.println("Would you like another card?");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
            while(answer=='y')
            {
                do
                {
                    ranNum = rGen.nextInt(52);
                }while (deck[ranNum] == 0);
                playerCard = deck[ranNum];
                playerCardHigh = deckH[ranNum];
                playerTotal = playerTotal + playerCard;
                playerTotalHigh = playerTotalHigh + playerCardHigh;
                deck[ranNum] = 0;
                if(deckH[ranNum]==11)
                {
                    System.out.println("The value of your new card is " + playerCard + " or " + playerCardHigh);
                    System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                }
                else
                {
                    System.out.println("The value of your new card is " + playerCard);
                    System.out.println("Your total is now " + playerTotal);
                }
                if(playerTotal>21)
                {
                    System.out.println("YOU'RE BUSTED!");
                    busted = true;
                    break;
                }
                else
                {
                    System.out.print("Would you like another card? ");
                    answer = myScanner.next().charAt(0);
                    myScanner.nextLine();
                }
            }
            if(!busted)
            {
                System.out.println("The dealer flips his card.");
                dealerTotal = dealerTotal + dealerCardHide;
                dealerTotalHigh = dealerTotalHigh + dealerCardHideHigh;
                if(dealerCardHideHigh==11)
                {
                    System.out.println("The dealer's card has value " + dealerCardHide + " or " + dealerCardHideHigh);
                    System.out.println("The dealer's total is now " + dealerTotal + " or " + dealerTotalHigh);
                }
                else
                {
                    System.out.println("The dealer's card has value " + dealerCardHide);
                    System.out.println("The dealer's total is now " + dealerTotal);
                }
                
                if(dealerTotal > playerTotal)
                {
                    System.out.println("The dealer wins!");
                }
                else if(dealerTotal > playerTotalHigh)
                {
                    System.out.println("The dealer wins!");
                }
                else if(playerTotal != playerTotalHigh)
                {
                    if(dealerTotalHigh <= 21)
                    {
                        if(dealerTotalHigh > playerTotalHigh)
                        {
                            System.out.println("The dealer wins!");
                        }
                    }
                }
                else
                {
                    do
                    {
                        System.out.println("The dealer takes another card.");
                        do
                        {
                            ranNum = rGen.nextInt(52);
                        }while (deck[ranNum] == 0);
                        dealerCardShow = deck[ranNum];
                        deck[ranNum] = 0;
                        dealerTotal = dealerTotal + dealerCardShow;
                        System.out.println("The value of the card is " + dealerCardShow);
                        System.out.println("The dealer's total is now " + dealerTotal);
                    }while (dealerTotal < playerTotal);
                    if(dealerTotal > 21)
                    {
                        System.out.println("DEALER BUSTED! YOU WIN!");
                    }
                    else if(dealerTotal == playerTotal)
                    {
                        System.out.println("DRAW!");
                    }
                    else
                    {
                        System.out.println("DEALER WINS!");
                    }
                }
                System.out.println("Play again? ");
                playAgain = myScanner.next().charAt(0);
                myScanner.nextLine();
            }
        }while (playAgain == 'y');
    }
    
}
