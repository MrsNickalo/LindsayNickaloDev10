/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * This class models an airplane as if it were to be part of an
 * air traffic control system.
 */
public class AirplaneControl {
    //attributes
    private double latitude;
    private double longitude;
    private String callName;
    private double altitude;
    private boolean inDistress;
    private boolean isPriority;
    private String flightDirection;
    private String flightOrigin;
    private String flightDestination;
    //constructor
    //for this constructor, since the other attributes will be changing,
    //we only need to initialize it with the ones that won't change
    //we can then use setter methods to set those in real time
    //we can, however, go ahead and initialize this if we want
    public AirplaneControl(String name, String dest, String orig)
    {
        callName = name;
        flightOrigin = orig;
        flightDestination = dest;
        //initializations, not necessarily necessary
        latitude = 0;
        longitude = 0;
        altitude = 0;
        inDistress = false;
        isPriority = false;
        flightDirection = "";
    }
    //setter methods
    public void setLatitude(double lat)
    {
        this.latitude = lat;
    }
    public void setLongitude(double lon)
    {
        this.longitude = lon;
    }
    public void setAltitude(double alt)
    {
        this.altitude = alt;
    }
    public void setInDistress(boolean iD)
    {
        this.inDistress = iD;
    }
    public void setIsPriority(boolean iP)
    {
        this.isPriority = iP;
    }
    public void setFlightDirection(String dir)
    {
        flightDirection = dir;
    }
    //getter methods for everything!!!
    public String getCallName()
    {
        return callName;
    }
    public String getFlightOrigin()
    {
        return flightOrigin;
    }
    public String getFlightDestination()
    {
        return flightDestination;
    }
    public double getLatitude()
    {
        return latitude;
    }
    public double getLongitude()
    {
        return longitude;
    }
    public double getAltitude()
    {
        return altitude;
    }
    public boolean getInDistress()
    {
        return inDistress;
    }
    public boolean getIsPriority()
    {
        return isPriority;
    }
    public String getFlightDirection()
    {
        return flightDirection;
    }
    //methods not implemented
    
    //overload the toString method, of course
    
    //method to activate an alarm or something if plane goes in distress
}
