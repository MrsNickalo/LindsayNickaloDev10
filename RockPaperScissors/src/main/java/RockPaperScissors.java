/**
 *
 * @author Lindsay Gen10
 * Date: December 06, 2019
 * This program allows the user to play Rock, Paper, Scissors with the computer
 * for 1 to 10 rounds. The user also has the option to play again.
 * In this game, 1 = Rock, 2 = Paper, 3 = Scissors.
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public void doRockPaperScissors()
    {
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        char answer;
        //Welcome and instruction
        System.out.println("Welcome to Rock, Paper, and Scissors.");
        System.out.println("How to play: Rock smashes scissors, Scissors cuts paper, "
                + "and Paper covers rock. When prompted, make your selection.");
        System.out.println("Do you have what it takes to beat me?");
        //this do-while loop will play the game once and then
        //asks if they want to play again
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
                //array of names for output purposes
                String[] selections = {"Rock", "Paper", "Scissors"};
                playerSelection = myScanner.nextInt();
                //After some test runs, it's not very random with such a small field
                //of choices. So I'm going to use modular arimthmetic to spread
                //it out a bit (don't know if this is technically mathematically
                //sound principle but it does make me feel better
                computerSelection = randomizer.nextInt(100) % 3 + 1;
                //Let the user know what was selected (to avoid 
                //suspicions of cheating)
                System.out.println("You selected " + selections[playerSelection - 1]);
                System.out.println("The computer selected " + selections[computerSelection - 1]);
                //first we'll take care of the draw case
                if(playerSelection == computerSelection)
                {
                    draws++;
                    System.out.println("IT'S A DRAW!");
                }
                //if the player won
                else if(didPlayerWin(playerSelection, computerSelection))
                {
                    playerWins++;
                    System.out.println("YOU WIN!");
                }
                //if the computer won
                else
                {
                    computerWins++;
                    System.out.println("COMPUTER WINS!");
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
    //This method will determine the winner of the round
    //We disregard the case of a draw since it is taken care of in the program
    //On second thought, I wonder if doing a Switch statement here would be better...
    public static boolean didPlayerWin(int player, int computer)
    {
        boolean playerWon;
        if(player == 1)
        {
            if(computer == 2)
            {
                playerWon = false;
            }
            else
            {
                playerWon = true;
            }
        }
        else if(player == 2)
        {
            if(computer == 1)
            {
                playerWon = true;
            }
            else
            {
                playerWon = false;
            }
        }
        else
        {
            if(computer == 1)
            {
                playerWon = false;
            }
            else
            {
                playerWon = true;
            }
        }
        return playerWon;
    }
}
