/**
 *
 * @author Lindsay Gen10
 * Date: December 06, 2019
 * This program allows the user to play Rock, Paper, Scissors, Lizard, Spock
 * with the computer for 1 to 10 rounds. The user also has the option to 
 * play again. In this game, 1 = Rock, 2 = Paper, 3 = Scissors, 4 = Lizard,
 * and 5 = Spock.
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsLizardSpock {
    public void doRockPaperScissorsLizardSpock() 
    {
        //build an array of our game items
        GameItem[] gamePieces = new GameItem[5];
        gamePieces[0] = new GameItem("Rock", 2, 0, 1, 1, 0);
        gamePieces[1] = new GameItem("Paper", 1, 2, 0, 0, 1);
        gamePieces[2] = new GameItem("Scissors", 0, 1, 2, 1, 0);
        gamePieces[3] = new GameItem("Lizard", 0, 1, 0, 2, 1);
        gamePieces[4] = new GameItem("Spock", 1, 0, 1, 0, 2);
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        char answer;
        //Welcome and instruction
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, and Spock!");
        System.out.println("How to play: ");
        System.out.println("Rock crushes scissors and rock crushes lizard.");
        System.out.println("Paper covers rock and paper disproves Spock.");
        System.out.println("Scissors cuts paper and scissors decapitates lizard.");
        System.out.println("Lizard eats paper and lizard poisons Spock.");
        System.out.println("Spock smashes scissors and Spock vaporizes rock.");
        System.out.println("When prompted, make your selection.");
        System.out.println("Do you have what it takes to beat me?");
        //this do-while loop will play the game once and then
        //asks if they want to play again
        GameItem playerItem;
        GameItem computerItem;
        do
        {
            int rounds;
            //Ask the user how many rounds they'd like to play
            //If they don't input a valid number, displays error and quits
            System.out.println("How many rounds would you like to play? (Please select a number 1-10)");
            rounds = myScanner.nextInt();
            if(rounds > 10 || rounds < 1)
            {
                System.out.println("That number is outside the range 1 to 10.");
                return;
            }
            int playerSelection, computerSelection;
            int draws = 0, playerWins = 0, computerWins = 0;
            //now we'll play the game using a for loop for the number of rounds
            for(int i=0; i<rounds; i++)
            {
                //first we'll ask for the player's choice
                System.out.println("Please make your selection: ");
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.println("4 - Lizard");
                System.out.println("5 - Spock");
                playerSelection = myScanner.nextInt();
                //After some test runs, it's not very random with such a small field
                //of choices. So I'm going to use modular arimthmetic to spread
                //it out a bit
                computerSelection = randomizer.nextInt(100) % 5 + 1;
                playerItem = gamePieces[playerSelection-1];
                computerItem = gamePieces[computerSelection - 1];
                //Let the user know what was selected (to avoid 
                //suspicions of cheating)
                System.out.println("You selected " + playerItem.getName());
                System.out.println("The computer selected " + computerItem.getName());
                //let's see who won!
                if(computerItem.getStats(playerSelection - 1) > playerItem.getStats(computerSelection - 1))
                {
                    computerWins++;
                    System.out.println("COMPUTER WINS!!");
                }
                else if(computerItem.getStats(playerSelection - 1) < playerItem.getStats(computerSelection - 1))
                {
                    playerWins++;
                    System.out.println("PLAYER WINS!!");
                }
                else
                {
                    draws++;
                    System.out.println("IT'S A DRAW!");
                }
                
            }
            //determine the overall winner
            String winner;
            if(playerWins > computerWins && playerWins >= draws)
            {
                winner = "YOU!";
            }
            else if(computerWins > playerWins && computerWins >= draws)
            {
                winner = "The computer!";
            }
            else
            {
                winner = "It's a draw!";
            }
            System.out.println("Here are the final tallies!");
            System.out.println("Draws: " + draws);
            System.out.println("Player Victories: " + playerWins);
            System.out.println("Computer Victories: " + computerWins);
            System.out.println("The overall winner is...");
            System.out.println(winner);
            //Ask if the player wants to play again
            System.out.println("Would you like to play again? (y/n)");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
        }while(answer=='y' || answer=='Y');
        System.out.println("Thanks for playing!");
    }
}
    