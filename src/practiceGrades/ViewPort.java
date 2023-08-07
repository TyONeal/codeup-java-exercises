package practiceGrades;

import java.util.ArrayList;

public class ViewPort {
    public static void main(String[] args) {
        StudentRecord newRecord = new StudentRecord();
        ArrayList<Object> populatedRecord = newRecord.populateStudentRecord(newRecord);
//        newRecord.displayOnRecordCreation(populatedRecord);

    }
}
