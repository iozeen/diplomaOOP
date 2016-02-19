package course;

import java.util.ArrayList;
import java.util.List;


public abstract class Person {
    private String name;
    private String surname;
    private String id;

    public Person() {
    }

    public Person(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[name:").append(getName());
        sb.append(", last name: ").append(getSurname());
        sb.append(", id: ").append(getId());
        sb.append("]");
        return sb.toString();
    }

}
