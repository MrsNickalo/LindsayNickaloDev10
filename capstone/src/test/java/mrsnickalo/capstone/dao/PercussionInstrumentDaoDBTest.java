package mrsnickalo.capstone.dao;

import mrsnickalo.capstone.entity.Instrument;
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
public class PercussionInstrumentDaoDBTest 
{
    @Autowired
    PercussionInstrumentDaoDB instruments;
    
    public PercussionInstrumentDaoDBTest() 
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
     * Test of findById method, of class InstrumentDaoDB.
     */
    @Test
    public void testFindById() 
    {
        Instrument instrument = new Instrument();
        instrument.setInstrumentName("ACOUSTIC_BASE_DRUM");
        instrument.setInstrumentId(35);
        Instrument fromDao = instruments.findById(35);
        assertEquals(instrument, fromDao);
    }
    
    /**
     * Test of findById method to return null, of class PercussionInstrumentDaoDB.
     */
    @Test
    public void testFindByIdFail() 
    {
        Instrument fromDao = instruments.findById(300);
        assertNull(fromDao);
    }
    
    /**
     * Test of addInstrument method, of class InstrumentDaoDB.
     */
    @Test
    public void testAddInstrument() 
    {
        Instrument instrument = new Instrument();
        instrument.setInstrumentName("TESTING");
        instrument.setInstrumentId(100);
        assertNull(instruments.addInstrument(instrument));
    }

    /**
     * Test of findAll method, of class InstrumentDaoDB.
     */
    @Test
    public void testFindAll() 
    {
        int size = instruments.findAll().size();
        assertEquals(47, size);
    }

    /**
     * Test of updateInstrument method, of class InstrumentDaoDB.
     */
    @Test
    public void testUpdateInstrument() 
    {
        Instrument instrument = new Instrument();
        instrument.setInstrumentName("TESTING");
        instrument.setInstrumentId(35);
        Instrument current = instruments.findById(instrument.getInstrumentId());
        assertEquals(instrument.getInstrumentId(), current.getInstrumentId());
        assertNotEquals(instrument, current);
        instruments.updateInstrument(instrument);
        Instrument fromDao = instruments.findById(instrument.getInstrumentId());
        assertEquals(instrument.getInstrumentId(), fromDao.getInstrumentId());
        assertNotEquals(instrument, fromDao);
    }

    /**
     * Test of deleteInstrument method, of class InstrumentDaoDB.
     */
    @Test
    public void testDeleteInstrument() 
    {
        int size = instruments.findAll().size();
        assertEquals(47, size);
        instruments.deleteInstrument(1);
        size = instruments.findAll().size();
        assertEquals(47, size);
    }
}
