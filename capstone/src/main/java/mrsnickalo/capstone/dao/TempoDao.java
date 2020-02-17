package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Tempo;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public interface TempoDao 
{
    /**
     * Method to find an tempo in the database by the given id
     * @param id string identifier of Tempo searched for
     * @return Tempo item matching identifier or null if none found
     */
    Tempo findById(String id);
    
    /**
     * Method to add a tempo to the database
     * In implementation, this method will be disabled.
     * In future use, it could be enabled to allow an admin to add 
     * Tempos if JFugue extends its library of such.
     * @param tempo Tempo to be added
     * @return Tempo added, or Tempo found if already exists
     */
    Tempo addTempo(Tempo tempo);
    
    /**
     * Method to get list of all tempos in database.
     * @return List of Tempos in database
     */
    List<Tempo> findAll();
    
    /**
     * Method to update a tempo in the database.
     * Since the tempos are there for reference for JFugue, 
     * this method will be disabled.
     * It can be enabled if necessary for admin purposes in the future.
     * @param tempo to be updated
     */
    void updateTempo(Tempo tempo);
    
   /**
     * Method to delete a tempo in the database.
     * Since the tempos are there for reference for JFugue, 
     * this method will be disabled.
     * It can be enabled if necessary for admin purposes in the future.
     * @param id identifier of Tempo to be deleted
     */ 
    void deleteTempo(String id);
}
