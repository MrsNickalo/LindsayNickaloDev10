package DAO;
import DTO.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Implementation of ClassRosterDao with file.
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {
    
    //constants for file persistence
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";
    
    //attributes
    private Map<String, Student> students = new HashMap<>();
    //methods
    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterDaoException
    {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        writeRoster();
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException 
    {
        loadRoster();
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterDaoException
    {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterDaoException
    {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        writeRoster();
        return removedStudent;
    }
    //method to unmarshall a string of text into a Student object
    private Student unmarshallStudent(String studentAsText)
    {
        String[] studentTokens = studentAsText.split(DELIMITER);
        String studentId = studentTokens[0];
        Student studentFromFile = new Student(studentId);
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]);
        return studentFromFile;
    }
    //method to load our class roster
    private void loadRoster() throws ClassRosterDaoException
    {
        Scanner scanner;
        try
        {
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        }
        catch(FileNotFoundException e)
        {
            throw new ClassRosterDaoException("-_- Could not load roster data into memory.", e);
        }
        String currentLine;
        Student currentStudent;
        while(scanner.hasNextLine())
        {
            currentLine = scanner.nextLine();
            currentStudent = unmarshallStudent(currentLine);
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        //always close your file!!!!
        scanner.close();
    }
    //method to marshall a Student into a String
    private String marshallStudent(Student aStudent)
    {
        String studentAsText = aStudent.getStudentId() + DELIMITER;
        studentAsText += aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort();
        return studentAsText;
    }
    //method to write class roster to a file
    private void writeRoster() throws ClassRosterDaoException
    {
        PrintWriter out;
        try
        {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        }
        catch(IOException e)
        {
            throw new ClassRosterDaoException("Could not save student data.", e);
        }
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for(Student currentStudent : studentList)
        {
            studentAsText = marshallStudent(currentStudent);
            out.println(studentAsText);
            out.flush();
        }
        out.close();
    }
}
