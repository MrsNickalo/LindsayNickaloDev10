package mrsnickalo.capstone.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mrsnickalo.capstone.entity.Category;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Role;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
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
public class PrivateServiceLayerImplTest 
{
    @Autowired
    PrivateServiceLayerImpl service;
    
    public PrivateServiceLayerImplTest() 
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
        List<Song> songList = service.findAllSongs();
        for(Song s : songList)
        {
            service.deleteSong(s.getSongId());
        }
        List<User> userList = service.findAllUsers();
        for(User u : userList)
        {
            service.deleteUser(u.getUsername());
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
        service.addUser(user);
    }
    
    @After
    public void tearDown() 
    {
        List<Song> songList = service.findAllSongs();
        for(Song s : songList)
        {
            service.deleteSong(s.getSongId());
        }
        List<User> userList = service.findAllUsers();
        for(User u : userList)
        {
            service.deleteUser(u.getUsername());
        }
    }

    /**
     * Test of findAllCategories method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllCategories() 
    {
        int size = service.findAllCategories().size();
        assertEquals(16, size);
    }

    /**
     * Test of findByIdCategory method, of class PrivateServiceLayerImpl.
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
     * Test of findAllInstruments method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllInstruments() 
    {
        int size = service.findAllInstruments().size();
        assertEquals(128, size);
    }

    /**
     * Test of findByIdInstrument method, of class PrivateServiceLayerImpl.
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
     * Test of findAllPercussionInstruments method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllPercussionInstruments() 
    {
        int size = service.findAllPercussionInstruments().size();
        assertEquals(47, size);
    }

    /**
     * Test of findByIdPercussionInstrument method, of class PrivateServiceLayerImpl.
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
     * Test of findAllTempos method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllTempos() 
    {
        List<Tempo> tempoList = service.findAllTempos();
        assertEquals(14, tempoList.size());
    }

    /**
     * Test of findByIdTempo method, of class PrivateServiceLayerImpl.
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
     * Test of findAllSongs method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllSongs() 
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
        User user = service.findByIdUser("TestingUser");
        song = service.addSong(song, user);
        List<Song> songList = service.findAllSongs();
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
        songB = service.addSong(songB, user);
        songList = service.findAllSongs();
        assertEquals(2, songList.size());
    }

    /**
     * Test of findByTitle method, of class PrivateServiceLayerImpl.
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
        User user = service.findByIdUser("TestingUser");
        song = service.addSong(song, user);
        List<Song> fromDao = service.findByTitle(song.getTitle());
        assertEquals(song, fromDao.get(0));
    }

    /**
     * Test of findAllSongsUser method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllSongsUser() 
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
        User user = service.findByIdUser("TestingUser");
        song = service.addSong(song, user);
        List<Song> songList = service.findAllSongs();
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
        songB = service.addSong(songB, user);
        songList = service.findAllSongs();
        assertEquals(2, songList.size());
        User userB = new User();
        userB.setUsername("TestingUserOther");
        userB.setPassword("Testing");
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setId(1);
        role.setRole("USER");
        roles.add(role);
        userB.setRoles(roles);
        service.addUser(userB);
        Song songC = new Song();
        songC.setTitle("Just As I Am Again");
        songC.setArtist("William Batchelder Bradbury");
        songC.setYear(1849);
        songC.setSoprano("Di Ei | F#h F# | Aq. Gi F# | Eq. F#i G | F#h A | A E F# | Gh B | Bh A | F#h Di Ei | F#h F# | Aq. Gi F# | Bh B | D6q. C#6i B | Ah A | Aq. Gi F# | Eh. | Ah. | F#h Rq |");
        songC.setAlto("Di Ei | Dh D | F#q. Ei D | C#q. Di E | Dh F# | Eh D | Eh G | Gh F# | Dh Di Ei | Dh D | F#q. Ei D | Gh G | Gh G | F#h F# | F#q. Ei D | C#h. | C#h. | Dh Rq |");
        songC.setTenor("F#4i G4i | A4h A4 | A4h A4 | A4h A4 | A4h D | C#h A4 | A4h C# | Dh D | A4h F#4i G4i | A4h A4 | A4h D | Dh D | B4q. C#i D | Dh D | A4h A4 | A4h. | A4h. | A4h Rq |");
        songC.setBass("D4 | D4h D4 | D4h D4 | A3h A3 | D4h D4 | A4h A4 | A4h A3 | D4h D4 | D4h D4 | D4h D4 | D4q. E4i F#4 | G4h G4 | G4h G4 | D4h D4 | D4h D4 | A4h. | A3h. | D4h Rq |");
        songC.setBpm(80);
        songC = service.addSong(songC, userB);
        songList = service.findAllSongs();
        assertEquals(3, songList.size());
        List<Song> userList = service.findAllSongsUser(user);
        assertEquals(2, userList.size());
    }

    /**
     * Test of addUser method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testAddUser() 
    {
        User user = new User();
        user.setUsername("TestingUserOther");
        user.setPassword("Testing");
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setId(1);
        role.setRole("USER");
        roles.add(role);
        user.setRoles(roles);
        service.addUser(user);
        List<User> users = service.findAllUsers();
        assertEquals(2, users.size());
    }

    /**
     * Test of addSong method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testAddSong() 
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
        User user = service.findByIdUser("TestingUser");
        song = service.addSong(song, user);
        List<Song> songList = service.findAllSongs();
        assertEquals(1, songList.size());
    }

    /**
     * Test of deleteSong method, of class PrivateServiceLayerImpl.
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
        User user = service.findByIdUser("TestingUser");
        song = service.addSong(song, user);
        List<Song> songList = service.findAllSongs();
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
        songB = service.addSong(songB, user);
        songList = service.findAllSongs();
        assertEquals(2, songList.size());
        service.deleteSong(song.getSongId());
        songList = service.findAllSongs();
        assertEquals(1, songList.size());
        service.deleteSong(songB.getSongId());
        songList = service.findAllSongs();
        assertEquals(0, songList.size());
    }

    /**
     * Test of updateSong method, of class PrivateServiceLayerImpl.
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
        User user = service.findByIdUser("TestingUser");
        song = service.addSong(song, user);
        Song fromDao = service.findByIdSong(song.getSongId());
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
        service.updateSong(songB);
        fromDao = service.findByIdSong(song.getSongId());
        assertNotEquals(song, fromDao);
        assertEquals(songB, fromDao);
    }

    /**
     * Test of findAllUsers method, of class PrivateServiceLayerImpl.
     */
    @Test
    public void testFindAllUsers() 
    {
        List<User> users = service.findAllUsers();
        assertEquals(1, users.size());
        User user = new User();
        user.setUsername("TestingUserOther");
        user.setPassword("Testing");
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setId(1);
        role.setRole("USER");
        roles.add(role);
        user.setRoles(roles);
        service.addUser(user);
        users = service.findAllUsers();
        assertEquals(2, users.size());
    }
    
}
