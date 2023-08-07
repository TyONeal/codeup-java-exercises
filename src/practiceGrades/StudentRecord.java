package practiceGrades;


import java.util.ArrayList;
import java.util.HashMap;


public class StudentRecord extends ViewPort {

//instance variables
    private String name;
    ArrayList<Object> studentRecord = new ArrayList<>();

    Student newStudent = new Student();




//getters and setters

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Object> getStudentRecord() {
        return studentRecord;
    }




//method


    public ArrayList<Object> populateStudentRecord(StudentRecord studentRecord) {
        System.out.println("Welcome! Let's add a new Student's record: ");

        ArrayList<Object> populatedRecordList = studentRecord.getStudentRecord();


        //create the student
        System.out.println("First let's take in the student's information: \n");
        System.out.println();
        populatedRecordList.add(newStudent);


        //create the gradebook
        System.out.println("\nNow that we've made a student, let's add a gradebook to their records: \n");
        populatedRecordList.add(createGradeBook());

        //create the attendance
        System.out.println("\nNow that our student has some grades, let's add their attendance record: \n");
        populatedRecordList.add(createAttendanceRecord());

        // spit out list
        return populatedRecordList;


    }


    public Student createStudent() {
        return newStudent.populateStudent(newStudent);
    }

    public ArrayList<Assignment> createGradeBook () {
        Gradebook gradeBook = new Gradebook();
         return gradeBook.populateGradeBook(gradeBook);
    }

    public HashMap<String, String> createAttendanceRecord() {
        AttendanceRecord attendance = new AttendanceRecord();
        return attendance.populateAttendance(attendance);

    }

    public void displayOnRecordCreation(ArrayList<Object> populatedList) {
        System.out.println("Student Information: \n\n"+ "Student Name: " + this.newStudent.getName() + "\nStudent gitHub Username: " + this.newStudent.getGitHubUserName());
        System.out.println("\nGradeBook: \n\n" + "List of Grades: ");
        for(var grade : this.createGradeBook()) {
            System.out.println("Name of Assignment: " + grade.getName() + "\nAssignment Grade: " + grade.getGrade());
        }

        System.out.println("\nAttendance: \n\n");
        for(var day : this.createAttendanceRecord().entrySet()){
            if (day.getValue().equalsIgnoreCase("P")) {
                System.out.println("On " + day.getKey() + " The student was: Present");
            } else if (day.getValue().equalsIgnoreCase("A")) {
                System.out.println(day.getKey() + ": Absent");
            }
        }
    }

}
