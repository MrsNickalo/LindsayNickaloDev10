
/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws IOException 
    {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        out.println("this is a line in my file...");
        out.println("a second line in my file...");
        out.println("a third line in my file...");
        out.flush(); //forces all to be written
        out.close(); //always close your stream!
        Scanner sc = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));
        //go through the file line by line
        while(sc.hasNextLine())
        {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
    }
}
