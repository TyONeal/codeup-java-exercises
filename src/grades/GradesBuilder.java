package grades;
import util.Input;

import java.util.HashMap;

public class GradesBuilder {
    private static Input input = new Input();

    public static HashMap<String, Student> hashBuilder() {
         HashMap<String, Student> students = new HashMap<>();
        return students;
    }

    public static HashMap<String, Student> hashPopulator(HashMap students) {
        System.out.println("Would you like to enter a new Student?");
        Boolean newStudentResponse = input.yesNo();
            if (newStudentResponse) {
                while (true) {
                    System.out.println("Please enter student name:");
                    String newStudentName = input.getString();
                    Student newStudent  = new Student(newStudentName);
                    students.putIfAbsent(newStudentName, newStudent);
                    System.out.println(students);
                    System.out.println("Would you like to add another student?");
                    Boolean addAnotherResponse = input.yesNo();
                        if(addAnotherResponse) {

                        } else {
                            break;
                        }
                }
            }  return students;
    }


}
