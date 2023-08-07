package practiceGrades;

import util.Input;

public class Student extends StudentRecord {

//instance variables
    private String name;
    private String gitHubUserName;
    private double attendanceRecord;
    private double totalGrade;
    private char letterGrade;

// scanner
   Input studentScan = new Input();

//getters and setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGitHubUserName() {
        return gitHubUserName;
    }
    public void setGitHubUserName(String gitHubUserName) {
        this.gitHubUserName = gitHubUserName;
    }

    public double getAttendanceRecord() {
        return attendanceRecord;
    }

    public double getTotalGrade() {
        return totalGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

//methods

    public Student populateStudent(Student student) {
                    System.out.println("Please enter the new student's name:");
                    String studentName = studentScan.getString();
                student.setName(studentName);
                    System.out.println("Please enter the student's gitHub Username:");
                    String gitUsername = studentScan.getString();
                student.setGitHubUserName(gitUsername);
                return student;
    }

}
