package Controller;

import DAO.AddressBookDao;
import DAO.AddressBookDaoException;
import DTO.Address;
import DTO.Person;
import UI.AddressBookView;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Controller class for the Address Book application
 */
public class AddressBookController 
{
    //attributes
    AddressBookView view;
    AddressBookDao dao;
    //constructor with dependency injection
    public AddressBookController(AddressBookDao dao, AddressBookView view)
    {
        this.dao = dao;
        this.view = view;
    }
    //method to execute the program
    public void run()
    {
        boolean keepGoing = true;
        try
        {
            while(keepGoing)
            {
                int menuSelection = getMenuSelection();
                switch(menuSelection)
                {
                    case 1:
                        addAddress();
                        break;
                    case 2:
                        removeAddress();
                        break;
                    case 3:
                        listPeople();
                        break;
                    case 4:
                        viewAddress();
                        break;
                    case 5:
                        viewSize();
                        break;
                    case 6:
                        viewAll();
                        break;
                    case 7:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        }
        catch(AddressBookDaoException e)
        {
            view.displayErrorMessage(e.getMessage());
        }
    }
    //method to print menu and get user selection
    private int getMenuSelection()
    {
        return view.printMenuAndGetSelection();
    }
    //method to create student
    private void addAddress()throws AddressBookDaoException 
    {
        view.displayAddAddressBanner();
        Person newPerson = view.getNewPersonInfo();
        Address newAddress = view.getNewAddressInfo();
        dao.addAddress(newPerson, newAddress);
        view.displayAddSuccessBanner();
    }
    //method to remove address
    private void removeAddress()throws AddressBookDaoException 
    {
        view.displayRemoveAddressBanner();
        String lastName = view.getLastName();
        Person removePerson = dao.findPerson(lastName);
        dao.removeAddress(removePerson);
        view.displayRemoveSuccessBanner();
    }
    //method to display all people listed in book
    private void listPeople()throws AddressBookDaoException 
    {
        view.displayDisplayPeopleBanner();
        Set<Person> peopleList = dao.getAllPeople();
        view.displayAddressList(peopleList);
    }
    //method to view single address
    private void viewAddress() throws AddressBookDaoException
    {
        view.displayDisplayAddressBanner();
        String lastName = view.getLastName();
        Person currentPerson = dao.findPerson(lastName);
        Address currentAddress = dao.getAddress(currentPerson);
        view.displayPerson(currentPerson);
        view.displayAddress(currentAddress);
        view.displayBanner();
    }
    //method to view size of address book
    private void viewSize() throws AddressBookDaoException
    {
        view.displaySizeBanner();
        int size = dao.sizeOfBook();
        view.displaySize(size);
    }
    //method to view all entries
    private void viewAll() throws AddressBookDaoException
    {
        view.displayDisplayAllBanner();
        Set<Person> peopleList = dao.getAllPeople();
        for(Person currentPerson : peopleList)
        {
            view.displayPerson(currentPerson);
            view.displayAddress(dao.getAddress(currentPerson));
        }
        view.displayBanner();
    }
    //method to deal with unknown comman
    private void unknownCommand()
    {
        view.displayUnknownCommandBanner();
    }
    //method to display exit message
    private void exitMessage()
    {
        view.displayExitBanner();
    }
}
