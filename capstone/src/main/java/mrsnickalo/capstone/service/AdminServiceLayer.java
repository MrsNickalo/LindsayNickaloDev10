package mrsnickalo.capstone.service;

import java.util.List;
import mrsnickalo.capstone.entity.Role;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.User;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 14, 2020
 */


public interface AdminServiceLayer 
{
    /**
     * method to find a user by username
     * @param username username
     * @return User with username, null if not found
     */
    User findByIdUser(String username);
    
    /**
     * method to find all users in database
     * @return List of User objects
     */
    List<User> findAllUsers();
    
    /**
     * method to delete a user by username
     * @param username username 
     */
    void deleteUser(String username);
    
    /**
     * method to find song in any library by title
     * @param title String title of song
     * @return song(s) if found, null if none found
     */
    List<Song> findByTitleSong(String title);
    
    /**
     * method to find all songs in database (standard and private)
     * @return list of Song objects
     */
    List<Song> findAllSongs();

    /**
     * method to find a role by id
     * @param id integer identifier of role
     * @return Role with matching id, null if none
     */
    Role findById(int id);
    
    /**
     * method to find all roles
     * @return List of Role objects
     */
    List<Role> findAllRoles();
    
    /**
     * method to add role
     * @param role role to be added
     * @return return added role or role if already exists
     */
    Role addRole(Role role);
    
    /**
     * method to delete a role
     * @param id id of role to be deleted
     */
    void deleteRole(int id);
}
