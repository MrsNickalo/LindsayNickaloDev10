package Controller;

import DAO.MP3LibraryDao;
import DAO.MP3LibraryDaoException;
import DAO.MP3LibraryDaoFileImpl;
import DTO.MP3;
import UI.MP3LibraryView;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 13, 2019
 * Controller for the MP3 Library.
 */
public class MP3LibraryController {
    //attributes
    MP3LibraryView view;
    MP3LibraryDao dao;
    public MP3LibraryController(MP3LibraryDao dao, MP3LibraryView view)
    {
        this.dao = dao;
        this.view = view;
    }
    //methods
    /**
     * method to execute the program
     */
    public void run()
    {
        boolean keepGoing = true;
        try
        {
            while(keepGoing)
            {
                int menuSelection = getMenuSelection();
                switch(menuSelection)
                {
                    case 1:
                        addMP3();
                        break;
                    case 2:
                        removeMP3();
                        break;
                    case 3:
                        editMP3();
                        break;
                    case 4:
                        listAllMP3s();
                        break;
                    case 5:
                        viewMP3();
                        break;
                    case 6:
                        searchMP3();
                        break;
                    case 7:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
        }
        catch(MP3LibraryDaoException e)
        {
            view.displayErrorMessageBanner(e.getMessage());
        }
        exitMessage();
    }
    
    /**
     * method to display the menu and get selection
     * @return integer of menu selection
     */
    private int getMenuSelection()
    {
        return view.printMenuAndGetSelection();
    }
    /**
     * method to add MP3 to library
     */
    private void addMP3()throws MP3LibraryDaoException
    {
        view.displayAddMP3Banner();
        MP3 newMP3 = view.getNewMP3Info();
        dao.addMP3(newMP3.getTitle(), newMP3);
        view.displayAddSuccessBanner();
    }
    /**
     * method to remove MP3 from library
     */
    private void removeMP3()throws MP3LibraryDaoException
    {
        view.displayRemoveMP3Banner();
        String title = view.getTitleInfo();
        dao.removeMP3(title);
        view.displayRemoveSuccessBanner();
    }
    /**
     * method to edit MP3 already in library
     */
    private void editMP3()throws MP3LibraryDaoException
    {
        view.displayEditMP3Banner();
        String title = view.getTitleInfo();
        MP3 currentMP3 = dao.getMP3(title);
        if(currentMP3 == null)
        {
            view.displayErrorMessageBanner("Title not found!");
            return;
        }
        int editSelection = view.printAndGetEditMenuSelection();
        MP3 editMP3 = new MP3(title);
        switch(editSelection)
        {
            case 1:
                editMP3 = view.editTitle(currentMP3);
                break;
            case 2:
                editMP3 = view.editArtist(currentMP3);
                break;
            case 3:
                editMP3 = view.editAlbum(currentMP3);
                break;
            case 4:
                editMP3 = view.editReleaseDate(currentMP3);
                break;
            case 5:
                editMP3 = view.editGenre(currentMP3);
                break;
            case 6:
                editMP3 = view.editUserNote(currentMP3);
                break;
            case 7:
                view.displayExitEditBanner();
                break;
            default:
                unknownCommand();
        }
        //MP3 editMP3 = view.getInfoToEdit(title);
        dao.removeMP3(title);
        dao.addMP3(editMP3.getTitle(), editMP3);
        view.displayEditSuccessBanner();
    }
    /**
     * method to list all MP3s in library
     */
    private void listAllMP3s()throws MP3LibraryDaoException
    {
        view.displayDisplayAllBanner();
        List<MP3> titles = dao.getAllMP3s();
        view.displayAllTitles(titles);
        view.displayGenericBanner();
    }
    /**
     * method to view information about one MP3
     */
    private void viewMP3()throws MP3LibraryDaoException
    {
        view.displayViewMP3Banner();
        String title = view.getTitleInfo();
        MP3 viewMP3 = dao.getMP3(title);
        view.displayMP3(viewMP3);
        view.displayGenericBanner();
    }
    /**
     * method to search for an MP3 by title
     */
    private void searchMP3()throws MP3LibraryDaoException
    {
        view.displaySearchForBanner();
        String title = view.getTitleInfo();
        MP3 searchMP3 = dao.getMP3(title);
        view.displayMP3(searchMP3);
        view.displayGenericBanner();
    }
    /**
     * method to display an error message when the input is invalid
     */
    private void unknownCommand()
    {
        view.displayUnknownCommandBanner();
    }
    /**
     * method to display message upon exit
     */
    private void exitMessage()
    {
        view.displayExitBanner();
    }
}
