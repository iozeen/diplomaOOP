package course;


public class Student extends Person {
    private int balance;
    private Level level;

    public Student(String name, String surname, String phone) {
        super(name, surname, phone);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int addBalance) {
        this.balance = this.balance + addBalance;
    }

    public Level getLevel() {
        return level;
    }

    public Student setLevel(Level level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name:").append(getName());
        sb.append(", last name: ").append(getSurname());
        sb.append(", id: ").append(getId());
        sb.append(", balance=").append(balance);
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }

}
