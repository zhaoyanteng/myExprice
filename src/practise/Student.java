package practise;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collector;

public class Student implements Comparator {
    private  int age;
    private String name;
    private  String id;
    public Student(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(int age, String name, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof  Student && o2 instanceof  Student) {
            Student student1 = (Student) o1;
            Student student2 = (Student) o2;
            if(student1.getAge()>student2.getAge()){
                return 1;
            }else if(student1.getAge()<student2.getAge()){
                return  -1;
            }
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

}
