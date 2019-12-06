/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class AllTheTrivia {
    public static void main(String[] args){
        //Declare necessary variables
        String answerOne, answerTwo, answerThree, answerFour;
        //Scanner declaration
        Scanner myScanner = new Scanner(System.in);
        //Questions to be asked
        String qOne, qTwo, qThree, qFour;
        qOne = "1,024 Gigabytes is equal to one what? ";
        qTwo = "In our Solar System, which is the only planet that rotates clockwise? ";
        qThree = "The largest volcano ever discovered in our Solar System is located on which planet? ";
        qFour = "What is the most abundant element in the Earth's atmosphere? ";
        //Ask questions and get input
        System.out.print(qOne);
        answerOne = myScanner.nextLine();
        System.out.print(qTwo);
        answerTwo = myScanner.nextLine();
        System.out.print(qThree);
        answerThree = myScanner.nextLine();
        System.out.print(qFour);
        answerFour = myScanner.nextLine();
        //Let's mix up the answers!
        System.out.println("Wow, 1,024 Gigabytes is a " + answerThree + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + answerOne + ".");
        System.out.println("That's amazing that " + answerTwo + " is the most abundant element in the atmostphere...");
        System.out.println(answerFour + " is the only planet that rotates clockwise, neat!");
    }
}
