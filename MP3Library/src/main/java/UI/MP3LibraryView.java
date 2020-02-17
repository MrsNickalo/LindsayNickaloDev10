package UI;
import DTO.MP3;
import UI.UserIO;
import UI.UserIOConsoleImpl;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 13, 2019
 */
public class MP3LibraryView {
    //attributes
    UserIO io;
    //constructor with dependency injection
    public MP3LibraryView(UserIO io)
    {
        this.io = io;
    }
    //methods
    /**
     * method to display menu options and get user input
     * @return integer inputted for menu selection
     */
    public int printMenuAndGetSelection()
    {
        io.print("Main Menu");
        io.print("====================");
        io.print("1 - Add MP3 to library");
        io.print("2 - Remove MP3 from library");
        io.print("3 - Edit MP3 in library");
        io.print("4 - List all MP3s in library");
        io.print("5 - View info for MP3");
        io.print("6 - Find MP3 by title");
        io.print("7 - EXIT");
        return io.readInt("Please select an option from above.");
    }
    /**
     * method to display banner for adding a mp3
     */
    public void displayAddMP3Banner()
    {
        io.print("=== Add MP3 ===");
    }
    /**
     * method to display banner for successful addition of mp3
     */
    public void displayAddSuccessBanner()
    {
        io.readStringEnter("MP3 added successfully. Press enter to continue...");
    }
    /**
     * method to get information to add mp3
     * @return MP3 object 
     */
    public MP3 getNewMP3Info()
    {
        String title = io.readString("What's the title of the MP3? ");
        String artist = io.readString("Who's the artist? ");
        String album = io.readString("What album is it on? ");
        String releaseDate = io.readString("When was it released? ");
        String genre = io.readString("What genre is it? ");
        String userNote = io.readString("User Note: ");
        MP3 newMP3 = new MP3(title);
        newMP3.setArtist(artist);
        newMP3.setAlbum(album);
        newMP3.setReleaseDate(releaseDate);
        newMP3.setGenre(genre);
        newMP3.setUserNote(userNote);
        return newMP3;
    }
    /**
     * method to display banner for removing MP3
     */
    public void displayRemoveMP3Banner()
    {
        io.print("=== Remove MP3 ===");
    }
    /**
     * method to display banner for successful removal of MP3
     */
    public void displayRemoveSuccessBanner()
    {
        io.readStringEnter("MP3 removed successfully. Press enter to continue...");
    }
    /**
     * method to get title information from user
     */
    public String getTitleInfo()
    {
        return io.readString("What is the title you are looking for? ");
    }
    /**
     * method to display banner for editing an MP3
     */
    public void displayEditMP3Banner()
    {
        io.print("=== Edit MP3 ===");
    }
    /**
     * method to display banner for successful edit of MP3
     */
    public void displayEditSuccessBanner()
    {
        io.readStringEnter("MP3 editted successfully. Press enter to continue...");
    }
    /**
     * method to get information to edit (we are going to assume they will edit all fields for now....)
     * @param title title to identify MP3
     * @return MP3 object edited
     */
    public MP3 getInfoToEdit(String title)
    {
        //to make this where they can pick and choose what they want to change:
        //Option 1: make a menu, let them select, change field
        //OPtion 2: ask for each field, change as desired
        String artist = io.readString("Who's the artist? ");
        String album = io.readString("What album is it on? ");
        String releaseDate = io.readString("When was it released? ");
        String genre = io.readString("What genre is it? ");
        String userNote = io.readString("User Note: ");
        MP3 newMP3 = new MP3(title);
        newMP3.setArtist(artist);
        newMP3.setAlbum(album);
        newMP3.setReleaseDate(releaseDate);
        newMP3.setGenre(genre);
        newMP3.setUserNote(userNote);
        return newMP3;
    }
    /**
     * method to display banner for viewing all mp3s
     */
    public void displayDisplayAllBanner()
    {
        io.print("=== View All MP3s ===");
    }
    /**
     * method to display generic banner
     */
    public void displayGenericBanner()
    {
        io.readStringEnter("Press enter to continue...");
    }
    /**
     * method to display all titles
     * @param titles Set of Strings that are all titles in library
     */
    public void displayAllTitles(List<MP3> titles)
    {
        for(MP3 t : titles)
        {
            io.print(t.getTitle());
        }
    }
    /**
     * method to display banner for viewing specific MP3
     */
    public void displayViewMP3Banner()
    {
        io.print("=== View MP3 ===");
    }
    /**
     * method to display MP3
     * @param mp3 MP3 object to display
     */
    public void displayMP3(MP3 mp3)
    {
        if(mp3 != null)
        {
            io.print(mp3.toString());
        }
        else
        {
            io.print("No such MP3.");
        }
    }
    /**
     * method to display banner for searching for MP3
     */
    public void displaySearchForBanner()
    {
        io.print("=== Search for MP3 ===");
    }
    /**
     * method to display banner for an unknown command
     */
    public void displayUnknownCommandBanner()
    {
        io.print("=== UNKNOWN COMMAND! ===");
    }
    /**
     * method to display banner upon exit
     */
    public void displayExitBanner()
    {
        io.print("=== Goodbye! ===");
    }
    /**
     * method to display error message
     * @param errorMsg String with error message
     */
    public void displayErrorMessageBanner(String errorMsg)
    {
        io.print("=== ERROR! ERROR! ===");
        io.print(errorMsg);
        io.readStringEnter("Press enter to continue...");
    }
    /**
     * method to print out edit menu options
     * @return int of menu selection
     */
    public int printAndGetEditMenuSelection()
    {
        io.print("1 - Edit title ");
        io.print("2 - Edit artist ");
        io.print("3 - Edit album ");
        io.print("4 - Edit release date ");
        io.print("5 - Edit genre ");
        io.print("6 - Edit user note ");
        io.print("7 - EXIT ");
        return io.readInt("Please make a selection... ");
    }
    /**
     * method to edit title of given MP3
     * @param currentMP3 MP3 object to be edited for title
     * @return MP3 object that's been edited
     */
    public MP3 editTitle(MP3 currentMP3)
    {
        String title = io.readString("What is the new title?");
        MP3 newMP3 = new MP3(title);
        newMP3.setArtist(currentMP3.getArtist());
        newMP3.setAlbum(currentMP3.getAlbum());
        newMP3.setReleaseDate(currentMP3.getReleaseDate());
        newMP3.setGenre(currentMP3.getGenre());
        newMP3.setUserNote(currentMP3.getUserNote());
        return newMP3;
    }
    /**
     * method to edit title of given MP3
     * @param currentMP3 MP3 object to be edited for artist
     * @return MP3 object that's been edited
     */
    public MP3 editArtist(MP3 currentMP3)
    {
        String artist = io.readString("What is the new artist?");
        MP3 newMP3 = new MP3(currentMP3.getTitle());
        newMP3.setArtist(artist);
        newMP3.setAlbum(currentMP3.getAlbum());
        newMP3.setReleaseDate(currentMP3.getReleaseDate());
        newMP3.setGenre(currentMP3.getGenre());
        newMP3.setUserNote(currentMP3.getUserNote());
        return newMP3;
    }
    /**
     * method to edit title of given MP3
     * @param currentMP3 MP3 object to be edited for album
     * @return MP3 object that's been edited
     */
    public MP3 editAlbum(MP3 currentMP3)
    {
        String album = io.readString("What is the new album?");
        MP3 newMP3 = new MP3(currentMP3.getTitle());
        newMP3.setArtist(currentMP3.getArtist());
        newMP3.setAlbum(album);
        newMP3.setReleaseDate(currentMP3.getReleaseDate());
        newMP3.setGenre(currentMP3.getGenre());
        newMP3.setUserNote(currentMP3.getUserNote());
        return newMP3;
    }
    /**
     * method to edit title of given MP3
     * @param currentMP3 MP3 object to be edited for release date
     * @return MP3 object that's been edited
     */
    public MP3 editReleaseDate(MP3 currentMP3)
    {
        String releaseDate = io.readString("What is the new release date?");
        MP3 newMP3 = new MP3(currentMP3.getTitle());
        newMP3.setArtist(currentMP3.getArtist());
        newMP3.setAlbum(currentMP3.getAlbum());
        newMP3.setReleaseDate(releaseDate);
        newMP3.setGenre(currentMP3.getGenre());
        newMP3.setUserNote(currentMP3.getUserNote());
        return newMP3;
    }
    /**
     * method to edit title of given MP3
     * @param currentMP3 MP3 object to be edited for genre
     * @return MP3 object that's been edited
     */
    public MP3 editGenre(MP3 currentMP3)
    {
        String genre = io.readString("What is the new genre?");
        MP3 newMP3 = new MP3(currentMP3.getTitle());
        newMP3.setArtist(currentMP3.getArtist());
        newMP3.setAlbum(currentMP3.getAlbum());
        newMP3.setReleaseDate(currentMP3.getReleaseDate());
        newMP3.setGenre(genre);
        newMP3.setUserNote(currentMP3.getUserNote());
        return newMP3;
    }
    /**
     * method to edit title of given MP3
     * @param currentMP3 MP3 object to be edited for user note
     * @return MP3 object that's been edited
     */
    public MP3 editUserNote(MP3 currentMP3)
    {
        String userNote = io.readString("What is the new user note?");
        MP3 newMP3 = new MP3(currentMP3.getTitle());
        newMP3.setArtist(currentMP3.getArtist());
        newMP3.setAlbum(currentMP3.getAlbum());
        newMP3.setReleaseDate(currentMP3.getReleaseDate());
        newMP3.setGenre(currentMP3.getGenre());
        newMP3.setUserNote(userNote);
        return newMP3;
    }
    /**
     * method to display banner for exiting the edit menu
     */
    public void displayExitEditBanner()
    {
        io.print("Exiting editor...");
    }
}
