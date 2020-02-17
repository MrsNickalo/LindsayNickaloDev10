package mrsnickalo.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mrsnickalo.capstone.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * DAO for standard song library.
 */

@Repository
public class StandardSongDaoDB implements SongDao
{
    @Autowired
    JdbcTemplate jdbc;
    
    @Override
    public Song findById(int id) 
    {
        try
        {
            final String FIND_SONG = "SELECT songID, songTitle, songArtist, songYear, soprano, "
                    + "alto, tenor, bass, bpm FROM standardSongLibrary WHERE songID = ?;";
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
        // this is disabled for now. To enable, uncomment the code...
//        final String INSERT_SONG = "INSERT INTO standardSongLibrary (songTitle, songArtist,"
//                + "songYear, soprano, alto, tenor, bass, bpm) VALUES (?,?,?,?,?,?,?,?);";
//        jdbc.update(INSERT_SONG, song.getTitle(), song.getArtist(), song.getYear(), song.getSoprano(), song.getAlto(),
//                song.getTenor(), song.getBass(), song.getBpm());
//        song.setSongId(jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class));
//        return song;
        return null;
    }

    @Override
    public List<Song> findAll() 
    {
        final String FIND_SONGS = "SELECT songId, songTitle, songArtist, songYear, soprano, alto,"
                + "tenor, bass, bpm FROM standardSongLibrary;";
        List<Song> songs = jdbc.query(FIND_SONGS, new SongMapper());
        return songs;
    }

    @Override
    public void updateSong(Song song) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String UPDATE_SONG = "UPDATE standardSongLibrary SET songTitle = ?, songArtist = ?,"
//                + "songYear = ?, soprano = ?, alto = ?, tenor = ?, bass = ?, bpm = ? WHERE"
//                + "songId = ?;";
//        jdbc.update(UPDATE_SONG, song.getTitle(), song.getArtist(), song.getYear(),
//                song.getSoprano(), song.getAlto(), song.getTenor(), song.getBass(),
//                song.getBpm(), song.getSongId());
    }

    @Override
    public void deleteSong(int id) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String DELETE_SONG = "DELETE FROM standardSongLibrary WHERE songId = ?;";
//        jdbc.update(DELETE_SONG, id);
    }
    
    public String convertToLilypad(String input, String title, String part)
    {
        String[] tokens = input.split(" ");
        String output = "";
        output += "\\header{ ";
        output += "title = \" " + title + " \" ";
        output += "subtitle = \" " + part + " \" }";
        output += "{ ";
        for(String s : tokens)
        {
            String note = s.substring(0,1).toLowerCase();
            if(note.equals("|"))
            {
                output += " | ";
                continue;
            }
            String octave;
            if(s.contains("1"))
            {
                octave = ",,,";
            }
            else if(s.contains("2"))
            {
                octave = ",,";
            }
            else if(s.contains("3"))
            {
                octave = ",";
            }
            else if(s.contains("4"))
            {
                octave = "";
            }
            else if(s.contains("6"))
            {
                octave = "''";
            }
            else if(s.contains("7"))
            {
                octave = "'''";
            }
            else if(s.contains("8"))
            {
                octave = "''''";
            }
            else if(s.contains("9"))
            {
                octave = "'''''";
            }
            else
            {
                octave = "'";
            }
            if(note.equals("r"))
            {
                octave = "";
            }
            boolean sharp = s.contains("#");
            boolean flat = s.contains("b");
            boolean dot = s.contains(".");
            List<Integer> length = new ArrayList<>();
            s = s.replaceAll("[^qhwis]", "");
            switch(s)
            {
                case "":
                    length.add(4);
                    break;
                case "q":
                    length.add(4);
                    break;
                case "h":
                    length.add(2);
                    break;
                case "w":
                    length.add(1);
                    break;
                case "i":
                    length.add(8);
                    break;
                case "s":
                    length.add(16);
                    break;
                default:
                    char[] array = s.toCharArray();
                    for(char c : array)
                    {
                        switch(c)
                        {
                            case 'q':
                                length.add(4);
                                break;
                            case 'h':
                                length.add(2);
                                break;
                            case 'w':
                                length.add(1);
                                break;
                            case 'i':
                                length.add(8);
                                break;
                            case 's':
                                length.add(16);
                                break;
                            default:
                        }
                    }
            }
            for(int i=0; i<length.size(); i++)
            {
                output += note;
                if(sharp)
                {
                    output += "is";
                }
                else if(flat)
                {
                    output += "es";
                }
                output += octave;
                output += length.get(i);
                if(length.size() > 1 && i < length.size()-1)
                {
                    output += "~";
                }
                output += " ";
            }
        }
        output += " }";
        return output;
    }
    
    public static final class SongMapper implements RowMapper<Song>
    {
        @Override
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
