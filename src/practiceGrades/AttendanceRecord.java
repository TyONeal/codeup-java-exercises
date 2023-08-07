package practiceGrades;

import java.util.HashMap;
import util.Input;

public class AttendanceRecord extends StudentRecord {


//instance variables
    private double daysAttended = 0;
    private double daysMissed = 0;
    private double totalDays = 0;
    private double attendanceAverage;
    private HashMap<String, String> attendance = new HashMap<>();

// scanner

    Input attendanceScan = new Input();

// getters

    public double getDaysAttended() {
        return daysAttended;
    }

    public double getDaysMissed() {
        return daysMissed;
    }

    public double getTotalDays() {
        return totalDays;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }
    public double getAttendanceAverage() {
        return attendanceAverage;
    }

// methods

    public HashMap<String, String> populateAttendance(AttendanceRecord attendance) {
        HashMap<String, String> populatedAttendance = attendance.getAttendance();
        System.out.println("What is today's date? Please use FourDigitYear-TwoDigitMonth-TwoDigitDay");
            String dateResponse = attendanceScan.getString();

        String studentStatus = "";
        System.out.println("Was the student present?");
            boolean presentResponse = attendanceScan.yesNo();
                if(presentResponse) {
                    studentStatus = "P";
                    this.daysAttended++;
                } else {
                    studentStatus = "A";
                    this.daysMissed++;
                }
            populatedAttendance.put(dateResponse, studentStatus);
                this.totalDays++;
            return populatedAttendance;
    }
    public double calculateAttendanceAverage() {
        this.attendanceAverage = (this.totalDays - this.daysMissed) / totalDays;
        return attendanceAverage;
    }

}
