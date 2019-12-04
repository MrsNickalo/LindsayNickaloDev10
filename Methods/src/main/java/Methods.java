/**
 *
 * @author Lindsay Gen10
 * Date: December 04, 2019
 * Writing some potentially useful methods :)
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Methods {
    //Method to allow the program to pause x seconds
    public static void pauseProgram(int x)
    {
        try {
            TimeUnit.SECONDS.sleep(x);
        } catch (InterruptedException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Method that accepts prompt and float and returns the input as a float
    //Really, the only reason I've included a second input it so I can overload the function
    public static float readValue(String prompt, float x)
    {
        String input;
        Scanner myScanner = new Scanner(System.in);
        System.out.println(prompt);
        input = myScanner.nextLine();
        return Float.parseFloat(input);
    }
    //Overloaded method to accept prompt and int and return int
    public static int readValue(String prompt, int x)
    {
        String input;
        Scanner myScanner = new Scanner(System.in);
        System.out.println(prompt);
        input = myScanner.nextLine();
        return (int) Float.parseFloat(input);
    }
    //Shall we overload it again???
    //Later we'll figure out a better way to overload this...
    public static char readValue(String prompt, char x)
    {
        String input;
        Scanner myScanner = new Scanner(System.in);
        System.out.println(prompt);
        input = myScanner.nextLine();
        return input.charAt(0);
    }
    //Let's do a method for factorials!
    public static int factorial(int x)
    {
        int total = 1;
        for(int i=1; i<=x; i++)
        {
            total = total * i;
        }
        return total;
    }
    public static void main(String[] args)
    {
        float testFloat, tempF;
        int testInt, tempI;
        char testChar, tempC;
        int testFactorial, answer;
        tempF = 1;
        tempI = 1;
        tempC = '1';
        System.out.println("Useful methods for future use");
        pauseProgram(2);
        System.out.println("Did it pause?");
        testFloat = readValue("Enter a number please: ", tempF);
        System.out.println("Your float: " + testFloat);
        testInt = readValue("Enter a number please: ", tempI);
        System.out.println("Your int: " + testInt);
        testChar = readValue("Enter a character: ", tempC);
        System.out.println("Your character: " + testChar);
        testFactorial = readValue("Enter a number to find its factorial: ", tempI);
        answer = factorial(testFactorial);
        System.out.println(testFactorial + "! = " + answer);
    }
}
