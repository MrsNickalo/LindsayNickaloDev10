
import Controller.MP3LibraryController;
import DAO.MP3LibraryDao;
import DAO.MP3LibraryDaoFileImpl;
import UI.MP3LibraryView;
import UI.UserIO;
import UI.UserIOConsoleImpl;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 15, 2019
 */
public class App 
{
    public static void main(String[] args) 
    {
        UserIO myIo = new UserIOConsoleImpl();
        MP3LibraryView myView;
        myView = new MP3LibraryView(myIo);
        MP3LibraryDao myDao = new MP3LibraryDaoFileImpl();
        MP3LibraryController controller = new MP3LibraryController(myDao, myView);
        controller.run();
    }
}
