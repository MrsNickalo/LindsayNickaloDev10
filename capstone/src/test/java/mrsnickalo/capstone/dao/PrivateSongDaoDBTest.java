package mrsnickalo.capstone.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mrsnickalo.capstone.entity.Role;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.User;
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
public class PrivateSongDaoDBTest 
{
    @Autowired
    PrivateSongDaoDB songs;
    
    @Autowired
    UserDao users;
    
    public PrivateSongDaoDBTest() 
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
        if(users.findById("TestingUser") != null)
        {
            users.deleteUser("TestingUser");
        }
        User user = new User();
        user.setUsername("TestingUser");
        user.setPassword("Testing");
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setId(1);
        role.setRole("USER");
        roles.add(role);
        user.setRoles(roles);
        users.addUser(user);
    }
    
    @After
    public void tearDown() 
    {
        users.deleteUser("TestingUser");
        List<Song> songList = songs.findAll();
        for(Song s : songList)
        {
            songs.deleteSong(s.getSongId());
        }
    }

    /**
     * Test of findByTitle method, of class PrivateSongDaoDB.
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
        User user = users.findById("TestingUser");
        song = songs.addSong(song, user);
        List<Song> fromDao = songs.findByTitle(song.getTitle());
        assertEquals(song, fromDao.get(0));
    }

    /**
     * Test of addSong method, of class PrivateSongDaoDB.
     */
    @Test
    public void testAddSong_Song_User() 
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
        User user = users.findById("TestingUser");
        song = songs.addSong(song, user);
        List<Song> songList = songs.findAll();
        assertEquals(1, songList.size());
    }

    /**
     * Test of findAll method, of class PrivateSongDaoDB.
     */
    @Test
    public void testFindAll() 
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
        User user = users.findById("TestingUser");
        song = songs.addSong(song, user);
        List<Song> songList = songs.findAll();
        assertEquals(1, songList.size());
        Song songB = new Song();
        songB.setTitle("Just As I Am Again");
        songB.setArtist("William Batchelder Bradbury");
        songB.setYear(1849);
        songB.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        songB.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        songB.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        songB.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        songB.setBpm(80);
        songB = songs.addSong(songB, user);
        songList = songs.findAll();
        assertEquals(2, songList.size());
    }

    /**
     * Test of updateSong method, of class PrivateSongDaoDB.
     */
    @Test
    public void testUpdateSong() 
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
        User user = users.findById("TestingUser");
        song = songs.addSong(song, user);
        Song fromDao = songs.findById(song.getSongId());
        assertEquals(song, fromDao);
        Song songB = new Song();
        songB.setTitle("Just As I Am Again");
        songB.setArtist("William Batchelder Bradbury");
        songB.setYear(1849);
        songB.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        songB.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        songB.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        songB.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        songB.setBpm(80);
        songB.setSongId(song.getSongId());
        songs.updateSong(songB);
        fromDao = songs.findById(song.getSongId());
        assertNotEquals(song, fromDao);
        assertEquals(songB, fromDao);
    }

    /**
     * Test of deleteSong method, of class PrivateSongDaoDB.
     */
    @Test
    public void testDeleteSong() 
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
        User user = users.findById("TestingUser");
        song = songs.addSong(song, user);
        List<Song> songList = songs.findAll();
        assertEquals(1, songList.size());
        Song songB = new Song();
        songB.setTitle("Just As I Am Again");
        songB.setArtist("William Batchelder Bradbury");
        songB.setYear(1849);
        songB.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        songB.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        songB.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        songB.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        songB.setBpm(80);
        songB = songs.addSong(songB, user);
        songList = songs.findAll();
        assertEquals(2, songList.size());
        songs.deleteSong(song.getSongId());
        songList = songs.findAll();
        assertEquals(1, songList.size());
        songs.deleteSong(songB.getSongId());
        songList = songs.findAll();
        assertEquals(0, songList.size());
    }

}
