package Controller;
import DAO.ClassRosterDao;
import DAO.ClassRosterDaoException;
import DAO.ClassRosterDaoFileImpl;
import DTO.Student;
import UI.ClassRosterView;
import java.util.List;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 */
public class ClassRosterController 
{
    //attributes
    ClassRosterView view;
    ClassRosterDao dao;
    //constructor with dependency injection
    public ClassRosterController(ClassRosterDao dao, ClassRosterView view)
    {
        this.dao = dao;
        this.view = view;
    }
    
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
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage(); 
        }
        catch(ClassRosterDaoException e)
        {
            view.displayErrorMessage(e.getMessage());
        }
    }    
    //method to print menu and get user selection
    private int getMenuSelection()
    {
        return view.printMenuAndGetSelection();
    }
    //method to create student
    private void createStudent()throws ClassRosterDaoException 
    {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }
    //method to display all students
    private void listStudents()throws ClassRosterDaoException 
    {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    //method to view individual student
    private void viewStudent()throws ClassRosterDaoException 
    {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
    }
    //method to remove student
    private void removeStudent()throws ClassRosterDaoException 
    {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        dao.removeStudent(studentId);
        view.displayRemoveSuccessBanner();
    }
    //method to deal with unknown comman
    private void unknownCommand()
    {
        view.displayUnknownCommandBanner();
    }
    //method to display exit message
    private void exitMessage()
    {
        view.displayExitBanner();
    }
}
