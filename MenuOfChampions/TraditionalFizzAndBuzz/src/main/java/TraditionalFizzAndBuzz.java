/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class TraditionalFizzAndBuzz {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int units; 
        int counter = 0;
        System.out.println("How many fizzing and buzzing units do you need in your life?");
        units = myScanner.nextInt();
        for(int i=0; i<=(3*units); i++)
        {
            if(i==0)
            {
                System.out.println(i);
            }
            else if(i%3==0 && i%5==0)
            {
                System.out.println("fizz buzz");
                counter++;
            }
            else if(i%3==0)
            {
                System.out.println("fizz");
                counter++;
            }
            else if(i%5==0)
            {
                System.out.println("buzz");
                counter++;
            }
            else
            {
                System.out.println(i);
            }
            if(counter == units)
            {
                break;
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
