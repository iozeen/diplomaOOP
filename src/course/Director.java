package course;

import java.lang.reflect.GenericArrayType;
import java.text.SimpleDateFormat;

public class Director extends Employee implements DirectorInterface {
    @Override
    public Manager hireManager(String name, String surname) {
        Manager manager = new Manager();
//        manager.
        return manager;
    }

    @Override
    public Instructor hireInstructor(String name, String surname) {
        return null;
    }

//    @Override
//    long earnings() {
//        long earnings = FirmAccount.getBalance()/2;
//        return earnings;
//    }

    public static void main(String[] args) {
    }

    @Override
    long earnings() {
        return 0;
    }
}
