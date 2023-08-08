package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import util.Input;

public class Student {
//instance variables
    private String name;
    private String gitHubUserName;
    private ArrayList<Double> grades;
    private final Input input = new Input();
    private HashMap<String, String> attendance;

    private ArrayList<String> daysMissed;

// constructors
    public Student() {
        System.out.println("Let's create a student:\n");
        System.out.println("\nEnter the student's name:");
        setName(input.getString());

        grades = new ArrayList<>();

        System.out.println("Let's add our student's gitHub username:");
        setGitHubUserName(input.getString());

        attendance = new HashMap<>();
        daysMissed = new ArrayList<>();
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

    public HashMap<String, String> getAttendance() {
        return attendance;
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

    public void recordAttendance() {
        attendance.put(input.getString(), input.getString());
    }
    public void recordAttendance(String key, String value) {
        attendance.put(key, value);
    }

    public void displayAllAttendance(HashMap<String, String> attendance) {
        for(Map.Entry day : attendance.entrySet()) {
            if (day.getValue().equals("P")) {
                System.out.println("On " + day.getKey() + " The student was present.");
            } else {
                System.out.println("On " + day.getKey() + " The student was absent.");
            }
        }
    }

    public ArrayList<String> findAbsentDays() {
        for(Map.Entry day : attendance.entrySet()) {
            if (day.getValue().equals("A")) {
                daysMissed.add(day.getKey().toString());
            }
        }
        System.out.println(daysMissed.toString());
        return daysMissed;
    }

}
