/**
 *
 * @author Lindsay Gen10
 * Date: December 06, 2019
 * Converts an English word or sentence into Pig Late
 */
import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        String word, sentence;
        System.out.print("Enter a word to translate into Pig Latin: ");
        word = myScanner.nextLine();
        System.out.println("Translation: " + translateWord(word));
        System.out.println("Enter a sentence to be translated: ");
        sentence = myScanner.nextLine();
        System.out.println("Tranlsation: " + translateSentence(sentence));
    }
    //method to convert word to Pig Latin
    public static String translateWord(String englishWord)
    {
        int firstVowel = 0;
        for(int i=0; i<englishWord.length(); i++)
        {
            if(englishWord.charAt(i)=='a'||englishWord.charAt(i)=='A')
            {
                firstVowel = i;
                break;
            }
            else if(englishWord.charAt(i)=='e'||englishWord.charAt(i)=='E')
            {
                firstVowel = i;
                break;
            }
            else if(englishWord.charAt(i)=='i'||englishWord.charAt(i)=='I')
            {
                firstVowel = i;
                break;
            }
            else if(englishWord.charAt(i)=='o'||englishWord.charAt(i)=='O')
            {
                firstVowel = i;
                break;
            }
            else if(englishWord.charAt(i)=='u'||englishWord.charAt(i)=='U')
            {
                firstVowel = i;
                break;
            }
        }
        String pigLatin;
        if(firstVowel != 0)
        {
            pigLatin = englishWord.substring(firstVowel,englishWord.length()) + englishWord.substring(0,firstVowel) + "ay";
        }
        else
        {
            pigLatin = englishWord + "yay";
        }
        return pigLatin;
    }
    //method to translate entire sentence
    public static String translateSentence(String sentence)
    {
        String[] words = sentence.split(" ");
        String pigLatin = "";
        for(int i=0; i<words.length; i++)
        {
            if(i == words.length - 1)
            {
                pigLatin += translateWord(words[i]);
            }
            else
            {
                pigLatin += translateWord(words[i]) + " ";
            }
        }
        pigLatin += ".";
        return pigLatin;
    }
    
}
