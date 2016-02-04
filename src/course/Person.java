package course;

import java.util.ArrayList;
import java.util.List;

/*
Я тут удалил поле id и все с ним связанное,
прикольная штука getClass().getSimpleName() - не знал
 */
public class Person {
    private String name;
    private String surname;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public final void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[name:").append(getName());
        sb.append(", last name: ").append(getSurname());
        sb.append(", phone: ").append(getPhone());
        sb.append("]");
        return sb.toString();
    }
}
