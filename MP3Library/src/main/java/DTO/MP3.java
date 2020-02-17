package DTO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 13, 2019
 */
public class MP3 {
    //attributes
    String title;
    String releaseDate;
    String album;
    String artist;
    String genre;
    String userNote;
    //methods
    /**
     * Constructor accepting a title
     * @param t String parameter
     */
    public MP3(String t)
    {
        title = t;
    }
    //setters and getters
    public void setReleaseDate(String d)
    {
        this.releaseDate = d;
    }
    public void setAlbum(String a)
    {
        this.album = a;
    }
    public void setArtist(String a)
    {
        this.artist = a;
    }
    public void setGenre(String g)
    {
        this.genre = g;
    }
    public void setUserNote(String u)
    {
        this.userNote = u;
    }
    public String getTitle()
    {
        return title;
    }
    public String getReleaseDate()
    {
        return releaseDate;
    }
    public String getAlbum()
    {
        return album;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getGenre()
    {
        return genre;
    }
    public String getUserNote()
    {
        return userNote;
    }
    /**
     * method to override toString
     * @return String
     */
    public String toString()
    {
        String output = "";
        output += title + " BY: ";
        output += artist + "\n";
        output += "Album: " + album + " ";
        output += "Released on: " + releaseDate + " ";
        output += "Genre: " + genre + "\n";
        output += "Note: " + userNote;
        return output;
    }
}
