package DAO;

import DTO.Address;
import DTO.Person;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Interface for ClassRosterDao.
 */
public interface AddressBookDao {
    /**
    * Adds the given address to the address book
    * and associates it with the given person.
    * If that person is already in it, it will return that object.
    * Otherwise, it will return null.
    * @param person id with which address is to be associated
    * @param address address to be added to the roster
    * @return the Address object previously associated with the given person if it exists, null otherwise
    */
    Address addAddress(Person person, Address address)
            throws AddressBookDaoException;
    
    /**
     * Returns a String array containing the 
     * names of all people in the address book.
     * @return String array containing the names of all the people in the address book
     */
    Set<Person> getAllPeople()
            throws AddressBookDaoException;
    
    /**
     * Returns the Address object associated with the given person.
     * Returns null if no such person exists.
     * @param person name of the person's address to retrieve
     * @return the Address object associated, null if none
     */
    Address getAddress(Person person)
            throws AddressBookDaoException;    
    
    /**
     * Removes from the address book the address with the associated person.
     * Returns the Address object that is being removed.
     * Returns null if none is associated.
     * @param person id of student to be removed
     * @return Address object or null if none
     */
    Address removeAddress(Person person)
            throws AddressBookDaoException;
    
    /**
     * Finds the person with matching last name
     * @param last last name of person to be removed
     * @return Person object matching
     */
    Person findPerson(String last)
            throws AddressBookDaoException;
    
    /**
     * Returns size of address book
     * @return integer
     */
    int sizeOfBook()
            throws AddressBookDaoException;
}

