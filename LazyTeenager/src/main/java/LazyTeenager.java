/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Random;
public class LazyTeenager {
    public static void main(String[] args)
    {
        Random randomizer = new Random();
        int willClean, probability, counter;
        boolean clean = false;
        counter = 0;
        probability = 0;
        do
        {
            System.out.println("Clean your room!");
            counter++;
            if(counter==15)
            {
                System.out.println("There's goes your XBOX! You're grounded!");
                break;
            }
            willClean = randomizer.nextInt(101);
            probability += 5;
            if(willClean<=probability)
            {
                System.out.println("Fine! I'll clean it!");
                clean = true;
            }
        }while(!clean);
    }
}
