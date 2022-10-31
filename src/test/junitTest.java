package test;


import Interface.TestInterfaceFactory;
import org.junit.Test;
import practise.*;

import java.util.*;

public class junitTest {
    @Test
    public  void  test(){
        TestInterfaceFactory testInterfaceFactory = new TestInterfaceFactory();

    }
    @Test
    public  void  test2(){

    }
    @Test
    public  void  test3(){
        try {
            TestException.two();
        }catch (Exception e){
            e.getMessage();
            System.out.println("有问题");
            return ;
        }finally {
            System.out.println("进入finally");
            ;
        }

    }

    @Test
    public  void test5(){
        // 创建一个动态数组
        ArrayList<String> sites = new ArrayList<>();

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");

        System.out.println("ArrayList 1: " + sites);

        // 创建另一个动态数组
        ArrayList<String> sites2 = new ArrayList<>();

        // 往动态数组中添加元素
        sites2.add("Wiki");
        sites2.add("Runoob");
        sites2.add("Google");
        System.out.println("ArrayList 2: " + sites2);
        boolean isRetain = sites.retainAll(sites2);
        System.out.println(isRetain);
        Iterator iterator = sites.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 保留元素
        sites.retainAll(sites2);
        System.out.println("保留的元素: " + sites);
    }

    @Test
    public void test6(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("东");
        list.add("西");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("南");
        list2.add("北");
        System.out.println("list的size是："+list.size());
        list.addAll(list2);
        System.out.println("调用addAll()方法后，list的size为："+list.size());
        list.remove("东");
        System.out.println("移除东之后，list的size为："+list.size());
        list.add(0,"东");
        System.out.println("调用add(index,element)后"+list.toString());
        System.out.println("list是否包含:东？"+list.contains("东"));
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("天");
        list3.add("下");
        list3.add(2,"太");
        list3.add(3,"平");
        list.addAll(list3);
        System.out.println("放入list3后："+list.toString());
        list.retainAll(list3);
        System.out.println("移除list3后："+list.toString());
        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("北");
        list4.add("方");
        list4.add("很");
        list4.add("冷");
        list4.add("平");
        list.retainAll(list4);
        System.out.println("调用retainAll方法后："+list.toString());
        list.set(0,"马家店");
        System.out.println("调用list.set()方法："+list.toString());
    }

    @Test
    public  void test7(){
        //SET里面其实还是按照map里的keySet的形式存储数据
        HashSet<Person> set = new HashSet<Person>();
        Person p1 = new Person("张三",25,"000");
        Person p2 = new Person("李四",25,"000");
        Person p3 = new Person("王五",25,"000");
        Person p4 = new Person("张三",25,"000");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
 }

 @Test
 public  void test8(){
     Person p1 = new Person("张三",27,"000");
     Person p2 = new Person("李四",25,"000");
     Person p3 = new Person("王五",28,"000");
     Person p4 = new Person("小红",23,"000");

     TreeSet personTreeSet = new TreeSet();
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);
        System.out.println(personTreeSet.size());
        Iterator iterator = personTreeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
 }

 @Test
    public  void  test9(){
     Student s1 = new Student(12,"小红","01");
     Student s2 = new Student(9,"小白","01");
     Student s3 = new Student(15,"小黑","01");

     TreeSet<Student> treeSet = new TreeSet<Student>(new Student());
     treeSet.add(s1);
     treeSet.add(s2);
     treeSet.add(s3);
     Iterator iterator = treeSet.iterator();
     while (iterator.hasNext()){
         System.out.println(iterator.next());
     }
 }

 @Test
    public void  test10(){
    TestThread TestThread1 = new TestThread();
    TestThread TestThread2 = new TestThread();
   /* Thread thread = new Thread(TestThread1);
    Thread thread1 = new Thread(TestThread2);
    thread.start();
    thread1.start();*/

 }
 @Test
    public void test11(){

        String str = "   天下太平   ";
        int start =0;
        int end =0;
        char [] c = str.toCharArray();
        System.out.println(c.length);
        for(int i=0;i<c.length;i++){
            if(c[i]!=' '){
                start = i;
                break;
            }
        }
        for(int e=c.length-1;e>=0;e--){
            if(c[e]!=' '){
                end = e;
                break;
            }
        }
        String restr = new String();
        for (int s =start;s<=end;s++){
            restr+=c[s];
        }

        System.out.println(restr);
        System.out.println(restr.length());

 }

 @Test
    public void  test12 (){
        String str = "abcdefghijkl";
        int s = 2;
        int e =5;
        String ostr = str.substring(1,5);
        System.out.println(ostr);
        char [] c = ostr.toCharArray();
        String middle ="";
        for (int i=c.length-1;i>=0;i--){
            middle+=c[i];
        }
        String start = str.substring(0,1);
        String end = str.substring(5);
        System.out.println(start+middle+end);
 }

 @Test
    public  void  testDoubletoFloat(){
        float f = (float) 0.0027;
        System.out.println(f);


 }

}
