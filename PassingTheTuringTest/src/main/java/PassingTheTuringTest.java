/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
package com.tsguild.foundations.scanner;
import java.util.Scanner;
public class PassingTheTuringTest {
    public static void main(String[] args){
        //Declare necessary variables
        String userName, userColor, userFood;
        int userNumber;
        String myName, myColor, myFood;
        int myNumber;
        //Declare new scanner to read input
        Scanner myScanner = new Scanner(System.in);
        //Pre-set "AI's" preferences
        myName = "Lindsay";
        myColor = "red";
        myFood = "Pizza";
        myNumber = 21;
        //Begin Conversation
        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        userName = myScanner.nextLine();
        System.out.print("Hi, " + userName + "! My name is " + myName + ". ");
        System.out.println("What's your favorite color?");
        userColor = myScanner.nextLine();
        System.out.println("Huh, " + userColor + "? Mine's " + myColor + ".");
        System.out.println("I really like " + myFood + ". It's my favorite food.");
        System.out.print("What's YOUR favorite food, " + userName + "? ");
        userFood = myScanner.nextLine();
        System.out.println("Really? " + userFood + "? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number? ");
        userNumber = myScanner.nextInt();
        System.out.println(userNumber + " is a cool number. Mine's " + myNumber + ". ");
        System.out.println("Did you know " + userNumber + " * " + myNumber + " is " + userNumber * myNumber + "? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + userName + "!");
    }
}
