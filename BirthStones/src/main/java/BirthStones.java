/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class BirthStones {
    public static void main(String[] args)
    {
        //Declaring the variables....again *sigh*
        int month;
        Scanner myScanner = new Scanner(System.in);
        //Let's ask them what month they want first...I'm going to regret this...
        System.out.println("Hey you! What month were you born? (Enter the number)");
        month = myScanner.nextInt();
        //Now, we're going to do this the hard way with if-elses instead of a switch...
        if(month == 1)
        {
            System.out.println("January - Garnet");
        }
        else if(month == 2)
        {
            System.out.println("February - Amethyst");
        }
        else if(month == 3)
        {
            System.out.println("March - Aquamarine");
        }
        else if(month == 4)
        {
            System.out.println("April - Diamond");
        }
        else if(month == 5)
        {
            System.out.println("May - Emerald");
        }
        else if(month == 6)
        {
            System.out.println("June - Pearl");
        }
        else if(month == 7)
        {
            System.out.println("July - Ruby");
        }
        else if(month == 8)
        {
            System.out.println("August - Peridot");
        }
        else if(month == 9)
        {
            System.out.println("September - Sapphire");
        }
        else if(month == 10)
        {
            System.out.println("October - Opal");
        }
        else if(month == 11)
        {
            System.out.println("November - Topaz");
        }
        else if(month == 12)
        {
            System.out.println("December - Turquoise");
        }
        else
        {
            System.out.println("Um, that's not a month Debra.");
        }
        
        //Here's a much more simpler way....
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] stone = {"Garnet", "Amethyst", "Aquamarine", "Diamond", "Emerald", "Pearl", "Ruby", "Peridot", "Sapphire", "Opal", "Topaz", "Turquoise"};
        System.out.println(monthName[month-1] + " - " + stone[month-1]);
    }
}   
