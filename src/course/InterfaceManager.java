package course;

/**
 * Created by Illya on 09.02.2016.
 */
public interface InterfaceManager {
    boolean addStudent(String name, String surname, String id);
    boolean getPayment(String studentId, int sum);
    boolean addStudentToGroup(String studentId, int idGroup);
}
