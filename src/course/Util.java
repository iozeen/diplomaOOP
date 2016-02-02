package course;


public class Util {
    private Util(){

    }
    public static  boolean checkStudentForAdd(int idCode) {
        for (Student student : ListStudent.getStudentList()) {
            if (student.getIdCode() == idCode) {
                return false;
            }
        }
        return true;
    }

    public static  boolean checkEmployeeForAdd(int idCode) {
        for (Employee emp : Employee.getEmployeeList()) {
            if (emp.getIdCode() == idCode) {
                return false;
            }
        }
        return true;
    }
    public static Student findByIdStudent(int idStudent){
        for (Student student : ListStudent.getStudentList()) {
            if(student.getIdStudent() == idStudent){
                return student;
            }
        }
        return null;
    }

}
