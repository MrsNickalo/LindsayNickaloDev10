/**
 *
 * @author Lindsay Gen10
 * Date: December 06, 2019
 * This program will convert a given integer into a Roman Numeral, from 1 to 3,999.
 */
import java.util.Scanner;
public class RomanNumeralConverter {
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        int number;
        char answer;
        do
        {
            do
            {
                System.out.println("Please enter a number to convert between 1 and 3999: ");
                number = myScanner.nextInt();
            }while(number > 3999 || number < 1);
            System.out.println("Roman Numeral Form: " + convertToRoman(number));
            System.out.println("Would you like to go again? (y/n) ");
            answer = myScanner.next().charAt(0);
            myScanner.nextLine();
        }while(answer=='y' || answer=='Y');
    }
    //This method will convert a integer to a Roman Numeral
    public static String convertToRoman(int number)
    {
        String romanString = "";
        while(number >= 1000)
        {
            romanString += "M";
            number -= 1000;
        }
        if(number >= 900)
        {
            romanString += "CM";
            number -= 900;
        }
        else if(number >= 500)
        {
            romanString += "D";
            number -= 500;
            while(number >= 100)
            {
                romanString += "C";
                number -= 100;
            }
        }
        else if(number >=400)
        {
            romanString += "CD";
            number -= 400;
        }
        else
        {
            while(number >= 100)
            {
                romanString += "C";
                number -= 100;
            }
        }
        if(number >=90)
        {
            romanString += "XC";
            number -= 90;
        }
        else if(number >=50)
        {
            romanString += "L";
            number -= 50;
            while(number >= 10)
            {
                romanString += "X";
                number -= 10;
            }
        }
        else if(number >= 40)
        {
            romanString += "XL";
            number -= 40;
        }
        else
        {
            while(number >=10)
            {
                romanString += "X";
                number -= 10;
            }
        }
        if(number == 9)
        {
            romanString += "IX";
            number -= 9;
        }
        else if(number >= 5)
        {
            romanString += "V";
            number -= 5;
            while(number >=1)
            {
                romanString +="I";
                number -= 1;
            }
        }
        else if(number == 4)
        {
            romanString += "IV";
            number -= 4;
        }
        else
        {
            while(number >=1)
            {
                romanString += "I";
                number -= 1;
            }
        }
        return romanString;
    }
}
