package course;

import java.util.List;

/**
 * Created by Illya on 09.02.2016.
 */
public class Instructor extends Employee implements Teacherable {
    private List<Group> groups;
    @Override
    long earnings() {
        return 0;
    }

    @Override
    public void conductSession(Group group) {
        for (Student student : group.getStudentList()) {
            student.addSession();
        }
    }
}
