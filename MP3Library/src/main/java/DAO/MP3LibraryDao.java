package DAO;
import DTO.MP3;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 13, 2019
 */
public interface MP3LibraryDao {
    /**
    * Adds the given MP3 to the library
    * and associates it with the given MP3 title.
    * If that title is already in use, it will return that object.
    * Otherwise, it will return null.
    * @param title title with which MP3 is to be associated
    * @param mp3 MP3 to be added to the library
    * @return the MP3 object previously associated with the given title if it exists, null otherwise
    */
    MP3 addMP3(String title, MP3 mp3)
            throws MP3LibraryDaoException;
    
    /**
     * Returns a String array containing the 
     * titles of all MP3s in the library.
     * @return String array containing the titles of all the MP3s in the library
     */
    List<MP3> getAllMP3s()
            throws MP3LibraryDaoException;
    
    /**
     * Returns the MP3 object associated with the given title.
     * Returns null if no such MP3 exists.
     * @param title title of the MP3 to retrieve
     * @return the MP3 object associated, null if none
     */
    MP3 getMP3(String title)
            throws MP3LibraryDaoException;
    
    /**
     * Removes from the library the MP3 with the associated title.
     * Returns the MP3 object that is being removed.
     * Returns null if none is associated.
     * @param title title of MP3 to be removed
     * @return MP3 object or null if none
     */
    MP3 removeMP3(String title)
            throws MP3LibraryDaoException;
}
