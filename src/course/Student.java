package course;


public class Student extends Person {
    private int sessionSum;
    private int valueCash;


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

    public boolean addSession() {
        if (valueCash >= FirmAccount.getSessionCost()) {
            sessionSum = sessionSum++;
            valueCash = valueCash - FirmAccount.getSessionCost();
            return true;
        }
        return false;

    }

    public void setValueCash(int valueCash) {
        this.valueCash = valueCash;
    }
}
