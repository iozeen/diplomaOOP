package course;

import java.util.List;


public class FirmAccount {
    private static int balance;
    private static int sessionCost;
    private static FirmAccount firmAccount = new FirmAccount();
    private static List<Student> studentList;
    private static List<Group> groupList;



    private FirmAccount() {

    }

    public static FirmAccount getFirmAccount() {
        return firmAccount;
    }

    public static void updateBalance(int sum) {
        balance = balance + sum;
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

    public static int getSessionCost() {
        return sessionCost;
    }
}
