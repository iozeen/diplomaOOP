package course;


import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> studentList = new ArrayList<>();
    private Instructor instructor;
    private Level levelGroup;



    public Group() {


    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Level getLevelGroup() {
        return levelGroup;
    }

    public void setLevelGroup(Level levelGroup) {
        this.levelGroup = levelGroup;
    }

    public boolean addStudent(Student student) {
        if (true) { // realizovat' provarky na nalichie yge etogo studenta
            studentList.add(student);
            return true;
        }
        return false;
    }
    public List<Student> getStudentList() {
        return studentList;
    }


}
