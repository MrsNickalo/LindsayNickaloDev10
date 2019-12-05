/**
 *
 * @author Lindsay Gen10
 * Date: December 05, 2019
 */
public class FruitSalad {
    public static void main(String[] args) 
    {
        int orangeCount = 0, appleCount = 0, totalFruit = 0, berryCount = 0;
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple",
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple",
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        String[] fruitSalad;
        //First let's figure out how big the array should be
        for(String i:fruit)
        {
            if(i.contains("tomato")||i.contains("Tomato"))
            {
                totalFruit--;
            }
            else
            {
                totalFruit++;
            }
            if(i.contains("Apple"))
            {
                appleCount++;
            }
            else if(i.contains("Orange"))
            {
                orangeCount++;
            }
            else if(i.contains("berry") || i.contains("Berry"))
            {
                berryCount++;
            }
        }
        if(totalFruit >= 12)
        {
            fruitSalad = new String[12];
        }
        else
        {
            fruitSalad = new String[totalFruit];
        }
        String[] apples = new String[appleCount];
        String[] oranges = new String[orangeCount];
        String[] berries = new String[berryCount];
        for(int i=0; i<apples.length; i++)
        {
            for(int j=0; j<fruit.length; j++)
            {
                if(fruit[j].contains("Apple"))
                {
                    apples[i] = fruit[j];
                    fruit[j] = "";
                    break;
                }
            }
        }
        for(int i=0; i<oranges.length; i++)
        {
            for(int j=0; j<fruit.length; j++)
            {
                if(fruit[j].contains("Orange"))
                {
                    oranges[i] = fruit[j];
                    fruit[j] = "";
                    break;
                }
            }
        }
        for(int i=0; i<berries.length; i++)
        {
            for(int j=0; j<fruit.length; j++)
            {
                if(fruit[j].contains("Berry") || fruit[j].contains("berry"))
                {
                    berries[i] = fruit[j];
                    fruit[j] = "";
                    break;
                }
            }
        }
//        for(String i:apples)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//        for(String i:oranges)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//        for(String i:berries)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//        for(String i:fruit)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
        appleCount = 0;
        orangeCount = 0;
        totalFruit = 0;
        berryCount = 0;
        int leftFruit = 0;
        //Now let's fill her up! It's first come, first serve here
        if(berries.length < 12)
        {
            berryCount = berries.length;
        }
        if(12 - berryCount >=3)
        {
            appleCount = 3;
        }
        else
        {
            appleCount = 12 - berryCount;
        }
        if(12 - berryCount - appleCount >= 2)
        {
            orangeCount = 2;
        }
        else
        {
            orangeCount = 12 - berryCount - appleCount;
        }
        if(12 - berryCount - appleCount - orangeCount > 0)
        {
            leftFruit = 12 - berryCount - appleCount - orangeCount;
        }
        
        for(int i=0; i<fruitSalad.length; i++)
        {
            if(0<=i && i<berryCount)
            {
                fruitSalad[i] = berries[i];
            }
            else if(berryCount<=i && i<appleCount+berryCount)
            {
                fruitSalad[i] = apples[i-berryCount];
            }
            else if(berryCount+appleCount<=i && i<berryCount+appleCount+orangeCount)
            {
                fruitSalad[i] = oranges[i-berryCount-appleCount];
            }
            else
            {
                for(int j=0; j<fruit.length; j++)
                {
                    if(!fruit[j].contains("Tomato") && !fruit[j].equals("")) 
                    {
                        fruitSalad[i] = fruit[j];
                        fruit[j] = "";
                    }
                }
            }
        }
        for(String i:fruitSalad)
        {
            System.out.println(i);
        }
    }
}
