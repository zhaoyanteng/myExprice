package practise;

public  class  TestThread{
    public static void main(String[] args) throws InterruptedException {
        Clerk clerk = new Clerk();
        Producter producter = new Producter(clerk);
        Customer customer = new Customer(clerk);
       Thread thread1 = new Thread(producter);
       thread1.setName("生产者");

       Thread thread2 = new Thread(customer);
       thread2.setName("消费者");
       thread1.start();
       thread2.start();
    }
}
 class TestThread2 implements  Runnable{

private  static double account;
    @Override
    public  void run() {
        System.out.println("进入Run方法！");
        try {
            while (account<=1500){
                account +=500;
                System.out.println("当前线程名："+Thread.currentThread()+"账户："+account);
                Thread.currentThread().sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class Bank implements Runnable{
    private static double account;
    @Override
    public synchronized void run() {

      for (int i=0;i<3;i++){
          notify();
          account+=1000;
          System.out.println("当前线程："+Thread.currentThread().getName()+"账户余额为："+account);
          try {
              this.wait();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}

class Printer implements Runnable{
    private  static  int result = 1;
    @Override
    public synchronized void run() {
       do{
           this.notify();
           System.out.println("当前线程是："+Thread.currentThread().getName()+"正在打印："+result);
           result++;
           try {
               this.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }while (result<=100);
    }
}
//雇员
class Clerk {
    //产品
    private  int prdoct = 0;
    //生产者生产
    public synchronized  void addProduct(){
        if(prdoct>=20){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            notifyAll();
            prdoct++;
            System.out.println("生产者开始生产结束第"+prdoct+"个产品");
        }

    }
    //消费者消费
    public synchronized void consume(){
        if (prdoct<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            notifyAll();
            System.out.println("消费者开始消费结束第"+(prdoct--)+"个产品结束");
        }

    }


}

class Producter implements  Runnable{
   private  Clerk  clerk =null;
   public Producter(Clerk clerk){
     this.clerk = clerk;

   };

    @Override
    public void run() {
        while (true){
                clerk.addProduct();
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

}

class Customer implements Runnable{
    private  Clerk clerk =null;
    public Customer(Clerk clerk){
       this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
                clerk.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
