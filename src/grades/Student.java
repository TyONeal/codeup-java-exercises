package grades;

import java.util.ArrayList;
import util.Input;

public class Student {
//instance variables
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();
    private final Input input = new Input();

// constructors
    public Student(String newName) {
        name = newName;
        grades.clear();
    }

//getters and setters

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
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
