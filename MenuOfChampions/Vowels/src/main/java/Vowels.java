/**
 *
 * @author Lindsay Gen10
 * Date: December 04, 2019
 * Program that accepts a list of words and groups those 
 * that share vowels (no matter order or number)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String wordInput;
        char answer;
        printInstructions();
        //this will fill in and array with the words the user enters
        do
        {
            System.out.println("Please enter a word: ");
            wordInput = myScanner.nextLine();
            words.add(wordInput);
            System.out.println("Would you like to insert another word? (y/n)");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
        }while(answer=='y'||answer=='Y');
        wordInput = words.get(0);
        //now we're going to compare the words
        //If they have the same vowels, we'll place them in the final list
        ArrayList<String> finalWords = new ArrayList<String>();
        finalWords.add(wordInput);
        for(int i=1; i<words.size(); i++)
        {
            if(compareVowels(wordInput, words.get(i)))
            {
                finalWords.add(words.get(i));
            }
        }
        for(int i=0; i<finalWords.size(); i++)
        {
            if(i<finalWords.size()-1)
            {
                System.out.print(finalWords.get(i) + ", ");
            }
            else
            {
                System.out.println(finalWords.get(i));
            }
        }
    }
    //Method to print out instructions
    public static void printInstructions()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("This program will allow you to input a list of words.");
        System.out.println("It will then take those words and find all that have");
        System.out.println("the same vowels present as the first word (excluding y).");
        System.out.println("Press enter if you're ready to start entering words.");
        myScanner.nextLine();
    }
    //This method accepts two words and will tell you if they contain the same vowels
     public static boolean compareVowels(String one, String two)
    {
        boolean oneA = false, oneE = false, oneI = false, oneO = false, oneU = false;
        boolean twoA = false, twoE = false, twoI = false, twoO = false, twoU = false;
        boolean matchA = false, matchE = false, matchI = false, matchO = false, matchU = false;
        boolean allMatch = false;
        String vowel;
        for(int i=0; i<one.length(); i++)
        {
            vowel = one.substring(i,i+1);
            if(vowel.equalsIgnoreCase("a"))
            {
                oneA = true;
            }
            else if(vowel.equalsIgnoreCase("e"))
            {
                oneE = true;
            }
            else if(vowel.equalsIgnoreCase("i"))
            {
                oneI = true;
            }
            else if(vowel.equalsIgnoreCase("o"))
            {
                oneO = true;
            }
            else if(vowel.equalsIgnoreCase("u"))
            {
                oneU = true;
            }
        }
        for(int i=0; i<two.length(); i++)
        {
            vowel = two.substring(i,i+1);
            if(vowel.equalsIgnoreCase("a"))
            {
                twoA = true;
            }
            else if(vowel.equalsIgnoreCase("e"))
            {
                twoE = true;
            }
            else if(vowel.equalsIgnoreCase("i"))
            {
                twoI = true;
            }
            else if(vowel.equalsIgnoreCase("o"))
            {
                twoO = true;
            }
            else if(vowel.equalsIgnoreCase("u"))
            {
                twoU = true;
            }
        }
        if((oneA && twoA) || (!oneA && !twoA))
        {
            matchA = true;
        }
        if((oneE && twoE) || (!oneE && !twoE))
        {
            matchE = true;
        }
        if((oneI && twoI) || (!oneI && !twoI))
        {
            matchI = true;
        }
        if((oneO && twoO) || (!oneO && !twoO))
        {
            matchO = true;
        }
        if((oneU && twoU) || (!oneU && !twoU))
        {
            matchU = true;
        }
        if(matchA && matchE && matchI && matchO && matchU)
        {
            allMatch = true;
        }
        return allMatch;
    }
}
