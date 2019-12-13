/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 * Class for system of students.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class StudentSystem {
    UserIOClass sys = new UserIOClass();
    String name;
    Map<String, ArrayList<Integer>> records = new HashMap<>();
    //methods
    public void getStudents()
    {
        Set<String> students = records.keySet();
        for(String s : students)
        {
            sys.print(s);
        }
    }
    public void addStudent(String n)
    {
        ArrayList<Integer> quiz = new ArrayList<>();
        String answer = sys.readString("Would you like to add a grade for that student? (y/n)");
        while(answer.equals("y") || answer.equals("Y"))
        {
            int input = sys.readInt("Enter a valid grade: ", 0, 100);
            quiz.add(input);
            answer = sys.readString("Would you like to add another grade for that student? (y/n)");
        }
        records.put(n,quiz);
    }
    public void removeStudent(String n)
    {
        records.remove(n);
    }
    public void displayStudentScores(String n)
    {
        ArrayList<Integer> current = records.get(n);
        for(int i : current)
        {
            sys.print(Integer.toString(i));
        }
    }
    public void averageQuizScore(String n)
    {
        double average = 0;
        ArrayList<Integer> current = records.get(n);
        for(int i : current)
        {
            average += i;
        }
        sys.print(Double.toString(average / current.size()));
    }
    public double averageQuizScoreNumber(String n)
    {
        double average = 0;
        ArrayList<Integer> current = records.get(n);
        for(int i : current)
        {
            average += i;
        }
        return average / current.size();
    }
    public String classAverage()
    {
        double average = 0;
        Set<String> students = records.keySet();
        for(String s : students)
        {
            average += averageQuizScoreNumber(s);
        }
        return Double.toString(average / students.size());
    }
    public void lowestQuizAverage()
    {
        double lowest = 101;
        Set<String> students = records.keySet();
        String lowestStudent = "";
        for(String s : students)
        {
            if(averageQuizScoreNumber(s) < lowest)
            {
                lowest = averageQuizScoreNumber(s);
                lowestStudent = s;
            }
        }
        sys.print(lowestStudent + " has the lowest quiz grade average.");
    }
    public void highestQuizAverage()
    {
        double highest = -1;
        Set<String> students = records.keySet();
        String highestStudent = "";
        for(String s : students)
        {
            if(averageQuizScoreNumber(s) > highest)
            {
                highest = averageQuizScoreNumber(s);
                highestStudent = s;
            }
        }
        sys.print(highestStudent + " has the highest quiz grade average.");
    }
}
