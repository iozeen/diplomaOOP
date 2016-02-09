package course;

/**
 * Created by Illya on 09.02.2016.
 */
public interface DirectorInterface {
    Manager hireManager(Employee employee);
    Instructor hireInstructor(Employee employee);
}
