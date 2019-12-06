/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
package com.tsguild.foundations.scanner;
import java.util.Scanner;
public class DontForgetToStoreIt {
    public static void main(String[] args){
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals: ");
        pi = myScanner.nextDouble();
        System.out.println("What is the meaning of life, the universe, and everything?");
        meaningOfLifeAndEverything = myScanner.nextInt();
        System.out.println("What is your favorite kind of cheese?");
        cheese = myScanner.next();
        System.out.println("Do you like the color red or blue more?");
        color = myScanner.next();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
        
    }
}
