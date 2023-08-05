package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student newStudent = new Student("Ty");

        newStudent.addGrade(100);
        newStudent.addGrade(50);
        System.out.println(newStudent.getGradeAverage());
    }
}
