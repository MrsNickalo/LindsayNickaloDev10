package DAO;
import DTO.MP3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 13, 2019
 */
public class MP3LibraryDaoFileImpl implements MP3LibraryDao 
{
    //constants for file persistence
    public static final String LIBRARY_FILE = "library.txt";
    public static final String DELIMITER = "::";
    //attributes
    Map<String, MP3> library = new HashMap<>();
    @Override
    public MP3 addMP3(String title, MP3 mp3) throws MP3LibraryDaoException
    {
        loadLibrary();
        MP3 newMP3 = library.put(title, mp3);
        writeLibrary();
        return newMP3;
    }
    @Override
    public MP3 removeMP3(String title) throws MP3LibraryDaoException
    {
        loadLibrary();
        MP3 removeMP3 = library.remove(title);
        writeLibrary();
        return removeMP3;
    }
    
    @Override
    public List<MP3> getAllMP3s() throws MP3LibraryDaoException
    {
        loadLibrary();
        return new ArrayList<MP3>(library.values());
    }

    @Override
    public MP3 getMP3(String title) throws MP3LibraryDaoException
    {
        loadLibrary();
        return library.get(title);
    }

    /**
     * method to unmarshall MP3 from string
     * @param mp3AsText
     * @return 
     */
    private MP3 unmarshallMP3(String mp3AsText)
    {
        String[] mp3Tokens = mp3AsText.split(DELIMITER);
        String title = mp3Tokens[0];
        MP3 mp3FromFile = new MP3(title);
        mp3FromFile.setArtist(mp3Tokens[1]);
        mp3FromFile.setAlbum(mp3Tokens[2]);
        mp3FromFile.setReleaseDate(mp3Tokens[3]);
        mp3FromFile.setGenre(mp3Tokens[4]);
        mp3FromFile.setUserNote(mp3Tokens[5]);
        return mp3FromFile;
    }
    /**
     * method to load library from file
     * @throws MP3LibraryDaoException 
     */
    private void loadLibrary() throws MP3LibraryDaoException
    {
        Scanner scanner;
        try
        {
            scanner = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        }
        catch(FileNotFoundException e)
        {
            throw new MP3LibraryDaoException("-_- Could not load library data into memory.", e);
        }
        String currentLine;
        MP3 currentMP3;
        while(scanner.hasNextLine())
        {
            currentLine = scanner.nextLine();
            currentMP3 = unmarshallMP3(currentLine);
            library.put(currentMP3.getTitle(), currentMP3);
        }
        //always close your file!!!!
        scanner.close();
    }
    /**
     * method to marshall MP3 object into a String.
     * @param mp3
     * @return 
     */
    private String marshallMP3(MP3 mp3)
    {
        String mp3AsText = mp3.getTitle() + DELIMITER;
        mp3AsText += mp3.getArtist() + DELIMITER;
        mp3AsText += mp3.getAlbum() + DELIMITER;
        mp3AsText += mp3.getReleaseDate() + DELIMITER;
        mp3AsText += mp3.getGenre() + DELIMITER;
        mp3AsText += mp3.getUserNote();
        return mp3AsText;
    }
    /**
     * write library to file
     * @throws MP3LibraryDaoException 
     */
    private void writeLibrary() throws MP3LibraryDaoException
    {
        PrintWriter out;
        try
        {
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        }
        catch(IOException e)
        {
            throw new MP3LibraryDaoException("Could not save student data.", e);
        }
        String mp3AsText;
        List<MP3> mp3List = this.getAllMP3s();
        for(MP3 currentMP3 : mp3List)
        {
            mp3AsText = marshallMP3(currentMP3);
            out.println(mp3AsText);
            out.flush();
        }
        out.close();
    }
}
