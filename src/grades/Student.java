package grades;

import java.util.ArrayList;

public class Student {
//instance variables
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

// constructors
    public Student(String newName) {
        name = newName;
        grades.clear();
    }

//methods

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeTotal = 0;
        for (double grade : grades) {
             gradeTotal = gradeTotal + grade;
        }
        return gradeTotal / grades.size();
    }

    public ArrayList<Double> displayAllGrades() {
        ArrayList<Double> eachGrade = new ArrayList<>();
        for (double grade : grades) {
            eachGrade.add(grade);
        } return eachGrade;
    }

}
