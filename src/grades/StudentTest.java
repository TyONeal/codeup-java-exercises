package grades;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Enter a student name:");
        Student newStudent = new Student();

        newStudent.addGrade(100);
        newStudent.addGrade(50);

        System.out.println(newStudent.getGradeAverage());
    }
}
