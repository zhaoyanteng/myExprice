package practise;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a="";
        String b = "";
        a= scanner.next();
        System.out.println("还要继续输入吗？0/1");
        boolean flag=false;
        if(1==scanner.nextInt()){
            flag = true;
        }

        System.out.println(flag);
        if(flag){
             b = scanner.next();
        }
        try {
            int [] arry = new int[2];
            arry[0] = Integer.parseInt(a);
            arry[1] = Integer.parseInt(b);
            double re = caucle(arry);
            System.out.println("结果是："+re);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            e.getStackTrace();
        }catch (ArithmeticException e){
            System.out.println("算数运算异常！");
            e.getStackTrace();
        }catch (NumberFormatException e){
            System.out.println("参数转换异常！");
            e.getStackTrace();
        }catch (ecdef e){
            System.out.println("参数不得小于0");
            e.getStackTrace();
        }

    }

   public static double caucle(int arry []) throws  ecdef{

        if(arry[0]<0 || arry[1]<0){
            throw new ecdef();
        }
        double resault  = arry[0]/arry[1];
        return resault;
    }
}

class ecdef extends Exception{
    static final long serialVersionUID = -3387516993124229948L;
    public ecdef(){
        super();
    }
    public ecdef(String msg){
        super(msg);
    }


}