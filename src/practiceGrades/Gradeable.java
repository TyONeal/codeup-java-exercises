package practiceGrades;

import java.util.ArrayList;

public interface Gradeable {

//All Gradebooks will have to implement the following methods:
    public double getAssignmentGrade();
    public void setAssignmentGrade(double assignmentGrade);
    public ArrayList<Double> createGradeBook();
    public ArrayList<Double> populateGradeBook();
    public double gradeTotalAverage();
    public char calculateLetterGrade();

}
