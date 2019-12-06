/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class MiniZork {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to teh house, or open the mailbox?");
        String action = myScanner.nextLine();
        if(action.equals("open the mailbox"))
        {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in?");
            action = myScanner.nextLine();
            if(action.equals("look inside"))
            {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So...so very dark.");
                System.out.print("Run away or keep looking> ");
                action = myScanner.nextLine();
                if(action.equals("keep looking"))
                {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                }
                else if(action.equals("run away"))
                {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            }
            else if(action.equals("go to the house"))
            {
                System.out.println("You slowly walk towards the house.");
                System.out.println("You start to hear footsteps behind you.");
                System.out.println("Do you run towards the house or turn around?");
                action = myScanner.nextLine();
                if(action.equals("run towards house"))
                {
                    System.out.println("You run towards the house as fast as you can.");
                    System.out.println("When you get to the door, it suddenly swings open.");
                    System.out.println("Do you go inside or go around the house?");
                    action = myScanner.nextLine();
                    if(action.equals("go inside"))
                    {
                        System.out.println("You slowly step inside the house.");
                        System.out.println("There's a strange chill around you.");
                        System.out.println("As you walk towards the living room, ");
                        System.out.println("you get a strange feeling that you've been here.");
                        System.out.println("It's at that moment you remember...");
                        System.out.println("You died long ago and had haunted your home ever since.");
                    }
                    else if(action.equals("go around the house"))
                    {
                        System.out.println("You run around the house scared of what's inside.");
                        System.out.println("When you turn the corner, you're met by ");
                        System.out.println("your entire family, wondering where you've been.");
                        System.out.println("They don't believe you when you tell them your story.");
                        System.out.println("You better be careful or they'll send you to the asylum.");
                    }
                }
                else if(action.equals("turn around"))
                {
                    System.out.println("You turn around with confidence to face this new foe.");
                    System.out.println("Before you stands a tall man, shrouded in a dark cloak.");
                    System.out.println("When you see the reaper by his side, your heart sinks.");
                    System.out.println("Do you try to run or accept your fate?");
                    action = myScanner.nextLine();
                    if(action.equals("try to run"))
                    {
                        System.out.println("You try to run but he raises his blade.");
                        System.out.println("There's a final swish as his blade runs through the air.");
                        System.out.println("It looks like your bravery wasn't so good afterall.");
                    }
                    else if(action.equals("accept your fate"))
                    {
                        System.out.println("You stand tall as he raises his blade.");
                        System.out.println("You stare into the emptiness where his face should be, ");
                        System.out.println("hoping it will be quick.");
                        System.out.println("Suddenly the cloak falls and there's your brother!");
                        System.out.println("That's wasn't a very nice April Fool's prank...");
                    }
                }
            }
        }
        else if(action.equals("go to the house"))
        {
            
        }
    }

}
