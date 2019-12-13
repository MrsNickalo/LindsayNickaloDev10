/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * This program will allow the use to play Lucky Sevens.
 * The user will have to input an initial bet.
 */
import java.util.Random;
import java.util.Scanner;
public class LuckySevens {
    public void doLuckySevens() 
    {
        Scanner myScanner = new Scanner(System.in);
        int initialMoney, currentMoney = 0, maxMoney = 0, maxRolls = 0, rolls = 0;
        System.out.print("How many dollars do you have? ");
        initialMoney = myScanner.nextInt();
        currentMoney = initialMoney;
        maxMoney = 0;
        while(currentMoney > 0)
        {
            rolls++;
            boolean winOrNot = playLuckySevens();
            if(winOrNot)
            {
                currentMoney +=4;
            }
            else
            {
                currentMoney -=1;
            }
            if(currentMoney > maxMoney)
            {
                maxMoney = currentMoney;
                maxRolls = rolls;
            }
        }
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + maxRolls + " rolls when you had $" + maxMoney + ".");
    }
    //This method will play a round of Lucky Sevens and return a 
    //boolean (true if the player won, false if not)
    public static boolean playLuckySevens()
    {
        int diceOne, diceTwo;
        Random randomizer = new Random();
        diceOne = randomizer.nextInt(6) + 1;
        diceTwo = randomizer.nextInt(6) + 1;
        if(diceOne + diceTwo == 7)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
