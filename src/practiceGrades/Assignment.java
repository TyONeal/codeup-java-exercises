package practiceGrades;

public class Assignment extends Gradebook implements Assignable {

// instance variables
    private String name;
    private double assignmentGrade;

// implementation
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getGrade() {
        return assignmentGrade;
    }

    @Override
    public void setGrade(double assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }

// other methods
    public Assignment createAssignment() {
        Assignment newAssignment = new Assignment();
        System.out.println("What is the name of the assignment you would like to add to the gradebook?");
        String nameResponse = gradeScan.getString();
        newAssignment.setName(nameResponse);
        System.out.println("What was the grade for " + nameResponse + "?");
        double gradeResponse = gradeScan.getDouble();
        newAssignment.setGrade(gradeResponse);
        return newAssignment;
    }

}
