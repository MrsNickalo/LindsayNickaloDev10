package mrsnickalo.capstone.service;

import java.util.List;
import mrsnickalo.capstone.entity.Category;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Lindsay Gen10
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandardServiceLayerImplTest 
{
    @Autowired
    StandardServiceLayerImpl service;
    
    public StandardServiceLayerImplTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
    
    @Before
    public void setUp() 
    {
        
    }
    
    @After
    public void tearDown() 
    {
        
    }

    /**
     * Test of findAllCategories method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindAllCategories() 
    {
        int size = service.findAllCategories().size();
        assertEquals(16, size);
    }

    /**
     * Test of findByIdCategory method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindByIdCategory() 
    {
        Category category = new Category();
        category.setCategory("PIANO");
        category.setCategoryId(1);
        Category fromDao = service.findByIdCategory(1);
        assertEquals(category, fromDao);
    }

    /**
     * Test of findAllInstruments method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindAllInstruments() 
    {
        int size = service.findAllInstruments().size();
        assertEquals(128, size);
    }

    /**
     * Test of findByIdInstrument method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindByIdInstrument() 
    {
        Instrument instrument = new Instrument();
        instrument.setInstrumentName("BRIGHT_ACOUSTIC");
        instrument.setInstrumentId(1);
        instrument.setCategoryId(1);
        Instrument fromDao = service.findByIdInstrument(1);
        assertEquals(instrument, fromDao);
    }

    /**
     * Test of findAllPercussionInstruments method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindAllPercussionInstruments() 
    {
        int size = service.findAllPercussionInstruments().size();
        assertEquals(47, size);
    }

    /**
     * Test of findByIdPercussionInstrument method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindByIdPercussionInstrument() 
    {
        Instrument instrument = new Instrument();
        instrument.setInstrumentName("ACOUSTIC_BASE_DRUM");
        instrument.setInstrumentId(35);
        Instrument fromDao = service.findByIdPercussionInstrument(35);
        assertEquals(instrument, fromDao);
    }

    /**
     * Test of findAllTempos method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindAllTempos() 
    {
        List<Tempo> tempoList = service.findAllTempos();
        assertEquals(14, tempoList.size());
    }

    /**
     * Test of findByIdTempo method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindByIdTempo() 
    {
        Tempo tempo = new Tempo();
        tempo.setTempoId("Grave");
        tempo.setBpm(40);
        Tempo fromDao = service.findByIdTempo("Grave");
        assertEquals(tempo, fromDao);
    }

    /**
     * Test of findAllSongs method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindAllSongs() 
    {
        List<Song> songList = service.findAllSongs();
        assertEquals(5, songList.size());
    }

    /**
     * Test of findByIdSong method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindByIdSong() 
    {
        Song song = new Song();
        song.setTitle("Just As I Am");
        song.setArtist("William Batchelder Bradbury");
        song.setYear(1849);
        song.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        song.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        song.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        song.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        song.setBpm(80);
        song.setSongId(5);
        Song fromDao = service.findByIdSong(5);
        assertEquals(song, fromDao);
    }

    /**
     * Test of findByTitle method, of class StandardServiceLayerImpl.
     */
    @Test
    public void testFindByTitle() 
    {
        Song song = new Song();
        song.setTitle("Just As I Am");
        song.setArtist("William Batchelder Bradbury");
        song.setYear(1849);
        song.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        song.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        song.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        song.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        song.setBpm(80);
        song.setSongId(5);
        List<Song> fromDao = service.findByTitle(song.getTitle());
        assertEquals(song, fromDao.get(0));
    }
    
}
