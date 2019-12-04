/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class YourLifeInMovies {
    public static void main(String[] args)
    {
        //Declaring the variables!
        int age;
        Scanner myScanner = new Scanner(System.in);
        //Let's get their age (as we grin maniacally)
        System.out.println("Hey ya old geezer! How old are ya?");
        age = myScanner.nextInt();
        System.out.println("Ready to feel old?");
        age = 2019 - age;
        //Time to make them feel old with a nested if statement!
        if(age < 2005)
        {
            System.out.println("Pixar's Up came out half a DECADE ago!");
            if(age < 1995)
            {
                System.out.println("You know what? The first Harry Potter movie came out over 15 years ago!");
                if(age < 1985)
                {
                    System.out.println("Remember that movie Space Jam? Yeah, it didn't come out the last decade, but the one BEFORE that!");
                    if(age < 1975)
                    {
                        System.out.println("Jurassic Park's release date is closer to the first lunar landing than to today...");
                        if(age < 1965)
                        {
                            System.out.println("That show you love so much, M.A.S.H.? Yeah, it's been around almost half a century.");
                        }
                    }
                }
            }
        }
        System.out.println("Well, do ya feel old?");
    }
}
