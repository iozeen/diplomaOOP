package course;

/**
 * Created by Illya on 09.02.2016.
 */
public interface ManagerInterface {
    boolean addStudent(Student student, Level level);
    boolean getPayment(Student student, long sum);
}
