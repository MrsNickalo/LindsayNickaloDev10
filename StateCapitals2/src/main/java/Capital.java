/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 * Capital class.
 */
public class Capital {
    private String name;
    private int population;
    private double squareMileage;
    //constructor
    public Capital(String n, int p, double s)
    {
        name = n;
        population = p;
        squareMileage = s;
    }
    //getter methods
    public String getName()
    {
        return name;
    }
    public int getPopulation()
    {
        return population;
    }
    public double getSquareMileage()
    {
        return squareMileage;
    }
    //override toString
    @Override
    public String toString()
    {
        String output = "";
        output += " - " + name + " | Pop: " + population + " | Area: " + squareMileage + " sq mi";
        return output;
    }
}
