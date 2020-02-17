package mrsnickalo.capstone.service;

import mrsnickalo.capstone.dao.CategoryDao;
import mrsnickalo.capstone.dao.InstrumentDaoDB;
import mrsnickalo.capstone.dao.PercussionInstrumentDaoDB;
import mrsnickalo.capstone.dao.StandardSongDaoDB;
import mrsnickalo.capstone.dao.TempoDao;
import mrsnickalo.capstone.entity.Category;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.hibernate.type.ImageType;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * Service layer for when user is not signed in.
 */

@Service
public class StandardServiceLayerImpl implements ServiceLayer
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
    StandardSongDaoDB songs;
    
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
        switch(part)
        {
            case "soprano":
                pattern = new Pattern(song.getSoprano());
                break;
            case "alto":
                pattern = new Pattern(song.getAlto());
                break;
            case "tenor":
                pattern = new Pattern(song.getTenor());
                break;
            case "bass":
                pattern = new Pattern(song.getBass());
                break;
            default:
                pattern = new Pattern("V0 " + song.getSoprano() + " V1 " + 
                        song.getAlto() + " V2 " + song.getTenor() + " V3 " +
                        song.getBass());
        }
        // KEEP WORKING ON ADDING RHYTHM
//        Rhythm rhythm = new Rhythm();
//        int measures = (int) song.getSoprano().chars().filter(ch -> ch=='|').count();
//        String ry = "";
//        for(int i=0; i<measures; i++)
//        {
//            ry += " O O O";
//        }
//        rhythm.addLayer(ry);
//        Pattern r = rhythm.getPattern();
//        r.setTempo(song.getBpm());
        pattern.setTempo(song.getBpm());
        pattern.setInstrument(instrument.getInstrumentId());
        player.play(pattern);
    }
    
}
