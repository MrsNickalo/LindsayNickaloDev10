/**
 *
 * @author Lindsay Gen10
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TriviaNight {
    static void pauseProgram()
    {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(TriviaNight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("HELLO EVERYBODY!!!");
        //Some code to create a small delay (for dramatic effect)
        pauseProgram();
        System.out.println("LET'S GET READY TO RUUUUUMMMMMBBBLLLLEEEEE!!!!!!");
        pauseProgram();
        System.out.println("This. Is. Jeopar---I mean Trivia Night!");
        pauseProgram();
        System.out.println("You'll have to excuse me...I get a little excited sometimes...");
        System.out.println("I mean, I don't get a lot of company...");
        pauseProgram();
        System.out.println("Anyways, I will give you three questions.");
        System.out.println("Get them all right, you win! Miss even one...YOU LOSE!");
        System.out.println("Are you ready? (Press Enter)");
        myScanner.nextLine();
        int ans1, ans2, ans3, points;
        points = 0;
        String qOne, qTwo, qThree;
        String ansA1, ansB1, ansC1, ansA2, ansB2, ansC2, ansA3, ansB3, ansC3;
        qOne = "The Three Stooges are Larry, Moe, and ___?";
        ansA1 = "1) Curly ";
        ansB1 = "2) Murrey ";
        ansC1 = "3) Whitey ";
        qTwo = "How many feet are in a football field?";
        ansA2 = "1) 100";
        ansB2 = "2) 300";
        ansC2 = "3) 500";
        qThree = "Lisa's mom has three kids - April, May, and who?";
        ansA3 = "1) June";
        ansB3 = "2) Not enough information";
        ansC3 = "3) Lisa";

        //Question Number One
        System.out.println("Question Number One");
        System.out.println(qOne);
        System.out.println("Is it: ");
        System.out.println(ansA1);
        System.out.println(ansB1);
        System.out.println(ansC1);
        ans1 = myScanner.nextInt();
        if(ans1>4 || ans1<0)
        {
            System.out.println("That's not even an option! You FAIL!");
            return;
        }
        else if(ans1 == 1)
        {
            System.out.println("YOU ARE CORRECT!");
            points++;
        }
        else
        {
            System.out.println("WRONG!!!!");
        }
        //Question Number Two
        System.out.println("Question Number Two");
        System.out.println(qTwo);
        System.out.println("Is it: ");
        System.out.println(ansA2);
        System.out.println(ansB2);
        System.out.println(ansC2);
        ans2 = myScanner.nextInt();
        if(ans2>4 || ans2<0)
        {
            System.out.println("That's not even an option! You FAIL!");
            return;
        }
        else if(ans2 == 2)
        {
            System.out.println("YOU ARE CORRECT!");
            points++;
        }
        else
        {
            System.out.println("WRONG!!!!");
        }
        //Question Number Three
        System.out.println("Question Number Three");
        System.out.println(qThree);
        System.out.println("Is it: ");
        System.out.println(ansA3);
        System.out.println(ansB3);
        System.out.println(ansC3);
        ans3 = myScanner.nextInt();
        if(ans3>4 || ans3<0)
        {
            System.out.println("That's not even an option! You FAIL!");
            return;
        }
        else if(ans3 == 3)
        {
            System.out.println("YOU ARE CORRECT!");
            points++;
        }
        else
        {
            System.out.println("WRONG!!!!");
        }
        if(points==3)
        {
            System.out.println("Well, you won...Betcha can't do it again!");
        }
        else
        {
            System.out.println("Better luck next time you amateur!");
        }
    }   
}
