package practise;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private String name;
    private String number;
    private  MyDate birthday;
    private static final Long serialVersionUID = 000000000001L;
    public Employee (){

    }

    public Employee(String name, String number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthday=" + birthday.toDAteString() +
                '}';
    }

    public  abstract  String eamings();
}
