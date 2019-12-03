/**
 *
 * @author Lindsay Gen10
 * Date: December 02, 2019
 **/
import java.util.Scanner;
public class AllAboutMe {
    public static void main(String[] args){
        String myName, faveFood, sPets, sAge, sGnocchi;
        int pets, age;
        boolean gnocchi;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What's your name? ");
        myName = myScanner.nextLine();
        System.out.println("How many pets do you have? ");
        sPets = myScanner.nextLine();
        System.out.println("What's your favorite food? ");
        faveFood = myScanner.nextLine();
        System.out.println("Have you ever had gnocchi? ");
        sGnocchi = myScanner.nextLine();
        System.out.println("How old were you when you learned to whistle? ");
        sAge = myScanner.nextLine();
        
        age = (int) Float.parseFloat(sAge);
        pets = (int) Float.parseFloat(sPets);
        if(sGnocchi.equals("Yes")){
            gnocchi = true;
        }
        else {
            gnocchi = false;
        }
        System.out.println("I am " + myName + ". ");
        System.out.println("I have " + pets + " pets. ");
        System.out.println("My favorite food is " + faveFood + ". ");
        System.out.println("It is " + gnocchi + " that I have eaten gnocchi. ");
        System.out.println("And when I was " + age + " years old, I learned to whistle.");
        
    }
}
