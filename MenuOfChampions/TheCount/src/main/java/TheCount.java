/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class TheCount {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int start, end, increment, counter;
        counter = 0;
        System.out.println("***I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU!***");
        System.out.print("Start at : ");
        start = myScanner.nextInt();
        System.out.print("Stope at : ");
        end = myScanner.nextInt();
        System.out.print("Count by : ");
        increment = myScanner.nextInt();
        for(int i=start; i<=end; i+=increment)
        {
            counter++;
            System.out.print(i + " ");
            if(counter==3)
            {
                System.out.print("- Ah ah ah!");
                System.out.println("");
                counter = 0;
            }
        }
    }
}
