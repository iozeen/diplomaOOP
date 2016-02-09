package course;

/**
 * Created by Illya on 09.02.2016.
 */
public interface DirectorInterface {
    Manager hireManager(String name, String surname);
    Instructor hireInstructor(String name, String surname);
}
