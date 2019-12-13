/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * This program will allow the user to input the name of their dog.
 * In return it will display 5 dog breeds that make up the dog's genetics
 * (in theory). 
 */
import java.util.Random;
import java.util.Scanner;
public class DogGenetics {
    public static void main(String[] args) 
    {
        //First we'll get the user to input the dog's name
        String dogName;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is your dog's name? ");
        dogName = myScanner.nextLine();
        //Now we'll tell them what we're going to do
        System.out.println("Well then, I have this highly reliable report on " +
        dogName + " prestigious background right here.");
        System.out.println("\n" + dogName + " is:\n");
        //now we print out the dog breeds
        dogBreeds();
        System.out.println("\n Wow, that's QUITE the dog!");
    }
    //This method will determine the dog breeds 
    //Here's the logic: We know that each percentage needs to be at least 1%
    //As such, the first one cannot be over 96% (since there's 5 breeds)
    //So, we'll pick a random number between 1 and 96 and make that the first one
    //Then, the next one will be a random number in the range of what's left
    //out of 100. And so on until we get to the last number, which will 
    //simply be 100 minus the total of the first four.
    public static void dogBreeds()
    {
        Random randomizer = new Random();
        int total = 100;
        int first, second, third, fourth, fifth;
        first = randomizer.nextInt(96) + 1;
        total = first;
        second = randomizer.nextInt(97 - total) + 1;
        total += second;
        third = randomizer.nextInt(98 - total) + 1;
        total += third;
        fourth = randomizer.nextInt(99 - total)+1;
        total += fourth;
        fifth = 100 - total;
        System.out.println(first + "% St. Bernard");
        System.out.println(second + "% Chihuahua");
        System.out.println(third + "% Dramatic RedNosed Asian Pug");
        System.out.println(fourth + "% Common Cur");
        System.out.println(fifth + "% King Doberman");
        //System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth);
    }
}
