package mrsnickalo.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * DAO for private song library.
 */

@Repository
public class PrivateSongDaoDB implements SongDao
{
@Autowired
    JdbcTemplate jdbc;
    
    @Override
    public Song findById(int id) 
    {
        try
        {
            final String FIND_SONG = "SELECT songID, songTitle, songArtist, songYear, soprano, "
                    + "alto, tenor, bass, bpm FROM privateSongLibrary WHERE songID = ?;";
            Song song = jdbc.queryForObject(FIND_SONG, new SongMapper(), id);
            return song;
        }
        catch(DataAccessException e)
        {
            return null;
        }
    }

    @Override
    public List<Song> findByTitle(String title) 
    {
        try
        {
            final String FIND_SONG = "SELECT songID, songTitle, songArtist, songYear, soprano, "
                    + "alto, tenor, bass, bpm FROM standardSongLibrary WHERE songTitle = ?;";
            List<Song> song = jdbc.query(FIND_SONG, new SongMapper(), title);
            return song;
        }
        catch(DataAccessException e)
        {
            return null;
        }
    }
    
    @Override
    public Song addSong(Song song) 
    {
        final String INSERT_SONG = "INSERT INTO privateSongLibrary (songTitle, songArtist,"
                + "songYear, soprano, alto, tenor, bass, bpm) VALUES (?,?,?,?,?,?,?,?);";
        jdbc.update(INSERT_SONG, song.getTitle(), song.getArtist(), song.getYear(), song.getSoprano(), song.getAlto(),
                song.getTenor(), song.getBass(), song.getBpm());
        song.setSongId(jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class));
        return song;
    }

    public Song addSong(Song song, User user) 
    {
        Song newSong = addSong(song);
        final String INSERT_SONG_USER = "INSERT INTO userprivatesonglibrary (username, songId) VALUES (?,?);";
        jdbc.update(INSERT_SONG_USER, user.getUsername(), song.getSongId());
        return song;
    }
    
    @Override
    public List<Song> findAll() 
    {
        final String FIND_SONGS = "SELECT songId, songTitle, songArtist, songYear, soprano, alto,"
                + "tenor, bass, bpm FROM privateSongLibrary;";
        List<Song> songs = jdbc.query(FIND_SONGS, new SongMapper());
        return songs;
    }

    @Override
    public void updateSong(Song song) 
    {
        final String UPDATE_SONG = "UPDATE privateSongLibrary SET songTitle = ?, songArtist = ?,"
                + "songYear = ?, soprano = ?, alto = ?, tenor = ?, bass = ?, bpm = ? WHERE "
                + "songId = ?;";
        jdbc.update(UPDATE_SONG, song.getTitle(), song.getArtist(), song.getYear(),
                song.getSoprano(), song.getAlto(), song.getTenor(), song.getBass(),
                song.getBpm(), song.getSongId());
    }

    @Override
    public void deleteSong(int id) 
    {
        final String DELETE_SONG = "DELETE FROM privateSongLibrary WHERE songId = ?;";
        final String DELETE_SONG_USER = "DELETE FROM userprivatesonglibrary WHERE songId = ?;";
        jdbc.update(DELETE_SONG_USER, id);
        jdbc.update(DELETE_SONG, id);
    }
    
    public static final class SongMapper implements RowMapper<Song>
    {
        public Song mapRow(ResultSet rs, int index) throws SQLException
        {
            Song song = new Song();
            song.setSongId(rs.getInt("songID"));
            song.setTitle(rs.getString("songTitle"));
            song.setArtist(rs.getString("songArtist"));
            song.setYear(rs.getInt("songYear"));
            song.setSoprano(rs.getString("soprano"));
            song.setAlto(rs.getString("alto"));
            song.setTenor(rs.getString("tenor"));
            song.setBass(rs.getString("bass"));
            song.setBpm(rs.getInt("BPM"));
            return song;
        }
    }
    
}
