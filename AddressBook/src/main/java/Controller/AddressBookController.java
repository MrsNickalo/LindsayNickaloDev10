package Controller;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Controller class for the Address Book application
 */
import DAO.AddressBookDao;
import UI.View;
public class AddressBookController {
    //attributes
    AddressBookDao addressBook = new AddressBookDao();
    String name, street, city, state;
    int zip;
    View sys = new View();
    //methods
    //method to display the welcome
    public void intro()
    {
        //implementation
        sys.print("Intro");
    }
    //method to display the menu
    public void menu()
    {
        //implementation
        sys.print("Menu");
    }
    //method to add Entity
    public void addEntity()
    {
        //implementation
        sys.print("Add");
    }
    //method to view Entity
    public void viewEntity()
    {
        //implementation
        sys.print("View");
    }
    //method to remove Entity
    public void removeEntity()
    {
        //implementation
        sys.print("Remove");
    }
    //method to edit Entity
    public void editEntity()
    {
        //implementation
        sys.print("Edit");
    }
    //method to view all Entities
    public void viewAll()
    {
        //implementation
        sys.print("View All");
    }
    //method to view number of Entities
    public void numberEntities()
    {
        //implementation
        sys.print("Number");
    }
    //method to save Entities to file
    public void saveTo()
    {
        //implementation
        sys.print("Save to");
    }
    //method to read Entities from file
    public void readFrom()
    {
        //implementation
        sys.print("Read from");
    }
    //method to display message on exit
    public void exit()
    {
        //implementation
        sys.print("Exitting...");
    }
    //method to get integer input
    public int inputInt()
    {
        //implementation
        return sys.readInt("Input an integer");
    }
    //method to get String input
    public String inputString()
    {
        //implementation
        return "String input";
    }
}
