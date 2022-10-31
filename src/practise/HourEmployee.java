package practise;

public class HourEmployee extends Employee {
    private  double wage;
    private  double hour;

    public  HourEmployee (){

    }

    public HourEmployee(String name,String age,MyDate birthday,double wage,double hour){
        super(name,age,birthday);
        this.hour = hour;
        this.wage = wage;
    }
    @Override
    public String eamings() {

        return "工资为："+wage*hour;
    }

    @Override
    public String toString() {
        return "" +super.toString()+
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
