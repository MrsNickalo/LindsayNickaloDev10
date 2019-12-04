/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class FieldDay {
    public static void main(String[] args)
    {
        String baggins = "Baggins";
        String dresden = "Dresden";
        String howl = "Howl";
        String potter = "Potter";
        String vimes = "Vimes";
        String lastName;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's your last name?");
        lastName = myScanner.nextLine();
        System.out.print("Aha! You're on the team");
        if((lastName.compareTo( baggins )) < 0)
        {
            System.out.print(" Red Dragons!");
        }
        else if((lastName.compareTo( dresden )) < 0)
        {
            System.out.print(" Dark Wizards!");
        }
        else if((lastName.compareTo( howl )) < 0)
        {
            System.out.print(" Moving Castles!");
        }
        else if((lastName.compareTo( potter )) < 0)
        {
            System.out.print(" Golden Snitches!");
        }
        else if((lastName.compareTo( vimes )) < 0)
        {
            System.out.print(" Night Guards!");
        }
        else
        {
            System.out.print(" Black Holes!");
        }
    }
}
