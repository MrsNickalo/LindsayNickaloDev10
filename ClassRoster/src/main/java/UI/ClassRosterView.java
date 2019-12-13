package UI;

import DTO.Student;
import java.util.List;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 */
public class ClassRosterView 
{
    //attributes
    UserIO io;
    //constructor with dependency injection
    public ClassRosterView(UserIO io)
    {
        this.io = io;
    }
    
    //method to display menu and returns user selection
    public int printMenuAndGetSelection()
    {
        int menuSelection = 0;
        io.print("Main Menu");
        io.print("1. List Student IDs");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");
        return io.readInt("Please select from the above choices.");
    }
    //method to get info of new student
    public Student getNewStudentInfo()
    {
        String studentId = io.readString("Please enter Student ID");
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name ");
        String cohort = io.readString("Please enter Cohort");
        Student currentStudent = new Student(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
    }
    //method to display banner for creating student
    public void displayCreateStudentBanner()
    {
        io.print("=== Create Student ===");
    }
    //method to display banner for successful creation of student
    public void displayCreateSuccessBanner()
    {
        io.readStringEnter("Student successfully created. Please hit enter to continue...");
    }
    //method to display list of students
    public void displayStudentList(List<Student> studentList)
    {
        for(Student currentStudent : studentList)
        {
            io.print(currentStudent.getStudentId() + ": " +
                    currentStudent.getFirstName() + " " +
                    currentStudent.getLastName());
        }
        //work around for PRESS ENTER PROBLEM
        io.readStringEnter("");
        io.readStringEnter("Please press enter to continue.\n");
    }
    //method to display banner for showing all students
    public void displayDisplayAllBanner()
    {
        io.print("=== Display All Students ===");
    }
    //method to display banner for showing student
    public void displayDisplayStudentBanner()
    {
        io.print("=== Display Student ===");
    }
    //method to get user's student id choice
    public String getStudentIdChoice()
    {
        return io.readString("Please enter the Student ID.");
    }
    //method to display student
    public void displayStudent(Student student)
    {
        if(student != null)
        {
            io.print(student.getStudentId());
            io.print(student.getFirstName() + " " +
                    student.getLastName());
            io.print(student.getCohort() + "\n");
        }
        else
        {
            io.print("No such student.");
        }
        io.readStringEnter("Please press Enter to continue...");
    }
    //method to display banner for removing student
    public void displayRemoveStudentBanner()
    {
        io.print("=== Remove Student ===");
    }
    //method to display banner for successful removal of student
    public void displayRemoveSuccessBanner()
    {
        io.readStringEnter("Student successfully removed. Please hit enter to continue.");
    }
    //method to display banner upon exit
    public void displayExitBanner()
    {
        io.print("Good bye!!!");
    }
    //method to display banner for invalid command
    public void displayUnknownCommandBanner()
    {
        io.print("Unknown Command!!!");
    }
    //method to display error message
    public void displayErrorMessage(String errorMsg)
    {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
