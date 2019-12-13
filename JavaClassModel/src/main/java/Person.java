/**
 *
 * @author Lindsay Gen10
 */
public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected Address address;
    
    //constructor with three parameters
    public Person(String n, int ag, Address add)
    {
        name = n;
        age = ag;
        address = add;
    }
    //set methods
    public void setName(String n)
    {
        this.name = n;
    }
    public void setAge(int ag)
    {
        this.age = ag;
    }
    //get methods
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    //overloaded function to appropriately present data as String
    @Override
    public String toString()
    {
        String output = "";
        output += "Name: " + name + "\n";
        output += "Age: " + age + "\n";
        output += "Address: " + address + "\n";
        return output;
    }
    //function for comparisons
    @Override
    public int compareTo(Person p) 
    {
        return age - p.getAge();
    }
}

