
import java.util.Arrays;

/**
 *
 * @author Lindsay Gen10
 */
public class Test {
    public static void main(String[] args) 
    {
        Address testAddress = new Address("123 Main Street", "Rock Hill, SC ", "29730");
        Person testPerson = new Person("Bobby Joe", 22, testAddress);
        System.out.println(testPerson);
        System.out.println("*************************************************");
        Employee testEmployee = new Employee("Susan", 19, testAddress, 25000);
        System.out.println(testEmployee);
        System.out.println("*************************************************");
        Contractor testContractor = new Contractor("Billy Bob", 21, testAddress, true, 15.75);
        System.out.println(testContractor);
        System.out.println("*************************************************");
        Person equalContractor = testContractor;
        System.out.println(equalContractor);
        System.out.println("*************************************************");
        PersonnelTest tester = new PersonnelTest();
        System.out.println("People Array");
        tester.add(testPerson);
        tester.add(testEmployee);
        tester.add(testContractor);
        tester.add(equalContractor);
        tester.printPerson();
        System.out.println("*************************************************");
        System.out.println("Sorted");
        tester.sortPeople();
        tester.printPerson();
        System.out.println("*************************************************");
        System.out.println("Payables");
        PayableTest payTest = new PayableTest();
        payTest.add(testEmployee);
        payTest.add(testContractor);
        payTest.printPaychecks();
    }
}
