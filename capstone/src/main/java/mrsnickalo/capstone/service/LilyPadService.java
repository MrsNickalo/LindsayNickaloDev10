package mrsnickalo.capstone.service;

import mrsnickalo.capstone.dao.LilyPad;
import mrsnickalo.capstone.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 17, 2020
 */

@Service
public class LilyPadService 
{
    @Autowired
    LilyPad lilypad;
    
    public void createLilypad(Song song)
    {
        lilypad.createLilyPad(song);
    }
}
