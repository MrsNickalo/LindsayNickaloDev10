/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * This class if for modeling a house as if it were to be part
 * of a GPS Mapping System
 */
public class HouseGPS {
    //attributes
    //we need to have the house address
    private int streetNumber;
    private String street;
    private String city;
    private String state;
    private int zip;
    //we need to know which side of the road it's on
    private boolean onLeft;
    private double distanceAway;
    private double timeAway;
    private boolean isDestination;
    
    //constructor
    public HouseGPS(int sN, String s, String c, String st, int z)
    {
        streetNumber = sN;
        street = s;
        city = c;
        state = st;
        zip = z;
    }
    //the only setters we need are distanceAway and timeAway and onLeft
    //since the address will not be changed
    public void setOnLeft(boolean left)
    {
        this.onLeft = left;
    }
    public void setDistanceAway(double d)
    {
        this.distanceAway = d;
    }
    public void setTimeAway(double t)
    {
        this.timeAway = t;
    }
    public void setIsDestination(boolean i)
    {
        this.isDestination = i;
    }
    //get methods
    public int getStreetNumber()
    {
        return streetNumber;
    }
    public String getStreet()
    {
        return street;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
    public int getZip()
    {
        return zip;
    }
    public boolean getOnLeft()
    {
        return onLeft;
    }
    public double getDistanceAway()
    {
        return distanceAway;
    }
    public double getTimeAway()
    {
        return timeAway;
    }
    //toString overload for testing
    public String toString()
    {
        String output = "";
        output += "Address: \n";
        output += streetNumber + " " + street + "\n";
        output += city + ", " + state + " " + zip + "\n";
        if(isDestination)
        {
            output += "Distance Away: " + distanceAway + " miles\n";
            output += "Time Away: " + timeAway + " hours\n";
            if(onLeft)
            {
                output += "Destination will be on the left. \n";
            }
            else
            {
                output += "Destination will be on the right. \n";
            }
        }
        return output;
    }
    //methods it should have (not implemented)
    
    //we need a method that accepts another house location
    //and calculates distance and time away
    
    //we need a method to determine if on left or right based
    //on arrival direction
    
    //we might want to include a method to set this
    //as a favorite address?
}
