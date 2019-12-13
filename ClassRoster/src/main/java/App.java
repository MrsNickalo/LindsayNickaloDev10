/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Application for Class Roster
 */
import Controller.ClassRosterController;
import DAO.ClassRosterDao;
import DAO.ClassRosterDaoFileImpl;
import UI.ClassRosterView;
import UI.UserIO;
import UI.UserIOConsoleImpl;
public class App {
    public static void main(String[] args) 
    {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView;
        myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }
}
