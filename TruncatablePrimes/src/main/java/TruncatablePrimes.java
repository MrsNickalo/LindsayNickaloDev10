/**
 *
 * @author Lindsay Gen10
 * Date: December 06, 2019
 * This program will accept an integer and determine whether it is a 
 * left-truncatable prime, right-truncatable prime, both, or none.
 */
import java.util.Scanner;
public class TruncatablePrimes {
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        String numberString;
        System.out.println("Enter an integer: ");
        //We read this in as a string to first check if it has a zero
        numberString = myScanner.nextLine();
        System.out.println(truncatable(numberString));
        
    }
    //This method factors a number
    public static int[] factorNumber(int num)
    {
        //define an array to check each number
        int[] factorsRough = new int[num];
        //we're going to initialize all values to zero so 
        //that when we go to create the final array of factors
        //it's easier to check which ones were
        for(int i=0; i<num; i++)
        {
            factorsRough[i] = 0;
        }
        //this will track our number of factors
        int numFactors = 0;
        //let's check what are factors
        for(int i=1; i<=num/2; i++)
        {
            if(num % i == 0)
            {
                factorsRough[i-1] = i;
                factorsRough[(num/i)-1] = num/i;
                numFactors++;
            }
        }
        //now we'll create our factor array to return
        int[] factors = new int[numFactors];
        //we will fill it with all values that aren't zero
        for(int i=0; i<numFactors; i++)
        {
            for(int j=0; j<num; j++)
            {
                if(factorsRough[j] != 0)
                {
                    factors[i] = factorsRough[j];
                    factorsRough[j] = 0;
                    break;
                }
            }
        }
        return factors;
    }
    //this method will check to see if a number is prime
    //(only two factors, one and itself - excludes one itself)
    public static boolean isPrime(int num)
    {
        int[] factors = factorNumber(num);
        if(factors.length > 2 || num == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    //This method will determine if the number has a zero
    public static boolean hasZero(String number)
    {
        boolean zeroPresent = false;
        if(number.contains("0"))
        {
            zeroPresent = true;
        }
        return zeroPresent;
    }
    //This method will determine the type of prime it is
    public static String truncatable(String numberString)
    {
        boolean left = true, right = true;
        int number = Integer.parseInt(numberString);
        if(hasZero(numberString))
        {
            return "none";
        }
        String test = numberString.substring(1);
        while(test.length() > 0)
        {
            number = Integer.parseInt(test);
            if(!isPrime(number))
            {
                left = false;
                break;
            }
            test = test.substring(1);
        }
        test = numberString.substring(0,numberString.length() - 1);
        while(test.length() > 0)
        {
            number = Integer.parseInt(test);
            if(!isPrime(number))
            {
                right = false;
                break;
            }
            test = test.substring(0, test.length() - 1);
        }
        if(left && right)
        {
            return "both";
        }
        else if(left)
        {
            return "left";
        }
        else if(right)
        {
            return "right";
        }
        else
        {
            return "none";
        }
    }
}
