package DAO;

import DTO.Student;
import java.util.List;

/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Interface for ClassRosterDao.
 */
public interface ClassRosterDao {
    /**
    * Adds the given student to the roster
    * and associates it with the given student id.
    * If that student id is already in use, it will return that object.
    * Otherwise, it will return null.
    * @param studentId id with which student is to be associated
    * @param student student to be added to the roster
    * @return the Student object previously associated with the given student id if it exists, null otherwise
    */
    Student addStudent(String studentId, Student student)
            throws ClassRosterDaoException;
    
    /**
     * Returns a String array containing the 
     * student ids of all students in the roster.
     * @return String array containing the ids of all the students in the roster
     */
    List<Student> getAllStudents()
            throws ClassRosterDaoException;
    
    /**
     * Returns the student object associated with the given student id.
     * Returns null if no such student exists.
     * @param studentId ID of the student to retrieve
     * @return the Student object associated, null if none
     */
    Student getStudent(String studentId)
            throws ClassRosterDaoException;
    
    /**
     * Removes from the roster the student with the associated id.
     * Returns the student object that is being removed.
     * Returns null if none is associated.
     * @param studentId id of student to be removed
     * @return Student object or null if none
     */
    Student removeStudent(String studentId)
            throws ClassRosterDaoException;
}

