package practise;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Person implements   Comparable,Comparator<Person>, Serializable {
    private  String name;
    private int age;
    private String id;
    private static final Long serialVersionUID = 0000000000003L;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){

    }

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Person(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public int compare(Person o1,Person o2) {

        return -(o1.age-o2.age);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
/*
    @Override
    public int compareTo(Object o) {

        if(o == this){
           return  0;
        }
        if(o instanceof  Person){
            Person person = (Person) o;
            if(this.age>person.age){
                return 1;
            }else {
                return  -1;
            }
        }
        return 0;
    }*/
}
