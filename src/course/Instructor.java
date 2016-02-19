package course;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Illya on 09.02.2016.
 */
public class Instructor extends Employee implements InterfaceInstructor {
    private List<Group> groupList = new ArrayList<>();

    public Instructor(String name, String surname, String id) {
        super(name, surname, id);
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    @Override
    public boolean conductSession(int idGroup) {
        Group group = Utils.groupById(idGroup);
        if (group.getBalanceLessons() > 0) {
            group.setBalanceLessons(group.getBalanceLessons() - 1);
            if (group.getBalanceLessons() == 11) { //lesson from 0 to 11
                for (Student student : group.getStudentList()) {
                    student.setLevel(Utils.setLevel(idGroup));

                }

            }
            return true;
        }

        return false;
    }
}
