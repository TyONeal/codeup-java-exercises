package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        Student leeroy = new Student();
        leeroy.addGrade(30.5);
        leeroy.addGrade(33.3);
        leeroy.addGrade(100);
        Student bob = new Student();
        bob.addGrade(88.4);
        bob.addGrade(45.4);
        bob.addGrade(99.4);
        Student sally = new Student();
        sally.addGrade(98.4);
        sally.addGrade(93.3);
        sally.addGrade(91.2);
        Student tony = new Student();
        tony.addGrade(66.6);
        tony.addGrade(87.4);
        tony.addGrade(44.4);

        students.put(leeroy.getGitHubUserName(), leeroy);
        students.put(bob.getGitHubUserName(), bob);
        students.put(sally.getGitHubUserName(), sally);
        students.put(tony.getGitHubUserName(), tony);

        System.out.println("Welcome\n\n!");
        System.out.println("Here are a list of our students:\n");
            for(var username  : students.entrySet()) {
                System.out.print(username.getKey() + " || ");
            }
            for (int i = 0; i <= students.size(); i++ ) {
                System.out.println("\n\nWhich student would you like to know more about?");
                String studentInformation = input.getString();
                if (studentInformation.equalsIgnoreCase(sally.getGitHubUserName())) {
                    System.out.println("Student Name: " + students.get(sally.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + sally.getGitHubUserName() + "\n" + "Grade Point Average: " + students.get(sally.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(sally.getGitHubUserName()).displayAllGrades());
                } else if (studentInformation.equalsIgnoreCase(tony.getGitHubUserName())) {
                    System.out.println("Student Name: " + students.get(tony.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + tony.getGitHubUserName() + "\n" +"Grade Point Average: " + students.get(tony.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(tony.getGitHubUserName()).displayAllGrades());
                } else if (studentInformation.equalsIgnoreCase(leeroy.getGitHubUserName())) {
                    System.out.println("Student Name: " + students.get(leeroy.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + leeroy.getGitHubUserName() + "\n" + "Grade Point Average: " + students.get(leeroy.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(leeroy.getGitHubUserName()).displayAllGrades());
                } else if (studentInformation.equalsIgnoreCase(bob.getGitHubUserName())) {
                    System.out.println("Student Name: " + students.get(bob.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + bob.getGitHubUserName() + "\n" +"Grade Point Average: " + students.get(bob.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(bob.getGitHubUserName()).displayAllGrades());
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
