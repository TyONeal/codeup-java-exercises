package practiceGrades;

import util.Input;

public class Student extends StudentRecord {

//instance variables
    private String name;
    private String gitHubUserName;

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
