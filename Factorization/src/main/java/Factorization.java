/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * This program will allow a user to input a number. It will then output
 * the factors of that number and determine whether or not it is
 * prime and/or perfect.
 */
import java.util.Scanner;
public class Factorization {
    public static void main(String[] args) 
    {
        int number;
        Scanner myScanner = new Scanner(System.in);
        //Ask user for a number to factor until they give a positive
        //integer
        do
        {
            System.out.print("What number would you like to factor? ");
            number = myScanner.nextInt();
            if(number <= 0)
            {
                System.out.println("I'm sorry, you must enter a positive integer");
            }
        }while(number <=0);
        //factor the number
        int[] factors = factorNumber(number);
        boolean perfect = isPerfect(number);
        boolean prime = isPrime(number);
        //display factors
        System.out.println("The factors of " + number + " are: ");
        for(int i:factors)
        {
            System.out.println(i);
        }
        //display whether or not its perfect
        if(perfect)
        {
            System.out.println(number + " is a perfect number.");
        }
        else
        {
            System.out.println(number + " is not a perfect number.");
        }
        //display whether or not its prime
        if(prime)
        {
            System.out.println(number + " is a prime number.");
        }
        else
        {
            System.out.println(number + " is not a prime number.");
        }
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
    //this method will check to see if a given number
    //is perfect (sum of factors = number)
    public static boolean isPerfect(int num)
    {
        int[] factors = factorNumber(num);
        int sum = 0;
        for(int i:factors)
        {
            sum += i;
        }
        sum -= num;
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //this method will return an array containing all
    //the factors of a given number
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
    
}
