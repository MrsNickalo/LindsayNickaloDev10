/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 * NOTE: This program can be made a LOT simpler using the ArrayList object
 * since you don't have to instigate an array with a predefined size
 */
public class FruitsBasket {
    public static void main(String[] args) 
    {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange",
            "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        int appleCounter = 0, orangeCounter = 0;
        for(String i: fruit)
        {
            if(i.equals("Orange"))
            {
                orangeCounter++;
            }
            else if(i.equals("Apple"))
            {
                appleCounter++;
            }
        }
        String[] apples = new String[appleCounter];
        String[] oranges = new String[orangeCounter];
        for(int i=0; i<appleCounter; i++)
        {
            apples[i] = "Apple";
        }
        for(int i=0; i<orangeCounter; i++)
        {
            oranges[i] = "Orange";
        }
        System.out.println("Total Fruit: " + fruit.length);
        System.out.println("Apples: " + apples.length);
        System.out.println("Oranges: " + oranges.length);
    }
}
