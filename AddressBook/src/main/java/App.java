/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Application for the Address Book
 */
import Controller.AddressBookController;
import DAO.AddressBookDao;
import DAO.AddressBookDaoFileImpl;
import UI.AddressBookView;
import UI.UserIO;
import UI.UserIOConsoleImpl;
public class App {
    public static void main(String[] args) 
    {
        UserIO myIo = new UserIOConsoleImpl();
        AddressBookView myView;
        myView = new AddressBookView(myIo);
        AddressBookDao myDao = new AddressBookDaoFileImpl();
        AddressBookController controller = new AddressBookController(myDao, myView);
        controller.run();
    }
}
