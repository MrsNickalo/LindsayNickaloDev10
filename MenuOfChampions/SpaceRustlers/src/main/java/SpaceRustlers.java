/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
public class SpaceRustlers {
    public static void main(String[] args)
    {
        //We must declare the variables!
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        //Now, let's see if there's enough aliens to fly the spaceships
        if(aliens > spaceships)
        {
            System.out.println("Vrroom, vroom! Let's get going!");
        }
        else
        {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        //Now, is there enough space in the spaceships for the cows or are there too many cows or too many spaceships
        //By using the else if, we only evaluate the statement if the previous isn't true
        //Saves computational power and time while helping us separate cases better
        //Without it, it wouldn't print out anything if there were more cows than spaceships
        if(cows == spaceships)
        {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        }
        else if(cows > spaceships)
        {
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
        }
        else
        {
            System.out.println("Too many ships! Not enough cows.");
        }
        //what if there's more cows than aliens?!?!
        if(aliens > cows)
        {
            System.out.println("Hurrah! We've got the grub! Hamburger party on Alpha Centauri!");
        }
        else
        {
            System.out.println("Oh no! The herds got restless and took over! Looks like \"we're\" hamburger now!!");
        }
    }
}
