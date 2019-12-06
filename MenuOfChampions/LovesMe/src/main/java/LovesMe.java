/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Random;
public class LovesMe {
    public static void main(String[] args)
    {
        Random randomizer = new Random();
        int petals = randomizer.nextInt(77) + 13;
        boolean love = true;
        System.out.println(petals);
        if(petals % 2 == 1)
        {
            while(petals > 0)
            {
                if(petals % 2 == 0)
                {
                    System.out.println("He loves me not.");
                    love = false;
                }
                else
                {
                    System.out.println("He loves me!!");
                    love = true;
                }
                petals--;
            }
        }
        else
        {
            while(petals > 0)
            {
                if(petals % 2 == 1)
                {
                    System.out.println("He loves me not.");
                    love = false;
                }
                else
                {
                    System.out.println("He loves me!!");
                    love = true;
                }
                petals--;
            }
        }
        if(love)
        {
            System.out.println("I knew he loved me!");
        }
        else
        {
            System.out.println("Aw, bummer.");
        }
        
    }
}
