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
        leeroy.recordAttendance("2023-02-02", "P");
        leeroy.recordAttendance("2023-02-03", "P");
        leeroy.recordAttendance("2023-02-04", "P");

        Student bob = new Student();
        bob.addGrade(88.4);
        bob.addGrade(45.4);
        bob.addGrade(99.4);
        leeroy.recordAttendance("2023-02-02", "P");
        leeroy.recordAttendance("2023-02-03", "A");
        leeroy.recordAttendance("2023-02-04", "P");

        Student sally = new Student();
        sally.addGrade(98.4);
        sally.addGrade(93.3);
        sally.addGrade(91.2);
        leeroy.recordAttendance("2023-02-02", "P");
        leeroy.recordAttendance("2023-02-03", "A");
        leeroy.recordAttendance("2023-02-04", "A");

        Student tony = new Student();
        tony.addGrade(66.6);
        tony.addGrade(87.4);
        tony.addGrade(44.4);
        leeroy.recordAttendance("2023-02-02", "A");
        leeroy.recordAttendance("2023-02-03", "A");
        leeroy.recordAttendance("2023-02-04", "A");

        students.put(leeroy.getGitHubUserName(), leeroy);
        students.put(bob.getGitHubUserName(), bob);
        students.put(sally.getGitHubUserName(), sally);
        students.put(tony.getGitHubUserName(), tony);

        do {
            System.out.println("Welcome\n\n!");
            System.out.println("Here are a list of our students:\n");
            for (var username : students.entrySet()) {
                System.out.print(username.getKey() + " || ");
            }

            System.out.println("Menu: \n\n0 - To view a student.\n1 - Check a student's grades.\n2 - Check a student's attendance. \n3 - Exit.");

            if (input.getInt() == 0) {

                for (int i = 0; i <= students.size(); i++) {
                    System.out.println("\n\nWhich student would you like to know more about?");
                    String studentInformation = input.getString();
                    if (studentInformation.equalsIgnoreCase(sally.getGitHubUserName())) {
                        System.out.println("Student Name: " + students.get(sally.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + sally.getGitHubUserName() + "\n" + "Grade Point Average: " + students.get(sally.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(sally.getGitHubUserName()).displayAllGrades());
                    } else if (studentInformation.equalsIgnoreCase(tony.getGitHubUserName())) {
                        System.out.println("Student Name: " + students.get(tony.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + tony.getGitHubUserName() + "\n" + "Grade Point Average: " + students.get(tony.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(tony.getGitHubUserName()).displayAllGrades());
                    } else if (studentInformation.equalsIgnoreCase(leeroy.getGitHubUserName())) {
                        System.out.println("Student Name: " + students.get(leeroy.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + leeroy.getGitHubUserName() + "\n" + "Grade Point Average: " + students.get(leeroy.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(leeroy.getGitHubUserName()).displayAllGrades());
                    } else if (studentInformation.equalsIgnoreCase(bob.getGitHubUserName())) {
                        System.out.println("Student Name: " + students.get(bob.getGitHubUserName()).getName() + " - " + "GitHub UserName: " + bob.getGitHubUserName() + "\n" + "Grade Point Average: " + students.get(bob.getGitHubUserName()).getGradeAverage() + "\nGrades for this term: " + students.get(bob.getGitHubUserName()).displayAllGrades());
                    } else {
                        System.out.println("Sorry, username is not found, please try again.");
                    }

                    System.out.println("\n Would you like to see another Student?");
                    Boolean continueResponse = input.yesNo();

                    if (continueResponse) {
                    } else {
                        System.out.println("Thank you, and have a nice day!");
                        break;
                    }
                }
            } else if (input.getInt() == 1) {
                    System.out.println("The student's grades are:");
                for (Student student : students.values()) {
                    System.out.println(student.getName() + ": " + student.getGradeAverage() + student.displayAllGrades());
                }
            } else if (input.getInt() == 2) {
                    System.out.println("The student's attendance so far is:");
                for (Student student : students.values()) {
                    student.displayAllAttendance(student.getAttendance());
                    student.findAbsentDays();
                }
            } else if (input.getInt() == 3) {
                System.out.println("Would you like to exit?");
                    if(input.yesNo()) {
                        break;
                    } else {
                        return;
                    }
            }
        }while(true);
    }
}


