package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.User;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public interface UserDao 
{
    /**
     * Method to find user with their username.
     * @param username Username of user
     * @return User with that username, null if none exist
     */
    User findById(String username);
    
    /**
     * Method to add a User to the database.
     * @param user User to be added
     * @return User added or, if already exists, User from database.
     */
    User addUser(User user);
    
    /**
     * Method to find all users in database.
     * @return List of all Users
     */
    List<User> findAll();
    
    /**
     * Method to update a user's info (name, age, email)
     * @param user User to be updated
     */
    void updateUser(User user);
    
    /**
     * Method to delete a User 
     * @param username username of User to be deleted
     */
    void deleteUser(String username);
    
    /**
     * Method to find all songs in a users personal library
     * @param user User logged in
     * @return List of songs in personal library
     */
    List<Song> findAllSongs(User user);
}
