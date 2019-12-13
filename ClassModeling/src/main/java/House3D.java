/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Class to represent a house as if it were part of a 
 * 3D Modeling System
 */
public class House3D {
    //attributes
    private int floors;
    private int bedrooms;
    private int bathrooms;
    private double squareFeet;
    private double height;
    private double width;
    private int windows;
    private int doors;
    private String outerMaterial;
    private String mainFloorMaterial;
    private int otherRooms;
    //we could honestly make a ton more attributes for features
    //dependant on how detailed the 3D Mapping System is
    //but for our sake, we'll stop here
    
    //constructor
    //for this constructor, we only need the basics to start a shell
    //of the house
    public House3D(int fl, int bed, int bath, double sF, int oR)
    {
        floors = fl;
        bedrooms = bed;
        bathrooms = bath;
        squareFeet = sF;
        otherRooms = oR;
    }
    //setter methods for the rest!
    public void setHeight(double h)
    {
        this.height = h;
    }
    public void setWidth(double w)
    {
        this.width = w;
    }
    public void setWindows(int win)
    {
        this.windows = win;
    }
    public void setDoors(int door)
    {
        this.doors = door;
    }
    public void setOuterMaterial(String mat)
    {
        this.outerMaterial = mat;
    }
    public void setMainFloorMaterial(String mat)
    {
        this.mainFloorMaterial = mat;
    }
    //we will also have a setter for other rooms, bedrooms, bathrooms, etc.
    //in case the user wants to change it
    public void setFloors(int fl)
    {
        this.floors = fl;
    }
    public void setBedrooms(int bed)
    {
        this.bedrooms = bed;
    }
    public void setBathrooms(int bath)
    {
        this.bathrooms = bath;
    }
    public void setSquareFeet(double sF)
    {
        this.squareFeet = sF;
    }
    public void setOtherRooms(int oR)
    {
        this.otherRooms = oR;
    }
    //get methods for each!
    public int getFloors()
    {
        return floors;
    }
    public int getBedrooms()
    {
        return bedrooms;
    }
    public int getBathrooms()
    {
        return bathrooms;
    }
    public double getSquareFeet()
    {
        return squareFeet;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public String getOuterMaterial()
    {
        return outerMaterial;
    }
    public String getMainFloorMaterial()
    {
        return mainFloorMaterial;
    }
    public int getOtherRooms()
    {
        return otherRooms;
    }
    //other necessary methods not implemented here
    
    //overload the toString method
    
    //methods to modify floor plans for rooms
        //we would probably implement this using a sub-class called RoomLayout
        //or something like that
}
