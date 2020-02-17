package mrsnickalo.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import mrsnickalo.capstone.entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * DAO for instruments for playing music.
 */

@Repository
public class InstrumentDaoDB implements InstrumentDao
{
    @Autowired
    JdbcTemplate jdbc;
    
    @Override
    public Instrument findById(int id) 
    {
        try
        {
            final String FIND_INSTRUMENT = "SELECT instrumentId, instrumentName, categoryId FROM instrument WHERE instrumentId = ?;";
            Instrument instrument = jdbc.queryForObject(FIND_INSTRUMENT, new InstrumentMapper(), id);
            return instrument;
        }
        catch(DataAccessException e)
        {
            return null;
        }
    }

    @Override
    public Instrument addInstrument(Instrument instrument) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String INSERT_INSTRUMENT = "INSERT INTO instrument (categoryId, instrumentId, instrumentName) VALUES (?,?);";
//        jdbc.update(INSERT_INSTRUMENT, instrument.getCategoryId(), instrument.getInstrumentId(), instrument.getInstrumentName());
//        Instrument newInstrument = findById(instrument.getInstrumentId());
//        return newInstrument;
        return null;
    }

    @Override
    public List<Instrument> findAll() 
    {
        final String FIND_INSTRUMENTS = "SELECT categoryId, instrumentId, instrumentName FROM instrument;";
        List<Instrument> instruments = jdbc.query(FIND_INSTRUMENTS, new InstrumentMapper());
        return instruments;
    }

    @Override
    public void updateInstrument(Instrument instrument) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String UPDATE_INSTRUMENT = "UPDATE instrument SET instrumentName = ?, categoryId = ? WHERE instrumentId = ?;";
//        jdbc.update(UPDATE_INSTRUMENT, instrument.getInstrumentName(), instrument.getInstrumentId(), instrument.getCategoryId());
    }

    @Override
    public void deleteInstrument(int id) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String DELETE_INSTRUMENT = "DELETE FROM instrument WHERE instrumentId = ?;";
//        jdbc.update(DELETE_INSTRUMENT, id);
    }

    public static final class InstrumentMapper implements RowMapper<Instrument>
    {
        @Override
        public Instrument mapRow(ResultSet rs, int index) throws SQLException
        {
            Instrument instrument = new Instrument();
            instrument.setInstrumentId(rs.getInt("instrumentId"));
            instrument.setInstrumentName(rs.getString("instrumentName"));
            instrument.setCategoryId(rs.getInt("categoryID"));
            return instrument;
        }
    }
    
}
