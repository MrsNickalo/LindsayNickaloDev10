
/**
 *
 * @author Lindsay Gen10
 *class of Employee that inherits from Person
*we use the extends operator to do this
* */
import java.text.DecimalFormat;
class Employee extends Person implements Payable
{
    //extra data fields that employee will have that
    //a regular instantation of Person won't
    private double salary;
    //constructor (invokes Person constructor)
    public Employee(String na, int ag, Address add, double s)
    {
        //call to super is how we invoke the parent's constructor
        //must be first line in constructor of child class
        super(na, ag, add);
        salary = s;        
    }
    //set methods
    public void setSalaray(double sal)
    {
        this.salary = sal;
    }
    //get methods
    public double getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        String output = ""; 
        //to call the parent's toString method
        //use the super. operator
        output += super.toString();
        output += "Salary: " + df.format(salary) + "\n";
        return output;
    }
    @Override
    public double calculateWeeklyPay()
    {
        return salary / 52;
    }
}

