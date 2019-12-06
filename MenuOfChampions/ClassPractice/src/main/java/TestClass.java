/**
 *
 * @author Lindsay Gen10
 */
public class TestClass {
    String firstName;
    String lastName;
    int age;
    
    //this is the constructor for our class
    //whenever we make a new object for the class, we can pass in
    //the firstName, lastName, and age.
    public TestClass(String fName, String lName, int a)
    {
        firstName = fName;
        lastName = lName;
        age = a;
    }
    //now we need our get methods to return the attributes
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    //Now let's give it another method
    public void printDetails()
    {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }
    
}
