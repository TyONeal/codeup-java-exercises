package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        Student leeroy = new Student("Leeroy Jenkins");
        leeroy.addGrade(30.5);
        leeroy.addGrade(33.3);
        leeroy.addGrade(100);
        Student bob = new Student("Bob Saget");
        bob.addGrade(88.4);
        bob.addGrade(45.4);
        bob.addGrade(99.4);
        Student sally = new Student("Sally Mae");
        sally.addGrade(98.4);
        sally.addGrade(93.3);
        sally.addGrade(91.2);
        Student tony = new Student("Tony Hawk");
        tony.addGrade(66.6);
        tony.addGrade(87.4);
        tony.addGrade(44.4);

        students.put("Goddamn it Leeroy", leeroy);
        students.put("Bob Saget!", bob);
        students.put("Sally Gurllll", sally);
        students.put("skater boi", tony);

        System.out.println("Welcome\n\n!");
        System.out.println("Here are a list of our students:\n");
            for(var username  : students.entrySet()) {
                System.out.print(username.getKey() + " || ");
            }
            for (int i = 0; i <= students.size(); i++ ) {
                System.out.println("\n\nWhich student would you like to know more about?");
                String studentInformation = input.getString();
                if (studentInformation.equalsIgnoreCase("Sally Gurllll")) {
                    System.out.println("Student Name: " + students.get("Sally Gurllll").getName() + " - " + "GitHub UserName: Sally Gurllll\n" + "Grade Point Average: " + students.get("Sally Gurllll").getGradeAverage() + "\nGrades for this term: " + students.get("Sally Gurllll").displayAllGrades());
                } else if (studentInformation.equalsIgnoreCase("skater boi")) {
                    System.out.println("Student Name: " + students.get("skater boi").getName() + " - " + "GitHub UserName: skater boi\n" + "Grade Point Average: " + students.get("skater boi").getGradeAverage() + "\nGrades for this term: " + students.get("skater boi").displayAllGrades());
                } else if (studentInformation.equalsIgnoreCase("Goddamn it Leeroy")) {
                    System.out.println("Student Name: " + students.get("Goddamn it Leeroy").getName() + " - " + "GitHub UserName: Goddamn it Leeroy\n" + "Grade Point Average: " + students.get("Goddamn it Leeroy").getGradeAverage() + "\nGrades for this term: " + students.get("Goddamn it Leeroy").displayAllGrades());
                } else if (studentInformation.equalsIgnoreCase("Bob Saget!")) {
                    System.out.println("Student Name: " + students.get("Bob Saget!").getName() + " - " + "GitHub UserName: Bob Saget!\n" + "Grade Point Average: " + students.get("Bob Saget!").getGradeAverage() + "\nGrades for this term: " + students.get("Bob Saget!").displayAllGrades());
                } else {
                    System.out.println("Sorry, username is not found, please try again.");
                }
                System.out.println("\n Would you like to see another Student?");
                Boolean continueResponse = input.yesNo();

                if(continueResponse) {
                    } else {
                    System.out.println("Thank you, and have a nice day!");
                    break;
                    }
            }

    }
}
