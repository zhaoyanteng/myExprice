package test;

import org.junit.Test;
import practise.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestReflact {
    @Test
    public void test1(){
        try {
            Class clazz = Class.forName("practise.Person");
            Person person = (Person) clazz.newInstance();
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person,"张三");
            Object object2 =field.get(person);
            System.out.println(object2.toString());
            System.out.println(object2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2(){
        try {
            Class clazz = Class.forName("practise.Person");
            Constructor con = clazz.getConstructor(String.class,Integer.class,String.class);
            Person person =(Person) con.newInstance("小红",1,"25");
            System.out.println(person.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
