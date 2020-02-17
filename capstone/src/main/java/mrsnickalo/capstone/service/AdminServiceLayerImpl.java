package mrsnickalo.capstone.service;

import java.util.ArrayList;
import java.util.List;
import mrsnickalo.capstone.dao.PrivateSongDaoDB;
import mrsnickalo.capstone.dao.RoleDao;
import mrsnickalo.capstone.dao.StandardSongDaoDB;
import mrsnickalo.capstone.dao.UserDao;
import mrsnickalo.capstone.entity.Role;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 14, 2020
 */

@Service
public class AdminServiceLayerImpl implements AdminServiceLayer
{
    @Autowired
    UserDao users;
    
    @Autowired
    StandardSongDaoDB standardSongs;
    
    @Autowired
    PrivateSongDaoDB privateSongs;
    
    @Autowired
    RoleDao roles;

    @Override
    public User findByIdUser(String username) 
    {
        return users.findById(username);
    }

    @Override
    public List<User> findAllUsers() 
    {
        return users.findAll();
    }

    @Override
    public void deleteUser(String username) 
    {
        users.deleteUser(username);
    }

    @Override
    public List<Song> findAllSongs() 
    {
        List<Song> standards = standardSongs.findAll();
        List<Song> privates = privateSongs.findAll();
        standards.addAll(privates);
        return standards;
    }

    @Override
    public Role findById(int id) 
    {
        return roles.findById(id);
    }

    @Override
    public List<Role> findAllRoles() 
    {
        return roles.findAll();
    }

    @Override
    public Role addRole(Role role) 
    {
        return roles.addRole(role);
    }

    @Override
    public void deleteRole(int id) 
    {
        roles.deleteRole(id);
    }

    @Override
    public List<Song> findByTitleSong(String title) 
    {
        List<Song> songs = new ArrayList<>();
        songs.addAll(standardSongs.findByTitle(title));
        songs.addAll(privateSongs.findByTitle(title));
        return songs;
    }
    
    
}
