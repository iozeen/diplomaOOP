package course;


import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends Person{
    private Long hireDate;
    private int id;

    public Long getHireDate() {
        return hireDate;
    }

    public Employee setHireDate(Long hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.delete(sb.length() - 1, sb.length());
        sb.append(", hire date: ").append(getHireDate());
        sb.append(", id: ").append(getId()).append("]");
        return sb.toString();
    }

    abstract Long earnings();
}
