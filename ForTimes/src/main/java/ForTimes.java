/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class ForTimes {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int times;
        System.out.println("Which times table shall I recite?");
        times = myScanner.nextInt();
        for(int i=1; i<=15; i++)
        {
            System.out.println(i + " * " + times + " is: " + i*times);
        }
    }

}
