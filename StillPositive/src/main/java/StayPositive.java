/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 */
import java.util.Scanner;
public class StayPositive {
    public static void main(String[] args) 
    {
        int[] numbers;
        int sizeNumbers;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many inputs would you like? ");
        sizeNumbers = myScanner.nextInt();
        numbers = new int[sizeNumbers];
        for(int i=0; i<sizeNumbers; i++)
        {
            System.out.print("Input number: ");
            numbers[i] = myScanner.nextInt();
        }
        System.out.println("Gotta stay positive...!");
        for(int i=0; i<sizeNumbers; i++)
        {
            if(numbers[i] > 0)
            {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
