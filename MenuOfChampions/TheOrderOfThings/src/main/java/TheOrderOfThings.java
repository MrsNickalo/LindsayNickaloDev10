/**
 *
 * @author Lindsay Gen10
 * Date: December 02, 2019
 */
package com.tsguild.foundations.variables;
public class TheOrderOfThings {
    public static void main(String[] args){
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Alpha-Centaurian";
        material = "platinum";
        purpose = "good";
        noun = "dragon";
        
        //When you use + with strings, Java concatenates them instead of just adding them
        System.out.println(number + " " + opinion + " " + size + " "  + age + " " + shape + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
    }
}
