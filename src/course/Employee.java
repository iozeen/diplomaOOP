package course;


import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends Person implements InterfaceEmployee {
    private static List<Employee> employeeList = new ArrayList<>();

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public void printStudentByLevel(String level) {

    }

    @Override
    public void printStudentByName() {

    }

    @Override
    public void printStudentByGroup(String group) {

    }
}
