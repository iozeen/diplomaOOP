package course;


public abstract class Person {
    private String name;
    private String surname;
    private int idCode;
    private String phone;

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public final void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
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
        sb.append("idCode=").append(getIdCode());
        sb.append(", ").append(getClass().getSimpleName());
        sb.append(", ").append(getName());
        sb.append(" ").append(getSurname());
        return sb.toString();
    }
}
