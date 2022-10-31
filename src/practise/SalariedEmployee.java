package practise;

public class SalariedEmployee extends Employee {
    private  String monthSalary;

    public  SalariedEmployee (){

    }

    public SalariedEmployee(String name,String number,MyDate birthday,String monthSalary) {
        super(name,number,birthday);
        this.monthSalary = monthSalary;
    }

    public String getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(String monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public String eamings() {
        return  this.monthSalary;
    }

    @Override
    public String toString() {
        return " " +super.toString()+
                "monthSalary='" + monthSalary + '\'' +
                '}';
    }
}
