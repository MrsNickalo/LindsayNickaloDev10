package DAO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Exception class for Address Book.
 */
public class AddressBookDaoException extends Exception
{
    //constructors
    public AddressBookDaoException(String message)
    {
        super(message);
    }
    public AddressBookDaoException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
}
