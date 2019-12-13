package DAO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * AddressBookDao class creates a HashMap with keys of String names and values
 * of Addresses. 
 */
//import necessary objects
import DTO.Address;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class AddressBookDao {
    //attributes
    private HashMap<String, Address> addressBook = new HashMap<>();
    
    //methods
    //method to add address to address book accepting name and address
    public void addAddress(String name, Address a)
    {
        //implementation
    }
    //method to view address in address book, given either name or address
    public void viewAddress(String name)
    {
        //implementation
    }
    public void viewAddress(Address a)
    {
        //implementation
    }
    //method to remove entry given either name or address
    public void removeAddress(String name)
    {
        //implementation
    }
    public void removeAddress(Address a)
    {
        //implementation
    }
    //method to edit entry given either name or address
    public void editAddress(String name)
    {
        //implementation
    }
    public void editAddress(Address a)
    {
        //implementation
    }
}
