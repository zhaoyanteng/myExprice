package practise;

import org.junit.Test;

public class PayrollSystem {
    @Test
    public  void  test1(){
        Employee emp1 = new SalariedEmployee("张三","01",new MyDate("1995","11","10"),"20000");
        Employee emp2 = new HourEmployee("李四","23",new MyDate("1996","01","11"),120.0,6.0);
        Employee emp3 = new SalariedEmployee("王五","01",new MyDate("1997","11","10"),"20000");
        Employee emp4 = new SalariedEmployee("小红","03",new MyDate("2021","07","03"),"20000");
        Employee [] employees = new Employee[]{emp1,emp2,emp3,emp4};

        for (int i =0;i<employees.length;i++){
            Employee e = employees[i];
            if("20210703".equals(e.getBirthday().toDAteString())){
                System.out.println(e.toString());
            }
        }
    }
}
