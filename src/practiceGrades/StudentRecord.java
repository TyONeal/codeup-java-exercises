package practiceGrades;


import java.util.ArrayList;
import java.util.HashMap;


public class StudentRecord extends ViewPort {

//instance variables
    private String name;

    Student newStudent;
    Gradebook newGradebook;
    AttendanceRecord newAttendance;

//constructor

    public StudentRecord() {
    newStudent = new Student();
    newGradebook = new Gradebook();
    newAttendance = new AttendanceRecord();
    }




//getters and setters

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }






//method





    public Student createStudent(Student student) {
        return student.populateStudent(student);
    }

//    public ArrayList<Assignment> createGradeBook (Gradebook gradeBook) {
//         return gradeBook.populateGradeBook(gradeBook);
//    }

    public HashMap<String, String> createAttendanceRecord(AttendanceRecord attendance) {
        return attendance.populateAttendance(attendance);

    }

//    public void displayOnRecordCreation(ArrayList<StudentRecord> populatedList) {
//        System.out.println("Student Information: \n\n"+ "Student Name: " + this.newStudent.getName() + "\nStudent gitHub Username: " + this.newStudent.getGitHubUserName());
//        System.out.println("\nGradeBook: \n\n" + "List of Grades: ");
//        for(var grade : newGradebook.getGradeBook()) {
//            System.out.println("Name of Assignment: " + grade.getName() + "\nAssignment Grade: " + grade.getGrade());
//        }
//
//        System.out.println("\nAttendance: \n\n");
//        for(var day : this.newAttendance.getAttendance().entrySet()){
//            if (day.getValue().equalsIgnoreCase("P")) {
//                System.out.println("On " + day.getKey() + " The student was: Present");
//            } else if (day.getValue().equalsIgnoreCase("A")) {
//                System.out.println(day.getKey() + ": Absent");
//            }
//        }
//    }

}
