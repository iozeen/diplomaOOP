package course;


import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> studentList = new ArrayList<>();
    private Instructor instructor;
    private Level levelGroup;
    private int idNext;
    private int idGroup;
    private int balanceLessons;

    public Group() {
        idGroup = idNext++;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public Level getLevelGroup() {
        return levelGroup;
    }

    public void setLevelGroup(String levelGroup) {
        this.levelGroup = Level.valueOf(levelGroup);
    }

    public int getBalanceLessons() {
        return balanceLessons;
    }

    public void setBalanceLessons(int balanceLessons) {
        this.balanceLessons = balanceLessons;

    }

    //    public boolean addStudent(Student student) {
//        if (true) { // realizovat' provarky na nalichie yge etogo studenta
//            studentList.add(student);
//            return true;
//        }
//        return false;
//    }
    public List<Student> getStudentList() {
        return studentList;
    }


}
