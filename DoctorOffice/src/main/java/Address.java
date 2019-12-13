/**
 *
 * @author Lindsay Gen10
 * Date: December 10, 2019
 * Address class.
 */
public class Address {
    private String street;
    private String city;
    private String zip;
    //constructor
    public Address(String s, String c, String z)
    {
        street = s;
        city = c;
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
    public void setZip(String z)
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
    public String getZip()
    {
        return zip;
    }
    //method to completely re-write address
    public void setTo(Address a)
    {
        this.street = a.getStreet();
        this.city = a.getCity();
        this.zip = a.getZip();
    }
}
