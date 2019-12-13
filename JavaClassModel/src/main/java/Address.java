/**
 *
 * @author Lindsay Gen10
 */
public class Address {

    private String street;
    private String city;
    private String zip;
    //constructor accepting three parameters
    public Address(String st, String ci, String zi)
    {
        street = st;
        city = ci;
        zip = zi;
    }
    //get methods
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
    public String toString()
    {
        String output = "";
        output += street + "\n";
        output += city + " ";
        output += zip + "\n";
        return output;
    }
}
