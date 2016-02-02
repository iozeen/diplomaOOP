package course;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    private static List<Student> studentList = new ArrayList<>();

    private ListStudent() {

    }

    public static List<Student> getStudentList() {
        return studentList;
    }
}
