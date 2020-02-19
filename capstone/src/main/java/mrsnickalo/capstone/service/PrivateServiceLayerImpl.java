package mrsnickalo.capstone.service;

import java.util.List;
import mrsnickalo.capstone.dao.CategoryDao;
import mrsnickalo.capstone.dao.InstrumentDaoDB;
import mrsnickalo.capstone.dao.PercussionInstrumentDaoDB;
import mrsnickalo.capstone.dao.PrivateSongDaoDB;
import mrsnickalo.capstone.dao.TempoDao;
import mrsnickalo.capstone.dao.UserDao;
import mrsnickalo.capstone.entity.Category;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
import mrsnickalo.capstone.entity.User;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * Service layer for when user is signed in.
 */

@Service
public class PrivateServiceLayerImpl implements ServiceLayer
{
    @Autowired
    CategoryDao categories;
    
    @Autowired
    InstrumentDaoDB instruments;
    
    @Autowired
    PercussionInstrumentDaoDB percussionInstruments;
    
    @Autowired
    TempoDao tempos;
    
    @Autowired
    PrivateSongDaoDB songs;
    
    @Autowired
    UserDao users;
    
    @Override
    public List<Category> findAllCategories() 
    {
        return categories.findAll();
    }

    @Override
    public Category findByIdCategory(int id) 
    {
        return categories.findById(id);
    }

    @Override
    public List<Instrument> findAllInstruments() 
    {
        return instruments.findAll();
    }

    @Override
    public Instrument findByIdInstrument(int id) 
    {
        return instruments.findById(id);
    }

    @Override
    public List<Instrument> findAllPercussionInstruments() 
    {
        return percussionInstruments.findAll();
    }

    @Override
    public Instrument findByIdPercussionInstrument(int id) 
    {
        return percussionInstruments.findById(id);
    }

    @Override
    public List<Tempo> findAllTempos() 
    {
        return tempos.findAll();
    }

    @Override
    public Tempo findByIdTempo(String id) 
    {
        return tempos.findById(id);
    }

    @Override
    public List<Song> findAllSongs() 
    {
        return songs.findAll();
    }

    @Override
    public Song findByIdSong(int id) 
    {
        return songs.findById(id);
    }

    @Override
    public List<Song> findByTitle(String title) 
    {
        return songs.findByTitle(title);
    }
    
    @Override
    public void playSong(Song song, String part, Instrument instrument)
    {
        Player player = new Player();
        Pattern pattern;
        String instrumentString = " I" + instrument.getInstrumentId() + " ";
        String p = "";
        switch(part)
        {
            case "soprano":
                p += instrumentString + song.getSoprano();
                break;
            case "alto":
                p += instrumentString + song.getAlto();
                break;
            case "tenor":
                p += instrumentString + song.getTenor();
                break;
            case "bass":
                p += instrumentString + song.getBass();
                break;
            default:
                if(!song.getSoprano().isEmpty())
                {
                    p += " V0 " + instrumentString + song.getSoprano();
                }
                if(!song.getAlto().isEmpty())
                {
                    p += " V1 " + instrumentString + song.getAlto();
                }
                if(!song.getTenor().isEmpty())
                {
                    p += " V2 " + instrumentString + song.getTenor();
                }
                if(!song.getBass().isEmpty())
                {
                    p += " V3 " + instrumentString + song.getBass();
                }
        }
        if(p.equals(""))
        {
            return;
        }
        pattern = new Pattern(p);
        pattern.setTempo(song.getBpm());
        player.play(pattern);
    }
    
    public List<Song> findAllSongsUser(User user)
    {
        return users.findAllSongs(user);
    }
    
    public User addUser(User user)
    {
        return users.addUser(user);
    }
    
    public Song addSong(Song song, User user)
    {
        return songs.addSong(song, user);
    }
    
    public void deleteSong(int id)
    {
        songs.deleteSong(id);
    }
    
    public void updateSong(Song song)
    {
        songs.updateSong(song);
    }
    
    public List<User> findAllUsers()
    {
        return users.findAll();
    }
    
    public User findByIdUser(String username)
    {
        return users.findById(username);
    }
    
    public void deleteUser(String username)
    {
        users.deleteUser(username);
    }
}
