package Interface;

public class TestCricle {
    public static void main(String[] args) throws Exception {
        CompareCircle CompareCircle = new CompareCircle("3");
        CompareCircle CompareCircle2 = new CompareCircle("2");
        int result = CompareCircle.compareTo("3");
        System.out.println(result);

    }
}
interface  compareObject{
    public abstract  int compareTo(Object o) throws Exception;
}
class  Circle {
    private String r;

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }
}
class CompareCircle extends Circle implements  compareObject {

    public  CompareCircle (){

    }
    public  CompareCircle (String r){
        this.setR(r);
    }
    @Override
    public int compareTo(Object o) throws Exception {
        int flag = 0;
        if(this==o){
            return  0;
        }else if(o instanceof  CompareCircle){
            CompareCircle obj = (CompareCircle) o;
            if (this.getR().compareTo(obj.getR())<0){
                flag = -1;
            }else if(this.getR().compareTo(obj.getR())>0){
                flag = 2;
            }else{
                flag =1;
            }
        }else{
            throw  new Exception("传入的不是CompareCircle对象，不可比较！");
        }

        return flag;
    }


}
