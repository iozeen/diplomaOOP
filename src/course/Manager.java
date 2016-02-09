package course;


public class Manager implements ManagerInterface {


    @Override
    public boolean addStudent(Student student, Level level) {
        if(!FirmAccount.getStudentList().contains(student)){
            FirmAccount.getStudentList().add(student);
            student.setLevel(level);
            return true;
        }
        return false;
    }

    @Override
    public boolean getPayment(Student student, int sum) {
        if(FirmAccount.getStudentList().contains(student)){
            FirmAccount.updateBalance(sum);
            student.setSessionSum(sum);
            return true;
        }
        return false;
    }
}
