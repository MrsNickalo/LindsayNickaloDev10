/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 */
import java.util.Random;
public class BarelyControlledChaos {
    public static void main(String[] args)
    {
        String color = chooseColor();
        String animal = chooseAnimal();
        String colorAgain = chooseColor();
        int weight = pickRandomInt(5, 20);
        int distance = pickRandomInt(10, 20);
        int number = pickRandomInt(10000, 20000);
        int time = pickRandomInt(2, 6);
        
        System.out.println("Once, when I was very small...");
        System.out.println("I was chased by a " + color + ", " + weight + "lb miniature " + animal + " for over " + distance + " miles!!");
        System.out.println("I have to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");
        System.out.println("\nIt was QUITE the experience, let me tell you!");
    }
    public static String chooseColor()
    {
        Random randomizer = new Random();
        int choice = randomizer.nextInt(10);
        switch(choice)
        {
            case 0:
                return "Red";
            case 1:
                return "Orange";
            case 2:
                return "Yellow";
            case 3:
                return "Green";
            case 4:
                return "Blue";
            case 5:
                return "Indigo";
            case 6:
                return "Purple";
            case 7:
                return "Pink";
            case 8:
                return "Black";
            default:
                return "White";
        }
    }
    public static String chooseAnimal()
    {
        Random randomizer = new Random();
        int choice = randomizer.nextInt(10);
        switch(choice)
        {
            case 0:
                return "Cat";
            case 1:
                return "Dog";
            case 2:
                return "Horse";
            case 3:
                return "Cow";
            case 4:
                return "Giraffe";
            case 5:
                return "Hippopotamus";
            case 6:
                return "Rhinocerous";
            case 7:
                return "White Tiger";
            case 8:
                return "Lion";
            default:
                return "Men";
        }
    }
    public static int pickRandomInt(int start, int end)
    {
        Random randomizer = new Random();
        int range = end - start;
        int answer = randomizer.nextInt(range + 1);
        return answer + start;
    }
}
