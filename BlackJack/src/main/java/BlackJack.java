/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 * Let's play BlackJack!
 */
import java.util.Scanner;
import java.util.Random;
public class BlackJack {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        char answer;
        //Set Up Game
        System.out.println("Welcome to BlackJack!");
        System.out.print("Would you like to play (yes or no)? ");
        answer = myScanner.next().charAt(0);
        myScanner.nextLine();
        if(answer=='y'||answer=='Y')
        {
            playBlackJack();
        }
    }
    public static void playBlackJack()
    {
        char playAgain;
        playAgain = 'y';
        do
        {
            //boolean to track if player is busted
            //we use this method instead of just a return statement
            //if the player busts so that we can still have the option
            //of playing again
            boolean busted = false;
            //boolean to track if player and dealer already have an ace
            boolean playerAce = false;
            boolean dealerAce = false;
            //boolean for tracking when dealer should stop drawing cards
            boolean dealerNoMore = false;
            //First let's build a deck for ace value one and ace value two
            int[] deck = buildDeck();
            //Declare variables necessary
            int playerTotal, playerTotalHigh, playerCard, dealerTotal, dealerTotalHigh, dealerCardShow, dealerCardHide;
            Scanner myScanner = new Scanner(System.in);
            Random rGen = new Random();
            int ranNum;
            char answer;
            //Time to deal the cards
            System.out.println("Dealing cards...");
            ranNum = rGen.nextInt(52);
            playerCard = deck[ranNum];
            playerTotal = playerCard;
            deck[ranNum] = 0;
            //If the first card dealt to the player is an ace, we must consider
            //that it can be valued at 1 or 11
            //Also note that if the player gets any other aces, they must
            //be valued at 1 in order to avoid busting
            if(playerCard==1)
            {
                playerTotalHigh =11;
                System.out.println("Your first card has value of 1 or 11.");
                playerAce = true;
            }
            else
            {
                playerTotalHigh = playerCard;
                System.out.println("Your first card has value of " + playerCard);
            }
            //This will ensure we deal a card that has not been dealt already
            do
            {
                ranNum = rGen.nextInt(52);
            }while (deck[ranNum] == 0);
            //This will be the dealer's card that remains face down
            dealerCardHide = deck[ranNum];
            deck[ranNum] = 0;
            //deal a second card to the player
            do
            {
                ranNum = rGen.nextInt(52);
            }while (deck[ranNum] == 0);
            playerCard = deck[ranNum];
            playerTotal = playerTotal + playerCard;
            deck[ranNum] = 0;
            //not only do we have to check if it's an ace, but also take into
            //account if they already have an ace
            if(playerCard == 1)
            {
                if(playerAce)
                {
                    playerTotalHigh += 1;
                    System.out.println("Since you have two aces, this ace must be worth 1.");
                    System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                }
                else
                {
                    playerTotalHigh+=11;
                    playerAce = true;
                    System.out.println("Your second card has value 1 or 11.");
                    System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                }
            }
            else
            {
                playerTotalHigh += playerCard;
                System.out.println("Your second card has value " + playerCard);
                if(playerAce)
                {
                    System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                }
                else
                {
                    System.out.println("Your total is now " + playerTotal);
                }
            }
            //deal another card to the dealer, this one showing to the player
            do
            {
                ranNum = rGen.nextInt(52);
            }while (deck[ranNum] == 0);
            dealerCardShow = deck[ranNum];
            dealerTotal = dealerCardShow;
            dealerTotalHigh = dealerCardShow;
            deck[ranNum] = 0;
            //have to deal with whether or not it's an ace
            if(dealerCardShow==1)
            {
                dealerTotalHigh = 11;
                System.out.println("The dealer's card showing has value 1 or 11.");
                dealerAce = true;
            }
            else
            {
                dealerTotalHigh = dealerCardShow;
                System.out.println("The dealer's card showing has value " + dealerCardShow);
            }
            //ask the player if they want another card
            System.out.println("Would you like another card?");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
            //while they want another card we will deal them one using this loop
            while(answer=='y'||answer=='Y')
            {
                do
                {
                    ranNum = rGen.nextInt(52);
                }while (deck[ranNum] == 0);
                playerCard = deck[ranNum];
                playerTotal = playerTotal + playerCard;
                //dealing with aces...again
                if(playerCard==1)
                {
                    if(playerAce)
                    {
                        System.out.println("Since you have two aces, this ace must be worth 1.");
                        System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                        playerTotalHigh += 1;
                    }
                    else
                    {
                        playerTotalHigh += 11;
                        playerAce = true;
                        System.out.println("Your card has value 1 or 11.");
                        System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                    }
                }
                else
                {
                    playerTotalHigh+= playerCard;
                    System.out.println("Your card has value " + playerCard);
                    if(playerAce)
                    {
                        System.out.println("Your total is now " + playerTotal + " or " + playerTotalHigh);
                    }
                    else
                    {
                        System.out.println("Your total is now " + playerTotal);
                    }
                }
                deck[ranNum] = 0;
                //now we must check if the player busted
                //if they did, we break out and skip down to
                //asking if they want to play again
                if(playerTotal>21)
                {
                    System.out.println("YOU'RE BUSTED!");
                    busted = true;
                    break;
                }
                //ask if they want another card, and repeat as necessary
                else
                {
                    System.out.print("Would you like another card? ");
                    answer = myScanner.next().charAt(0);
                    myScanner.nextLine();
                }
            }
            //if the player didn't bust, then we'll let the dealer go
            if(!busted)
            {
                System.out.println("The dealer flips his card.");
                dealerTotal = dealerTotal + dealerCardHide;
                //dealing with that pesky ace!
                if(dealerCardHide==1)
                {
                    if(dealerAce)
                    {
                        dealerTotalHigh +=1;
                        System.out.println("The dealer's card must have value 1 to avoid busting.");
                        System.out.println("The dealer's total is now " + dealerTotal + " or " + dealerTotalHigh);
                    }
                    else
                    {
                        dealerTotalHigh +=11;
                        dealerAce = true;
                        System.out.println("The dealer's card has value 1 or 11.");
                        System.out.println("The dealer's total is now " + dealerTotal + " or " + dealerTotalHigh);
                    }
                }
                else
                {
                    dealerTotalHigh += dealerCardHide;
                    if(dealerAce)
                    {
                        System.out.println("The dealer's card has value " + dealerCardHide);
                        System.out.println("The dealer's total is now " + dealerTotal + " or " + dealerTotalHigh);
                    }
                    else
                    {
                        System.out.println("The dealer's card has value " + dealerCardHide);
                        System.out.println("The dealer's total is now " + dealerTotal);
                    }
                }
                //now, before the dealer decides whether to take a card
                //or not, let's see if he's already won
                dealerNoMore = anotherCard(playerTotal, playerTotalHigh, dealerTotal, dealerTotalHigh);
                //The dealer is going to take another card until
                //he wins or busts. No other options.
                while(!dealerNoMore)
                {
                    System.out.println("The dealer takes another card.");
                    do
                    {
                        ranNum = rGen.nextInt(52);
                    }while (deck[ranNum] == 0);
                    dealerCardShow = deck[ranNum];
                    deck[ranNum] = 0;
                    dealerTotal = dealerTotal + dealerCardShow;
                    //dealing with the ace
                    if(dealerCardShow==1)
                    {
                        if(dealerAce)
                        {
                            dealerTotalHigh += 1;
                            System.out.println("The value of the card must be 1 to avoid busting.");
                            System.out.println("The dealer's total is now: " + dealerTotal + " or " + dealerTotalHigh);
                        }
                        else
                        {
                            dealerTotalHigh += 11;
                            dealerAce = true;
                            System.out.println("The value of the card is either 1 or 11");
                            System.out.println("The dealer's total is now: " + dealerTotal + " or " + dealerTotalHigh);
                        }
                    }
                    else
                    {
                        dealerTotalHigh += dealerCardShow;
                        System.out.println("The value of the card is " + dealerCardShow);
                        if(dealerAce)
                        {
                            System.out.println("The dealer's total is now " + dealerTotal + " or " + dealerTotalHigh);
                        }
                        else
                        {
                            System.out.println("The dealer's total is now " + dealerTotal);
                        }
                    }
                    //check to see if dealer's total is greater
                    dealerNoMore = anotherCard(playerTotal, playerTotalHigh, dealerTotal, dealerTotalHigh);
                }//while (!dealerNoMore);
                //the while loop runs until the dealer's total is greater than player total
                //}
            }
            //determining the winner using a function (just simplifies it)
            String winner = determineWinner(playerTotal, playerTotalHigh, dealerTotal, dealerTotalHigh);
            System.out.println(winner);
            //Ask player if the want to play again
            System.out.println("Play again? ");
            playAgain = myScanner.next().charAt(0);
            myScanner.nextLine();
        }while (playAgain == 'y');
    }
    //Function to build a deck, accepts an integer to determine the ace value
    public static int[] buildDeck()
    {
        int[] deck = new int[52];
        for(int i = 0; i<13; i++)
            {
                if(i>=10)
                {
                    deck[i] = 10;
                    deck[i+13] = 10;
                    deck[i+26] = 10;
                    deck[i+39] = 10;
                }
                else
                {
                    deck[i] = i + 1;
                    deck[i+13] = i + 1;
                    deck[i+26] = i + 1;
                    deck[i+39] = i + 1;
                }
            }
        return deck;
    }
    //This method will work through the logic of determining the winner when
    //give the current scores
    public static String determineWinner(int playerTotal, int playerTotalH, int dealerTotal, int dealerTotalH)
    {
        String winner;
        if(playerTotal > 21)
        {
            return "";
        }
        if(dealerTotal > 21)
        {
            winner = "Dealer busted! You win!";
        }
        else if(playerTotalH > 21 && dealerTotalH > 21)
        {
            if(playerTotal > dealerTotal)
            {
                winner = "You win!";
            }
            else
            {
                winner = "The dealer wins!";
            }
        }
        else if(playerTotalH > 21 && dealerTotalH <= 21)
        {
            if(dealerTotalH > playerTotal)
            {
                winner = "The dealer wins!";
            }
            else if(dealerTotalH == playerTotal)
            {
                winner = "DRAW!";
            }
            else
            {
                winner = "You win!";
            }
        }
        else if(playerTotalH <= 21 && dealerTotalH > 21)
        {
            if(playerTotalH > dealerTotal)
            {
                winner = "You win!";
            }
            else if(playerTotalH == dealerTotal)
            {
                winner = "DRAW!";
            }
            else
            {
                winner = "The dealer wins!";
            }
        }
        else
        {
            if(playerTotalH > dealerTotalH)
            {
                winner = "You win!";
            }
            else if(playerTotalH==dealerTotalH)
            {
                winner = "DRAW!";
            }
            else
            {
                winner = "The dealer wins!";
            }
        }
        return winner;
    }
    //This method with determine whether the dealer wants to draw another card
    //It calls on the determineWinner(int, int, int, int) function to do so
    public static boolean anotherCard(int playerTotal, int playerTotalH, int dealerTotal, int dealerTotalH)
    {
        boolean higher;
        String winner = determineWinner(playerTotal, playerTotalH, dealerTotal, dealerTotalH);
        if(winner.equals("The dealer wins!"))
        {
            higher = true;
        }
        else if(winner.equals("DRAW!"))
        {
            higher = true;
        }
        else if(winner.equals("Dealer busted! You win!"))
        {
            higher = true;
        }
        else
        {
            higher = false;
        }
        return higher;
    }
}
