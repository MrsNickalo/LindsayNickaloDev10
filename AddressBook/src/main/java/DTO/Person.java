package DTO;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 13, 2019
 * Person class.
 */
public class Person implements Comparable<Person>{
    //attributes
    String firstName;
    String lastName;
    //constructor
    public Person(String f, String l)
    {
        firstName = f;
        lastName = l;
    }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //setters
    public void setFirstName(String f)
    {
        this.firstName = f;
    }
    public void setLastName(String l)
    {
        this.lastName = l;
    }
    //getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    //override toString
    @Override
    public String toString()
    {
        String output = "";
        output += firstName + " ";
        output += lastName + " ";
        return output;
    }
    //overide equals
    public boolean equals(Person p)
    {
        boolean answer = true;
        if(!this.firstName.equals(p.getFirstName()))
        {
            answer = false;
        }
        else if(!this.lastName.equals(p.getLastName()))
        {
            answer = false;
        }
        return answer;
    }
    //override compare to
    @Override
    public int compareTo(Person p)
    {
        int answer = 0;
        if(!(this.firstName.equals(p.getFirstName())))
        {
            answer = 1;
        }
        else if(!(this.lastName.equals(p.getLastName())))
        {
            answer = 1;
        }
        return answer;
    }
}
