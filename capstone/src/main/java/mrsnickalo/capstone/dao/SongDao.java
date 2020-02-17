package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Song;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public interface SongDao 
{
    /**
     * Method to find a song by the song id.
     * @param id of song to be found
     * @return Song found, null if none found.
     */
    Song findById(int id);
    
    /**
     * Method to find a song by the title.
     * @param title String title of song.
     * @return List of Songs found, null if none found.
     */
    List<Song> findByTitle(String title);
    
    /**
     * Method to add a song to the database.
     * This method will only be implemented for the PrivateSongDao since
     * only a logged in user can use it.
     * @param song Song to be added to the database
     * @return Song added, or Song if one matching already found.
     */
    Song addSong(Song song);
    
    /**
     * Method to get all songs in database.
     * @return List of Songs in database.
     */
    List<Song> findAll();
    
    /**
     * Method to update a song in the database.
     * This method will only be implemented for the PrivateSongDao since
     * only a logged in user can use it.
     * @param song Song to be updated
     */
    void updateSong(Song song);
    
    /**
     * Method to delete a song in the database.
     * This method will only be implemented for the PrivateSongDao since
     * only a logged in user can use it.
     * @param id id of Song to be deleted
     */
    void deleteSong(int id);
}
