package course;


import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements InterfaceManager {

    private List<Student> studentList = new ArrayList<>();

    public Manager(String name, String surname, String id) {
        super(name, surname, id);
    }

    @Override
    public boolean addStudent(String name, String surname, String id) {
        if (!Utils.checkIsPerson(id, FirmAccount.getStudentList())) {
            Student studentForAdd = new Student(name, surname, id);
            FirmAccount.getStudentList().add(studentForAdd);
            studentList.add(studentForAdd);
            return true;
        }
        return false;


    }

    @Override
    public boolean getPayment(String studentId, int sum) {
        if (Utils.checkIsPerson(studentId, FirmAccount.getStudentList())) {
            FirmAccount.updateBalance(sum);
            ((Student) Utils.personById(studentId, FirmAccount.getStudentList())).setBalance(sum);
            return true;

        }
        return false;
    }

    @Override
    public boolean addStudentToGroup(String studentId, int idGroup) {
        Student studentForAdd = (Student) Utils.personById(studentId, FirmAccount.getStudentList());
        Group group = Utils.groupById(idGroup);
        if (studentForAdd.getBalance() >= Utils.costGroup(idGroup)) {
            group.getStudentList().add(studentForAdd);
            studentForAdd.setBalance(-Utils.costGroup(idGroup));
            return true;
        }
        return false;

    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
