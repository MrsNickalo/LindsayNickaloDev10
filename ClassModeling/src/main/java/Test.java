/**
 *
 * @author Lindsay Gen10
 * Date: December 09, 2019
 * Test file for our classModeling exercise
 */
public class Test {
    public static void main(String[] args) 
    {
        HouseGPS testHouse = new HouseGPS(123, "Main Street", "Rock Hill", "SC", 29730);
        System.out.println(testHouse);
        HouseGPS testHouse2 = new HouseGPS(456, "White Street", "Rock Hill", "SC", 29733);
        testHouse2.setOnLeft(true);
        testHouse2.setIsDestination(true);
        testHouse2.setDistanceAway(60.3);
        testHouse2.setTimeAway(1.5);
        System.out.println(testHouse2);
        House3D testHouse3D = new House3D(2, 4, 3, 2500.00, 6);
        AirplaneControl airplane = new AirplaneControl("MVC326", "JFK", "CIA");
        
    }

}
