
import java.util.Arrays;

/**
 *
 * @author Lindsay Gen10
 */
public class PersonnelTest {
    private Person[] people = new Person[1];
    //method to add Person to array
    public void add(Person p)
    {
        //this is horrible implementation...
        //can't figure out how to do this without
        //using a list (or ArrayList)
        if(people[0] == null)
        {
            people[0] = p;
        }
        else
        {
            Person[] peopleTemp = new Person[people.length + 1];
            for(int i=0; i<people.length; i++)
            {
                peopleTemp[i] = people[i];
            }
            peopleTemp[people.length] = p;
            people = new Person[peopleTemp.length];
            for(int i=0; i<peopleTemp.length; i++)
            {
                people[i] = peopleTemp[i];
            }
        }
    }
    //method to Print array
    public void printPerson()
    {
        for (Person people1 : people) 
        {
            System.out.println(people1);
        }
    }
    //method for sorting
    public void sortPeople()
    {
        Arrays.sort(people);
    }
}
