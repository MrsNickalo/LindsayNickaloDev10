package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Instrument;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public interface InstrumentDao 
{
    /**
     * Method to find an instrument in the database by the given id
     * @param id integer identifier of instrument searched for
     * @return Instrument item matching identifier or null if none found
     */
    Instrument findById(int id);
    
    /**
     * Method to add an instrument to the database
     * In implementation, this method will be disabled.
     * In future use, it could be enabled to allow an admin to add 
     * instruments if JFugue extends its library of such.
     * @param instrument Instrument to be added
     * @return Instrument added, or Instrument found if already exists
     */
    Instrument addInstrument(Instrument instrument);
    
    /**
     * Method to get list of all Instruments in database.
     * @return List of Instruments in database
     */
    List<Instrument> findAll();
    
    /**
     * Method to update an instrument in the database.
     * Since the instruments are there for reference for JFugue, 
     * this method will be disabled.
     * It can be enabled if necessary for admin purposes in the future.
     * @param instrument to be updated
     */
    void updateInstrument(Instrument instrument);
    
   /**
     * Method to delete an instrument in the database.
     * Since the instruments are there for reference for JFugue, 
     * this method will be disabled.
     * It can be enabled if necessary for admin purposes in the future.
     * @param id identifier of instrument to be deleted
     */ 
    void deleteInstrument(int id);
}
