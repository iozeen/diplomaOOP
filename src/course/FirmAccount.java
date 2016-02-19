package course;

import java.util.ArrayList;
import java.util.List;

public class FirmAccount {
    private static int balance;
    private static int sessionCost;
    private static FirmAccount firmAccount = new FirmAccount();
    private static List<Student> studentList = new ArrayList<>();
    private static List<Group> groupList = new ArrayList<>();
    private static List<Instructor> instructorList = new ArrayList<>();
    private static List<Employee> employeeList = new ArrayList<>();

    public static void updateBalance(int sum) {
        balance = balance + sum;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setSessionCost(int sum) {
        sessionCost = sum;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static List<Group> getGroupList() {
        return groupList;
    }

    public static List<Instructor> getInstructorList() {
        return instructorList;
    }

    public static int getSessionCost() {
        return sessionCost;
    }
}
