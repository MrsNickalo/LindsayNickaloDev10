package UI;
import DTO.Address;
import DTO.Person;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 */
public class AddressBookView 
{
    //attributes
    UserIO io;
    //constructor with dependency injection
    public AddressBookView(UserIO io)
    {
        this.io = io;
    }
    
    //method to display menu and returns user selection
    public int printMenuAndGetSelection()
    {
        int menuSelection = 0;
        io.print("Main Menu");
        io.print("1. Add an Address");
        io.print("2. Remove an Address");
        io.print("3. View all People");
        io.print("4. View an Address");
        io.print("5. Address Book size");
        io.print("6. View all Addresses");
        io.print("7. Exit");
        return io.readInt("Please select from the above choices.");
    }
    //method to get info of new person
    public Person getNewPersonInfo()
    {
        String firstName = io.readString("Please enter their first name:");
        String lastName = io.readString("Please enter their last name:");
        Person currentPerson = new Person(firstName, lastName);
        return currentPerson;
    }
    //method to get info of new address
    public Address getNewAddressInfo()
    {
        String street = io.readStreet("Please enter the street address:");
        String city = io.readString("Please enter the city:");
        String state = io.readString("Please enter the state:");
        int zip = io.readInt("Please enter the zip code:");
        Address currentAddress = new Address(street, city, state, zip);
        return currentAddress;
    }
    //method to display banner for adding an address
    public void displayAddAddressBanner()
    {
        io.print("=== Add Address ===");
    }
    //method to display banner for successful addition of an address
    public void displayAddSuccessBanner()
    {
        io.readStringEnter("Address successfully added. Please hit enter to continue...");
    }
    //method to display list of all addresses
    public void displayAddressList(Set<Person> personList)
    {
        for(Person currentPerson : personList)
        {
            //why do i have to manually input the toString part???
            io.print(currentPerson.toString());
        }
        //work around for PRESS ENTER PROBLEM
        io.readStringEnter("Please press enter to continue.\n");
    }
    //method to display banner for showing all addresses
    public void displayDisplayAllBanner()
    {
        io.print("=== Display All ===");
    }
    //method to display banner for showing all people
    public void displayDisplayPeopleBanner()
    {
        io.print("=== Display All People ===");
    }
    //method to display banner for showing one address
    public void displayDisplayAddressBanner()
    {
        io.print("=== Display Address ===");
    }
    //method to get user's last name choice
    public String getLastName()
    {
        return io.readString("Please enter the last name:");
    }
    //method to display person
    public void displayPerson(Person person)
    {
        if(person != null)
        {
            io.print(person.toString());
        }
        else
        {
            io.print("No person found for that name!");
        }
    }
    //method to display address
    public void displayAddress(Address address)
    {
        if(address != null)
        {
            io.print(address.toString() + "\n");
        }
        else
        {
            io.print("No address found for that name.");
        }
    }
    //method to display banner for removing address
    public void displayRemoveAddressBanner()
    {
        io.print("=== Remove Address ===");
    }
    //method to display banner for successful removal of address
    public void displayRemoveSuccessBanner()
    {
        io.readStringEnter("Address entry successfully removed.\n Please hit enter to continue.");
    }
    //method to display banner upon exit
    public void displayExitBanner()
    {
        io.print("Good bye!!!");
    }
    //method to display banner for invalid command
    public void displayUnknownCommandBanner()
    {
        io.print("Unknown Command!!!");
    }
    //method to display error message
    public void displayErrorMessage(String errorMsg)
    {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    //method to display banner for size of
    public void displaySizeBanner()
    {
        io.print("=== Size of Address Book ===");
    }
    //method to display size of book
    public void displaySize(int size)
    {
        io.print("Number of entries: " + size);
        io.readStringEnter("Press enter to continue...");
    }
    //method to display an empty banner
    public void displayBanner()
    {
        io.readStringEnter("Press enter to continue...");
    }
}
