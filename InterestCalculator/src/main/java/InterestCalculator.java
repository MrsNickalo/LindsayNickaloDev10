/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * This program will allow a user to input an annual interest rate,
 * the initial principal amount, and a number of years to view
 * how much interest will be earned over that period of time.
 * It will also allow the user to adjust to compounded interest monthly,
 * quarterly, or daily.
 */
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class InterestCalculator {
    public void doInterestCalculator() 
    {
        //These are the calculations we have to run using the defined methods
        double[] userInput = getInput();
        double quarterlyTotal = quarterlyInterest(userInput[0], userInput[1]);
        double yearlyTotal = yearlyInterest(userInput[0], userInput[1]);
        double quarterlyInterest = quarterlyTotal - userInput[0];
        double yearlyInterest = yearlyTotal - userInput[0];
        double multiYearTotal = multiYearInterest(userInput[0], userInput[1], userInput[2]);
        double multiYearInterest = multiYearTotal - userInput[0];
        
        //The output to the user
        System.out.println("Your initial investment: $" + roundNum(userInput[0]));
        System.out.println("The interest earned for the first quarter is: $" + roundNum(quarterlyInterest));
        System.out.println("The total after the first quarter is: $" + roundNum(quarterlyTotal));
        System.out.println("The interest earned for the year is: $" + roundNum(yearlyInterest));
        System.out.println("The total after the first year is: $" + roundNum(yearlyTotal));
        System.out.println("The interest earned after " + userInput[2] + " years is: $" + roundNum(multiYearInterest));
        System.out.println("The total after " + userInput[2] + " years is: $" + roundNum(multiYearTotal));
        
        //Now, let's give the user some options
        Scanner myScanner = new Scanner(System.in);
        char answer;
        do
        {
            nextCalculation(userInput[0], userInput[1]);
            System.out.println("Would you like to do it again? (y/n)");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
        }while(answer == 'y');
        
    }
    //this method will calculate the interest for the day
    public static double dailyInterest(double principal, double interest)
    {
        double finalAmount;
        finalAmount = principal * (1 + ((interest/365))/100);
        return finalAmount;
    }
    //this method will calculate the interest for the month
    public static double monthlyInterest(double principal, double interest)
    {
        double finalAmount;
        finalAmount = principal * (1 + ((interest/12))/100);
        return finalAmount;
    }
    //this method will calculate the interest for the half year
    public static double biAnnuallyInterest(double principal, double interest)
    {
        double finalAmount;
        finalAmount = principal * (1 + ((interest/2))/100);
        return finalAmount;
    }
    //this method will calculate the interest for the quarter
    public static double quarterlyInterest(double principal, double interest)
    {
        double finalAmount;
        finalAmount = principal * (1 + ((interest/4))/100);
        return finalAmount;
    }
    //this method will calculate the interest for a whole year
    //using the quarterly rate
    public static double yearlyInterest(double principal, double interest)
    {
        double finalAmount = 0;
        for(int i=0; i<4; i++)
        {
            finalAmount = quarterlyInterest(principal, interest);
            principal = finalAmount;
        }
        return finalAmount;
    }
    //this method will calculate the interest after the requested
    //number of years
    public static double multiYearInterest(double principal, double interest, double years)
    {
        double finalAmount = 0;
        for(int i=0; i<years; i++)
        {
            finalAmount = yearlyInterest(principal, interest);
            principal = finalAmount;
        }
        return finalAmount;
    }
    //this method will round a number for us to the nearest dollar
    //using Banker Rounding (better known as Half-Even)
    public static String roundNum(double number)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        return df.format(number);
    }
    //This method will get the user's input for the program
    public static double[] getInput()
    {
        double[] input = new double[3];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE INTEREST CALCULATOR");
        System.out.println("What principal would you like to invest?");
        input[0] = myScanner.nextDouble();
        System.out.println("What is the annual interest rate?");
        input[1] = myScanner.nextDouble();
        System.out.println("How many years would you like to calculate for?");
        input[2] = myScanner.nextDouble();
        return input;
    }
    //This method will give the user the option of choosing what type of
    //compounding they want.
    public static char chooseCompounding()
    {
        char response;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What type of interest compounding would you like to explore? Press:");
        System.out.println("");
        System.out.println("y - yearly");
        System.out.println("s - semi-annually");
        System.out.println("q - quarterly");
        System.out.println("m - monthly");
        System.out.println("d - daily");
        System.out.println("");
        response = myScanner.next().charAt(0);
        myScanner.nextLine();
        return response;
    }
    public static void nextCalculation(double principal, double interest)
    {
        double[] userInput = {principal, interest};
        boolean goodEntry;
        do
        {
            char compoundSelect = chooseCompounding();
            if(compoundSelect == 'y')
            {
                double yearlyTotal = yearlyInterest(userInput[0], userInput[1]);
                double yearlyInterest = yearlyTotal - userInput[0];
                System.out.println("The interest earned for the year is: $" + roundNum(yearlyInterest));
                System.out.println("The total after the year is: $" + roundNum(yearlyTotal));
                goodEntry = true;
            }
            else if(compoundSelect == 'b')
            {
                double biAnnualTotal = biAnnuallyInterest(userInput[0], userInput[1]);
                double biAnnualInterest = biAnnualTotal - userInput[0];
                System.out.println("The interest earned for the first half of the year is: $" + roundNum(biAnnualInterest));
                System.out.println("The total after the first half of the year is: $" + roundNum(biAnnualTotal));
                goodEntry = true;
            }
            else if(compoundSelect == 'q')
            {
                double quarterlyTotal = quarterlyInterest(userInput[0], userInput[1]);
                double quarterlyInterest = quarterlyTotal - userInput[0];
                System.out.println("The interest earned for the first quarter is: $" + roundNum(quarterlyInterest));
                System.out.println("The total after the first quarter is: $" + roundNum(quarterlyTotal));
                goodEntry = true;
            }
            else if(compoundSelect == 'm')
            {
                double monthlyTotal = monthlyInterest(userInput[0], userInput[1]);
                double monthlyInterest = monthlyTotal - userInput[0];
                System.out.println("The interest earned for the first month is: $" + roundNum(monthlyInterest));
                System.out.println("The total after the first month is: $" + roundNum(monthlyTotal));
                goodEntry = true;
            }
            else if(compoundSelect == 'd')
            {
                double dailyTotal = dailyInterest(userInput[0], userInput[1]);
                double dailyInterest = dailyTotal - userInput[0];
                System.out.println("The interest earned for the first day is: $" + roundNum(dailyInterest));
                System.out.println("The total after the first day is: $" + roundNum(dailyTotal));
                goodEntry = true;
            }
            else
            {
                goodEntry = false;
            }
        }while(!goodEntry);
    }
}
