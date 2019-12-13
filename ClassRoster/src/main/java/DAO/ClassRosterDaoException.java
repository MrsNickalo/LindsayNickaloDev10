package DAO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Exception class for Class Roster.
 */
public class ClassRosterDaoException extends Exception
{
    //constructors
    public ClassRosterDaoException(String message)
    {
        super(message);
    }
    public ClassRosterDaoException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
}
