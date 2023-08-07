package practiceGrades;

import util.Input;

import java.util.ArrayList;

public class Gradebook extends StudentRecord  {

// instance variables
    private double totalGrade;
    private char letterGrade;

    Assignment[] assignments;

// scanner

Input gradeScan = new Input();

//constructors
//    public Gradebook() {
//        assignments = new Assignment[];
//    }

// getters setters

    public double getTotalGrade() {
        return totalGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }


// other methods

    public Assignment populateGradeBook() {
        System.out.println("Would you like to add an assignment to the gradebook?");
        boolean addAssignment = gradeScan.yesNo();
            if (addAssignment) {
                while (true) {
                    System.out.println("\n Let's add an assignment to the student's gradebook: \n");
                    Assignment assignment = new Assignment();
                    Assignment newAssignment = assignment.createAssignment();
                    System.out.println("\nWould you like to add another?\n");
                    boolean addAnother = gradeScan.yesNo();
                    if (addAnother) {

                    } else {
                        return newAssignment;
                    }
                }
            } else {
                System.out.println("No further assignments have been added to the gradebook.");
                return null;
            }

    }
//    public double calculateTotalGrade() {
//        double gradePointTotal = 0;
//        double gradePointAverage = 0;
//        for(int i = 0; i <= gradeBook.size(); i++) {
//            gradePointAverage = gradePointTotal += gradeBook.get(i).getGrade();
//        }
//        return gradePointAverage;
//    }
    public char calculateLetterGrade(double gradePointAverage){
        this.letterGrade = 'Z';
        if (gradePointAverage >= 90 && gradePointAverage <= 100) {
            this.letterGrade = 'A';
        }
        if (gradePointAverage >= 80 && gradePointAverage < 90) {
            this.letterGrade = 'B';
        }
        if (gradePointAverage >= 70 && gradePointAverage < 80) {
            this.letterGrade = 'C';
        }
        if (gradePointAverage >= 60 && gradePointAverage < 70) {
            this.letterGrade = 'D';
        }
        if (gradePointAverage < 60) {
            this.letterGrade = 'F';
        }
        return this.letterGrade;
    }
}
