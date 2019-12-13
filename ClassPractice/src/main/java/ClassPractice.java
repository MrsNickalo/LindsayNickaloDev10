/**
 *
 * @author Lindsay Gen10
 * Date: December 06, 2019
 * Fooling around with classes in Java
 */
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClassPractice {
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int userSelection;
        System.out.println("Let's play some Pokemon! Choose your card: ");
        System.out.println("1 - Charmander");
        System.out.println("2 - Squirtle");
        System.out.println("3 - Bulbasaur");
        System.out.println("4 - Pikachu");
        userSelection = myScanner.nextInt();
        PokemonCard[] deckOfCards = new PokemonCard[4];
        deckOfCards[0] = new PokemonCard("Charmander", 30, 270);
        deckOfCards[1] = new PokemonCard("Squirtle", 40, 250);
        deckOfCards[2] = new PokemonCard("Bulbasaur", 40, 270);
        deckOfCards[3] = new PokemonCard("Pikachu", 50, 250);
        PokemonCard userCard = deckOfCards[userSelection-1];
        System.out.println("You selected: ");
        userCard.readStats();
        PokemonCard computerCard = deckOfCards[randomizer.nextInt(4)];
        pauseProgram(3);
        System.out.println("The computer has selected: ");
        computerCard.readStats();
        System.out.println("LET'S BATTLE!");
        pauseProgram(3);
        do
        {
            System.out.println(userCard.getName() + " attacks " + computerCard.getName());
            double attackType, attackValue;
            attackType = randomizer.nextInt(100);
            if(attackType > 75)
            {
                attackValue = userCard.criticalAttack();
                System.out.println(userCard.getName() + " has a CRITICAL attack!");
            }
            else
            {
                attackValue = userCard.basicAttack();
            }
            userCard.specialBar += attackValue;
            computerCard.specialBar += attackValue;
            computerCard.defense -= attackValue;
            System.out.println(computerCard.getName() + " is dealt " + attackValue + " damage.");
            System.out.println(computerCard.getName() + " has " + computerCard.getDefense() + " defense left.");
            pauseProgram(3);
            if(userCard.getDefense()==0 || computerCard.getDefense()==0)
            {
                break;
            }
            System.out.println("");
            System.out.println(computerCard.getName() + " attacks " + userCard.getName());
            attackType = randomizer.nextInt(100);
            if(attackType > 75)
            {
                attackValue = computerCard.criticalAttack();
                System.out.println(computerCard.getName() + " has a CRITICAL attack!");
            }
            else
            {
                attackValue = computerCard.basicAttack();
            }
            computerCard.specialBar += attackValue;
            userCard.specialBar += attackValue;
            userCard.defense -= attackValue;
            System.out.println(userCard.getName() + " is dealt " + attackValue + " damage.");
            System.out.println(userCard.getName() + " has " + userCard.getDefense() + " defense left.");
            System.out.println("");
        }while(userCard.getDefense() > 0 && computerCard.getDefense() > 0);
        if(userCard.getDefense() <= 0)
        {
            System.out.println(userCard.getName() + " has been defeated!!");
            System.out.println("Better luck next time...");
        }
        else
        {
            System.out.println(computerCard.getName() + " has been defeated!");
            System.out.println("You won't be so lucky next time...");
        }
    }
    //Method to allow the program to pause x seconds
    public static void pauseProgram(int x)
    {
        try {
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClassPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
