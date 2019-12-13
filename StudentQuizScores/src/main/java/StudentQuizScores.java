/**
 *
 * @author Lindsay Gen10
 * @date Dec 10, 2019
 * This program will allow the user to check a student's quiz score average,
 * view a list of all students in the system, add a student, remove
 * a student, and view the quiz scores for a given student.
 */
public class StudentQuizScores {
    public static void main(String[] args) 
    {
        UserIOClass sys = new UserIOClass();
        StudentSystem studentSystem = new StudentSystem();
        sys.print("WELCOME!");
        String answer;
        do
        {
            sys.print("What would you like to do?");
            int selection = sys.readInt("1 - View a list of students in the system\n"
                    + "2 - Add a student to the system\n"
                    + "3 - Remove a student from the system\n"
                    + "4 - View a list of quiz scores for a specific student\n"
                    + "5 - View the average quiz score for a given student\n"
                    + "6 - View class quiz average\n"
                    + "7 - View student with lowest quiz average\n"
                    + "8 - View student with highest quiz average\n"
                    + "9 - EXIT THE PROGRAM", 1, 9);
            sys.print("");
            String name;
            switch(selection)
            {
                case 1:
                    studentSystem.getStudents();
                    break;
                case 2:
                    name = sys.readString("Please enter the student's name to add:");
                    studentSystem.addStudent(name);
                    break;
                case 3:
                    name = sys.readString("Please enter the student's name to remove:");
                    studentSystem.removeStudent(name);
                    break;
                case 4: 
                    name = sys.readString("Please enter the student's name to see their quiz grades:");
                    studentSystem.displayStudentScores(name);
                    break;
                case 5:
                    name = sys.readString("Please enter the student's name to see their average quiz score:");
                    studentSystem.averageQuizScore(name);
                    break;
                case 6:
                    sys.print("Classroom Quiz Grade Average is: " + studentSystem.classAverage());
                    break;
                case 7:
                    studentSystem.lowestQuizAverage();
                    break;
                case 8:
                    studentSystem.highestQuizAverage();
                    break;
                default:
                    return;
            }
            answer = sys.readString("Is there something else you would like to do? (y/n)");
        }while(answer.equals("Y") || answer.equals("y"));
    }
}
