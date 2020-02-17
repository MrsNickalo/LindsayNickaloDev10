package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Song;
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
public class StandardSongDaoDBTest 
{
    @Autowired
    StandardSongDaoDB songs;
    
    public StandardSongDaoDBTest() 
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
     * Test of findById method, of class StandardSongDaoDB.
     */
    @Test
    public void testFindById() 
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
        Song fromDao = songs.findById(5);
        assertEquals(song, fromDao);
    }
    
    /**
     * Test of findById method, of class StandardSongDaoDB.
     */
    @Test
    public void testFindByIdFail() 
    {
        Song fromDao = songs.findById(6);
        assertNull(fromDao);
    }

     /**
     * Test of findByTitle method, of class StandardSongDaoDB.
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
        List<Song> fromDao = songs.findByTitle(song.getTitle());
        assertEquals(song, fromDao.get(0));
    }
    
    /**
     * Test of findByTitle method, of class StandardSongDaoDB.
     */
    @Test
    public void testFindByTitleFail() 
    {
        List<Song> fromDao = songs.findByTitle("Chicken");
        assertTrue(fromDao.isEmpty());
    }
    
    /**
     * Test of addSong method, of class StandardSongDaoDB.
     */
    @Test
    public void testAddSong() 
    {
        Song song = new Song();
        song.setTitle("Testing");
        song.setArtist("Me");
        song.setYear(2020);
        song.setSoprano("Di Ei | F#h F# | Aq. Gi F# |");
        song.setAlto("Di Ei | Dh D | F#q. Ei D |");
        song.setTenor("F#4i G4i | A4h A4 | A4h A4 |");
        song.setBass("D4 | D4h D4 | D4h D4 |");
        song.setBpm(120);
        songs.addSong(song);
        List<Song> fromDao = songs.findByTitle(song.getTitle());
        assertTrue(fromDao.isEmpty());
    }

    /**
     * Test of findAll method, of class StandardSongDaoDB.
     */
    @Test
    public void testFindAll() 
    {
        List<Song> songList = songs.findAll();
        assertEquals(5, songList.size());
    }

    /**
     * Test of updateSong method, of class StandardSongDaoDB.
     */
    @Test
    public void testUpdateSong() 
    {
        Song song = new Song();
        song.setTitle("Just As I Am");
        song.setArtist("Johnny Blue");
        song.setYear(1849);
        song.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        song.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        song.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        song.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        song.setBpm(80);
        song.setSongId(5);
        List<Song> fromDao = songs.findByTitle(song.getTitle());
        assertNotEquals(song, fromDao.get(0));
        assertEquals(song.getSongId(), fromDao.get(0).getSongId());
        songs.updateSong(song);
        fromDao = songs.findByTitle(song.getTitle());
        assertNotEquals(song, fromDao.get(0));
    }

    /**
     * Test of deleteSong method, of class StandardSongDaoDB.
     */
    @Test
    public void testDeleteSong() 
    {
        int size = songs.findAll().size();
        assertEquals(size, 5);
        songs.deleteSong(5);
        size = songs.findAll().size();
        assertEquals(size, 5);
        assertNotNull(songs.findById(5));
    }
    
}
