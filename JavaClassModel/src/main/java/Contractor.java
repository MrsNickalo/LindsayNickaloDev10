/**
 *
 * @author Lindsay Gen10
*class Contractor that will inherit from Person
* **/
import java.text.DecimalFormat;
class Contractor extends Person implements Payable
{
    private boolean permanent;
    private double hourlyRate;
    //constructor with inheritance
    public Contractor(String na, int ag, Address add, boolean perm, double hR)
    {
        super(na, ag, add);
        permanent = perm;
        hourlyRate = hR;
    }
    //set methods
    public void setHourlyRate(double hR)
    {
        this.hourlyRate = hR;
    }
    //get methods
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        String output = "";
        output += super.toString();
        output += "Permament Position: ";
        if(permanent)
        {
            output += "Yes\n";
        }
        else
        {
            output += "No\n";
        }
        output += "Hourly Rate: " + df.format(hourlyRate) + "\n";
        return output;
    }
    @Override
    public double calculateWeeklyPay()
    {
        return hourlyRate * 40;
    }
}
