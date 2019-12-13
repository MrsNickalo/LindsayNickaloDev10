/**
 *
 * @author Lindsay Gen10
 * Date: December 10, 2019
 * Base class of Building.
 */
public class Building {
    //attributes
    protected String name;
    protected Address address;
    protected String designation;
    protected Person owner;
    protected Person[] tenants;
    
    //setter methods
    public void setName(String n)
    {
        this.name = n;
    }
    public void setAddress(Address a)
    {
        this.address = a;
    }
    public void setDesignation(String d)
    {
        this.designation = d;
    }
    public void setOwner(Person p)
    {
        owner = p;
    }
    //getter methods
    public String getName()
    {
        return name;
    }
    public Address getAddress()
    {
        return address;
    }
    public String getDesignation()
    {
        return designation;
    }
    public Person getOwner()
    {
        return owner;
    }
    public Person[] getTenants()
    {
        return tenants;
    }
    //method to add tenant to array
    public void addTenant(Person p)
    {
        //implementation
    }
}
