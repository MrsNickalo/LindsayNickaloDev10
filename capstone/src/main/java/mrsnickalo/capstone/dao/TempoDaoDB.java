package mrsnickalo.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import mrsnickalo.capstone.entity.Tempo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * DAO for pre-loaded tempos.
 */

@Repository
public class TempoDaoDB implements TempoDao
{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public Tempo findById(String id) 
    {
        try
        {
            final String FIND_TEMPO = "SELECT tempoId, bpm FROM tempo WHERE tempoId = ?;";
            Tempo tempo = jdbc.queryForObject(FIND_TEMPO, new TempoMapper(), id);
            return tempo;
        }
        catch(DataAccessException e)
        {
            return null;
        }
    }

    @Override
    public Tempo addTempo(Tempo tempo) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String INSERT_TEMPO = "INSERT INTO tempo (tempoId, BPM) VALUES (?,?);";
//        jdbc.update(INSERT_TEMPO, tempo.getTempoId(), tempo.getBpm());
//        Tempo newTempo = findById(tempo.getTempoId());
//        return newTempo;
        return null;
    }

    @Override
    public List<Tempo> findAll() 
    {
        final String FIND_TEMPOS = "SELECT tempoId, BPM FROM tempo;";
        List<Tempo> tempos = jdbc.query(FIND_TEMPOS, new TempoMapper());
        return tempos;
    }

    @Override
    public void updateTempo(Tempo tempo) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String UPDATE_TEMPO = "UPDATE tempo SET BPM = ? WHERE tempoId = ?;";
//        jdbc.update(UPDATE_TEMPO, tempo.getBpm(), tempo.getTempoId());
    }

    @Override
    public void deleteTempo(String id) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String DELETE_TEMPO = "DELETE FROM tempo WHERE tempoId = ?;";
//        jdbc.update(DELETE_TEMPO, tempo.getTempoId());
    }

    public static final class TempoMapper implements RowMapper<Tempo>
    {
        @Override
        public Tempo mapRow(ResultSet rs, int index) throws SQLException
        {
            Tempo tempo = new Tempo();
            tempo.setTempoId(rs.getString("tempoId"));
            tempo.setBpm(rs.getInt("BPM"));
            return tempo;
        }
    }
}
