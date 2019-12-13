package DTO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Student class for the Class Roster.
 */
public class Student {
    //attributes
    private String firstName;
    private String lastName;
    private String studentId;
    //identifier of Java or .Net plus month and year
    private String cohort; 
    //constructor
    public Student(String sID)
    {
        this.studentId = sID;
    }
    //setter methods
    public void setFirstName(String f)
    {
        this.firstName = f;
    }
    public void setLastName(String l)
    {
        this.lastName = l;
    }
    public void setCohort(String c)
    {
        this.cohort = c;
    }
    //getter methods
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getStudentId()
    {
        return studentId;
    }
    public String getCohort()
    {
        return cohort;
    }
}
