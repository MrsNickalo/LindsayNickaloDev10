/**
 *
 * @author Lindsay Gen10
 * Date: December 03, 2019
 */
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args){
        int day;
        String dayName = "";
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        day = myScanner.nextInt();
        //Take the number mod 7 to convert to days of week.
        day = day % 7;
        if(day == 0)
        {
            day = 7;
        }
        //Debugging code
        //System.out.println(day);
        //Finding the day using if statements
        if(day == 1)
        {
            dayName = "Monday";
        }
        else if(day == 2)
        {
            dayName = "Tuesday";
        }
        else if(day == 3)
        {
            dayName = "Wednesday";
        }
        else if(day == 4)
        {
            dayName = "Thursday";
        }
        else if(day == 5)
        {
            dayName = "Friday";
        }
        else if(day == 6)
        {
            dayName = "Saturday";
        }
        else
        {
            dayName = "Sunday";
        }
        System.out.println("Day of the Week using If: " + dayName);
        
        //Find day using Switch
        dayName = "";
        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Sunday";
        }
        System.out.println("Day found using switch: " + dayName);
        
        //Demonstration of using switch fall out
        dayName = "";
        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayName = "Weekday";
                break;
            default:
                dayName = "Weekend";
        }
        System.out.println("Day found using switch fallout: " + dayName);
    }
}
