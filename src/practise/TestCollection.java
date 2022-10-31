package practise;

import org.junit.Test;

import java.util.*;

public class TestCollection {
@Test
    public void  test1(){
        List list = new ArrayList();
        list.add("天");
        list.add("下");
        list.add("太");
        list.add("平");
        System.out.println("第一次添加完:"+list.toString());
        System.out.println("list的大小是:"+list.size());
        System.out.println("添加一个集和：");
        List list2 = new ArrayList();
        list2.add("风");
        list2.add("调");
        list2.add("雨");
        list2.add("顺");
        System.out.println("判断是否包含一个元素："+list2.contains("雨"));
        list.addAll(list2);
        System.out.println("添加完集和后，list集和大小为"+list.size());
        System.out.println(list.toString());
        String str1 = (String)list.get(list.size()-1);
        System.out.println("集和的最后一个元素为："+str1);

        list.remove(0);
        System.out.println("移除集合中第一个元素后："+list.toString());
        System.out.println("判断是否包含一个集和："+list.containsAll(list2));
        System.out.println("移除一个集和");
        list.removeAll(list2);
        System.out.println(list.toString());

        System.out.println("给第二个位置添加一个元素：三门峡");
        list.add(1,"三门峡");
        System.out.println("添加元素后： "+list.toString());
        System.out.println("将‘三门峡’修改为‘郑州’");
        list.set(1,"郑州");
        System.out.println(list.toString());


        System.out.println(list.hashCode());

}
@Test
    public void  test2(){
        Collection set = new LinkedHashSet();
        set.add("天");
        set.add("下");
        set.add("太");
        set.add("平");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
}
@Test
public void test3(){
        //测试按照姓名降序排序
    Person person1 = new Person("c",12,"1");
    Person person2 = new Person("a",13,"2");
    Person person3 = new Person("d",14,"3");
    TreeSet<Person> treeSet = new TreeSet<>(new Person());
    treeSet.add(person1);
    treeSet.add(person2);
    treeSet.add(person3);
    System.out.println(treeSet.size());
    Iterator iterator = treeSet.iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }

}
@Test
    public  void test4(){
        Map map = new LinkedHashMap();
        map.put("","null");
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");
        Set entrySet = map.keySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            String key = String.valueOf(iterator.next());
            System.out.println("键是："+key+",值是"+map.get(key));
        }

}
@Test
    public void testCollections(){

}
    
}
