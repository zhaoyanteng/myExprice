package practise;

public class example {
    public static void main(String[] args) {
        TheOne one = new TheOne();
        Thread thread1 = new Thread(one);
        thread1.setName("线程一");
        Thread thread2 = new Thread(one);
        thread2.setName("线程二");
        thread1.start();
        thread2.start();
    }

}
class TheOne implements  Runnable{
    //定义一个变量，用来存放输出变量
    private static int num =0;
    @Override
    public void run() {
        synchronized (this){
            while (num<=100){
               this.notify();
                System.out.println(num+Thread.currentThread().getName());
                num++;
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
