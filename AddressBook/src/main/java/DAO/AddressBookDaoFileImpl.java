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
import DTO.Person;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class AddressBookDaoFileImpl implements AddressBookDao
{
    //constants for file persistence
    public static final String BOOK_FILE = "addressBook.txt";
    public static final String DELIMITER = "::";
    
    //attributes
    private Map<Person, Address> addressBook = new HashMap<>();
    
    @Override
    public Address addAddress(Person person, Address address) throws AddressBookDaoException 
    {
        loadRoster();
        Address newAddress = addressBook.put(person, address);
        writeRoster();
        return newAddress;
    }

    @Override
    public Set<Person> getAllPeople() throws AddressBookDaoException 
    {
        loadRoster();
        Set<Person> values = addressBook.keySet();
        return values;
    }

    @Override
    public Address getAddress(Person person) throws AddressBookDaoException 
    {
        //we don't need to re-load it since it does it in getAllPeople()
        //loadRoster();
        Address a = addressBook.get(person);
        Set<Person> people = addressBook.keySet();
        for(Person p : people)
        {
            if(p.equals(person))
            {
                a = addressBook.get(p);
            }
        }
        return a;
    }
    
    //work around to remove the address when we find the person....
    public Address getAddressRemoval(Person person) throws AddressBookDaoException 
    {
        //we don't need to re-load it since it does it in getAllPeople()
        //loadRoster();
        Address a = addressBook.get(person);
        Set<Person> people = addressBook.keySet();
        for(Person p : people)
        {
            if(p.equals(person))
            {
                a = addressBook.get(p);
                addressBook.remove(p);
                break;
            }
        }
        return a;
    }
    @Override
    public Address removeAddress(Person person) throws AddressBookDaoException 
    {
        //loadRoster();
        Address removedAddress = getAddressRemoval(person);
        writeRoster();
        return removedAddress;
    }
    
    //method to find person 
    @Override
    public Person findPerson(String last) throws AddressBookDaoException
    {
        loadRoster();
        Person foundPerson = new Person("", "");
        Set<Person> people = addressBook.keySet();
        for(Person currentPerson : people)
        {
            if((currentPerson.getLastName()).equals(last))
            {
                foundPerson.setFirstName(currentPerson.getFirstName());
                foundPerson.setLastName(currentPerson.getLastName());
                break;
            }
        }
        return foundPerson;
    }
    //returns size of book
    @Override
    public int sizeOfBook() throws AddressBookDaoException
    {
        loadRoster();
        return addressBook.size();
    }
    
    //method to unmarshall a string of text into an address object and person
    private Map<Person,Address> unmarshallAddress(String addressAsText)
    {
        String[] addressTokens = addressAsText.split(DELIMITER);
        String firstName = addressTokens[0];
        String lastName = addressTokens[1];
        Person personFromFile = new Person(firstName, lastName);
        String street = addressTokens[2];
        String city = addressTokens[3];
        String state = addressTokens[4];
        int zip = Integer.parseInt(addressTokens[5]);
        Address addressFromFile = new Address(street, city, state, zip);
        Map<Person, Address> currentEntry = new HashMap<>();
        currentEntry.put(personFromFile, addressFromFile);
        return currentEntry;
    }
    //method to load our class roster
    private void loadRoster() throws AddressBookDaoException
    {
        Scanner scanner;
        try
        {
            scanner = new Scanner(new BufferedReader(new FileReader(BOOK_FILE)));
        }
        catch(FileNotFoundException e)
        {
            throw new AddressBookDaoException("-_- Could not load roster data into memory.", e);
        }
        String currentLine;
        //HERE WE HAVE TO CLEAR THE HASHMAP
        //IF WE DON'T, WE KEEP CREATING NEW OBJECTS AND SINCE THE POINTERS TO THEM ARE DIFFERENT,
        //THE PROGRAM REGISTERS THEM AS BEING DIFFERENT!
        //NOW WE HAVE ITERATOR PROBLEM BECAUSE WE CLEAR LIST WHILE ITERATING
        addressBook.clear();
        while(scanner.hasNextLine())
        {
            currentLine = scanner.nextLine();
            //adding to new hash map
            Map<Person, Address> temporary = unmarshallAddress(currentLine);
            addressBook.putAll(temporary);
        }
//        for(Person p : addressBook.keySet())
//        {
//            System.out.println("ENTRY: " + p.toString() + "  " + addressBook.get(p));
//        }
        //always close your file!!!!
        scanner.close();
    }
    //method to marshall an Address into a String
    private String marshallAddress(Person person, Address address)
    {
        String addressAsText = "";
        addressAsText += person.getFirstName() + DELIMITER;
        addressAsText += person.getLastName() + DELIMITER;
        addressAsText += address.getStreet() + DELIMITER;
        addressAsText += address.getCity() + DELIMITER;
        addressAsText += address.getState() + DELIMITER;
        addressAsText += address.getZipString() + DELIMITER;
        return addressAsText;
    }
    //method to write class roster to a file
    private void writeRoster() throws AddressBookDaoException
    {
        PrintWriter out;
        try
        {
            out = new PrintWriter(new FileWriter(BOOK_FILE));
        }
        catch(IOException e)
        {
            throw new AddressBookDaoException("Could not save address data.", e);
        }
        String addressAsText;
        Set<Person> personList = addressBook.keySet();
        for(Person currentPerson : personList)
        {
            addressAsText = marshallAddress(currentPerson, addressBook.get(currentPerson));
            out.println(addressAsText);
            out.flush();
        }
        out.close();
    }
}
