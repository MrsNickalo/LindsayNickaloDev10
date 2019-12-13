/**
 *
 * @author Lindsay Gen10
 * Date: December 10, 2019
 * Test driver class for Payable interface
 */
public class PayableTest {
    Payable[] payables = new Payable[1];
    
    public void add(Payable p)
    {
        //this is horrible implementation...
        //can't figure out how to do this without
        //using a list (or ArrayList)
        if(payables[0] == null)
        {
            payables[0] = p;
        }
        else
        {
            Payable[] payablesTemp = new Payable[payables.length + 1];
            for(int i=0; i<payables.length; i++)
            {
                payablesTemp[i] = payables[i];
            }
            payablesTemp[payables.length] = p;
            payables = new Payable[payablesTemp.length];
            for(int i=0; i<payablesTemp.length; i++)
            {
                payables[i] = payablesTemp[i];
            }
        }
    }
    //method to Print array
    public void printPaychecks()
    {
        for (Payable p : payables) 
        {
            System.out.println(p.getName() + ": $" + p.calculateWeeklyPay());
        }
    }
}
