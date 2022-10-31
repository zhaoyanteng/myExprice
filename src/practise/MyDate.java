package practise;

import java.io.Serializable;

public class MyDate implements Serializable {
    private String year;
    private  String month;
    private String day;
private static final Long serialVersionUID = 0000000000000002L;
    public  MyDate (){

    }

    public MyDate(String year, String month, String day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public  String toDAteString(){
        return  this.year+this.month+this.day;
    }
}
