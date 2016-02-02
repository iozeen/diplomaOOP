package course;


public class Student extends Person {
    private double sum;
    private int idStudent;
    private static int idNext = 1;

    public Student(){
        idStudent = idNext++;
    }
    public Student( String name, String surname){
        super();
        setName(name);
        setSurname(surname);
    }
    public double getSum() {
        return sum;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public static int getIdNext() {
        return idNext;
    }
}
