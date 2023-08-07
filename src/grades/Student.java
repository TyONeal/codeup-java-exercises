package grades;

import java.util.ArrayList;
import util.Input;

public class Student {
//instance variables
    private String name;
    private String gitHubUserName;
    private ArrayList<Double> grades;
    private final Input input = new Input();

// constructors
    public Student() {
        System.out.println("Let's create a student:\n");
        System.out.println("\nEnter the student's name:");
        setName(input.getString());

        grades = new ArrayList<>();

        System.out.println("Let's add our student's gitHub username:");
        setGitHubUserName(input.getString());
    }

//getters and setters

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getGitHubUserName() {
        return this.gitHubUserName;
    }
    public void setGitHubUserName(String userName) {
        this.gitHubUserName = userName;
    }
    public double getGradeAverage() {

        double gradeTotal = 0;
        for (double grade : grades) {
             gradeTotal = gradeTotal + grade;
        }
        return gradeTotal / grades.size();
    }

    //other methods
    public void addGrade(double grade) {
        grades.add(grade);
    }
    public void addGrade() {
         grades.add(input.getDouble());
    }
    public String displayAllGrades() {
        ArrayList<Double> eachGrade = new ArrayList<>(grades);
        return eachGrade.toString();
    }

}
