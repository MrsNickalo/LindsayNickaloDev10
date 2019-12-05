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
        System.out.println("This program will allow you to input a list of words.");
        System.out.println("It will then take those words and find all that have");
        System.out.println("the same vowels present as the first word (excluding y).");
        System.out.println("Press enter if you're ready to start entering words.");
        myScanner.nextLine();
        do
        {
            System.out.println("Please enter a word: ");
            wordInput = myScanner.nextLine();
            words.add(wordInput);
            System.out.println("Would you like to insert another word? (y/n)");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
        }while(answer=='y'||answer=='Y');
        ArrayList<String> finalWords = new ArrayList<String>();
        ArrayList<String> testOneChar = new ArrayList<String>();
        wordInput = words.get(0);
        String vowel;
        //We're going to build an array holding the vowels we're looking for
        //from the first word
        for(int i=0; i<wordInput.length(); i++)
        {
            vowel = wordInput.substring(i,i+1);
            if(vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e") || vowel.equalsIgnoreCase("i") || vowel.equalsIgnoreCase("o") || vowel.equalsIgnoreCase("u"))
            {
                testOneChar.add(vowel);
            }
        }
        //Can we clean up that array for repeats?
        for(int i=0; i<testOneChar.size();i++)
        {
            for(int j=i+1; j<testOneChar.size(); j++)
            {
                if((testOneChar.get(i)).equals(testOneChar.get(j)))
                {
                    //we don't want to just remove the element because it will mess up our for loop....
                    //Option one is to change it to another character
                    //And then cycle through and remove all those....
                    
                }
            }
        }
        ArrayList<String> testTwoChar = new ArrayList<String>();
        String testTwo;
        for(int i=1; i<words.size(); i++)
        {
            testTwo = words.get(i);
        }
        
        for(int i=0; i<words.size(); i++)
        {
            System.out.print(words.get(i) + ", ");
        }
    }
}
