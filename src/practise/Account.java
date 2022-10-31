package practise;

public class Account implements  Runnable{
    private static int i =0;
    private  static int accountBlance =0;
    public static void add(int blance){
        accountBlance+=blance;

    }

    @Override
    public  void   run() {

        do{
            synchronized (this){
                i++;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            add(1);
            System.out.println("当前线程是："+Thread.currentThread().getName()+"当前accountBlance是："+accountBlance+"第"+i+"次");
        }while (i<=10);
    }
}
