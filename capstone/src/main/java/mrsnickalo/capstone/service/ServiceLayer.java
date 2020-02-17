package mrsnickalo.capstone.service;

import java.util.List;
import mrsnickalo.capstone.entity.Category;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public interface ServiceLayer 
{
    /**
     * method to return list of all categories
     * @return List of Category objects
     */
    List<Category> findAllCategories();
    
    /**
     * method to return requested category by id
     * @param id integer identifier of category
     * @return Category with that id, null if none found
     */
    Category findByIdCategory(int id);
    
    /**
     * method to return list of all Instruments
     * @return List of Instrument objects
     */
    List<Instrument> findAllInstruments();
    
    /**
     * method to return requested instrument by id
     * @param id integer identifier of instrument
     * @return Instrument with that id, null if none found
     */
    Instrument findByIdInstrument(int id);
    
    /**
     * method to return list of all Percussion Instruments
     * @return List of Instrument objects
     */
    List<Instrument> findAllPercussionInstruments();
    
    /**
     * method to return requested percussion instrument by id
     * @param id integer identifier of percussion instrument
     * @return Instrument with that id, null if none found
     */
    Instrument findByIdPercussionInstrument(int id);
    
    /**
     * method to return list of all Tempos
     * @return List of Tempo objects
     */
    List<Tempo> findAllTempos();
    
    /**
     * method to return requested Tempo by id
     * @param id String identifier of tempo
     * @return Tempo with that id, or null if none found
     */
    Tempo findByIdTempo(String id);
    
    /**
     * method to return list of all songs
     * @return List of Song objects
     */
    List<Song> findAllSongs();
    
    /**
     * method to return requested song by id
     * @param id integer identifier of song
     * @return Song with matching id, null if none found
     */
    Song findByIdSong(int id);
    
    /**
     * method to return requested song by title
     * @param title title of song
     * @return List of Song with matching id, null if none found
     */
    List<Song> findByTitle(String title);
    
    /**
     * method to play the requested part of the song
     * @param song Song to be played
     * @param part part of song to be played
     * @param instrument Instrument to be played with
     */
    void playSong(Song song, String part, Instrument instrument);
}
