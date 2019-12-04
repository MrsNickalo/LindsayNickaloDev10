/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Random;
import java.util.Scanner;
public class CoinFlipper {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        System.out.println("To flip the coin, press Enter: ");
        myScanner.nextLine();
        if(randomizer.nextBoolean())
        {
            System.out.println("TAILS!");
        }
        else
        {
            System.out.println("HEADS!");
        }
    }
}
