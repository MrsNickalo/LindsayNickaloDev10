package DTO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Address class representing an address with fields for street, city, state, and zip.
 */
public class Address {
    //attributes
    private String street;
    private String city;
    private String state;
    private int zip;
    //constructors
    public Address(String s, String c, String st, int z)
    {
        street = s;
        city = c;
        state = st;
        zip = z;
    }
    //setter methods
    public void setStreet(String s)
    {
        this.street = s;
    }
    public void setCity(String c)
    {
        this.city = c;
    }
    public void setState(String st)
    {
        this.state = st;
    }
    public void setZip(int z)
    {
        this.zip = z;
    }
    //getter methods
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
    public String getZipString()
    {
        return Integer.toString(zip);
    }
    //override toString method
    @Override
    public String toString()
    {
        String output = "";
        output += street + "\n";
        output += city + ", ";
        output += state + " ";
        output += Integer.toString(zip);
        return output;
    }
    //override equals method
    public boolean equals(Address a)
    {
        if(!this.street.equals(a.getStreet()))
        {
            return false;
        }
        else if(!this.city.equals(a.getCity()))
        {
            return false;
        }
        else if(!this.city.equals(a.getState()))
        {
            return false;
        }
        else if(this.zip != a.getZip())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
