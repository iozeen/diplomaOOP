package course;


import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends Person {


    public Employee() {
    }

    public Employee(String name, String surname, String id) {
        super(name, surname, id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.delete(sb.length() - 1, sb.length());
        sb.append(", id: ").append(getId()).append("]");
        return sb.toString();
    }

}
