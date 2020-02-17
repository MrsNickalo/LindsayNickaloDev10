package mrsnickalo.capstone.dao;

import java.util.List;
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
public class TempoDaoTest 
{
    @Autowired
    TempoDao tempos;
    
    public TempoDaoTest() 
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
     * Test of findById method, of class TempoDao.
     */
    @Test
    public void testFindById() 
    {
        Tempo tempo = new Tempo();
        tempo.setTempoId("Grave");
        tempo.setBpm(40);
        Tempo fromDao = tempos.findById("Grave");
        assertEquals(tempo, fromDao);
    }

    /**
     * Test of findById method to return null, of class TempoDaoDB.
     */
    @Test
    public void testFindByIdFail() 
    {
        Tempo fromDao = tempos.findById("Chicken");
        assertNull(fromDao);
    }
    
    /**
     * Test of addTempo method, of class TempoDao.
     */
    @Test
    public void testAddTempo() 
    {
        Tempo tempo = new Tempo();
        tempo.setTempoId("Tester");
        tempo.setBpm(300);
        tempos.addTempo(tempo);
        Tempo fromDao = tempos.findById(tempo.getTempoId());
        assertNull(fromDao);
    }

    /**
     * Test of findAll method, of class TempoDao.
     */
    @Test
    public void testFindAll() 
    {
        List<Tempo> tempoList = tempos.findAll();
        assertEquals(14, tempoList.size());
    }

    /**
     * Test of updateTempo method, of class TempoDao.
     */
    @Test
    public void testUpdateTempo() 
    {
        Tempo tempo = new Tempo();
        tempo.setTempoId("Grave");
        tempo.setBpm(300);
        Tempo fromDao = tempos.findById(tempo.getTempoId());
        assertEquals(fromDao.getTempoId(), tempo.getTempoId());
        assertNotEquals(fromDao, tempo);
        tempos.updateTempo(tempo);
        fromDao = tempos.findById(tempo.getTempoId());
        assertEquals(fromDao.getTempoId(), tempo.getTempoId());
        assertNotEquals(fromDao, tempo);
    }

    /**
     * Test of deleteTempo method, of class TempoDao.
     */
    @Test
    public void testDeleteTempo() 
    {
        int size = tempos.findAll().size();
        assertEquals(14, size);
        tempos.deleteTempo("Grave");
        size = tempos.findAll().size();
        assertEquals(14, size);
    }
}
