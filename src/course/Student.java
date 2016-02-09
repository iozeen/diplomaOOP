package course;


public class Student extends Person {
    private int sessionSum;



    private Level level;
//    private int idStudent;
//    private static int idNext = 1;

    //    public Student(){
//        idStudent = idNext++;
//    }
    public Student(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void addSession() {
        sessionSum = sessionSum++;
    }
}
