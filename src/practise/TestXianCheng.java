package practise;

import org.junit.Test;

public class TestXianCheng {
    /**
     * 输出100以内奇数或偶数
     */
    @Test
    public void test1(){

    }

    /**
     * 实现runnable接口火车票买票
     */
    @Test
    public void test2(){
        System.out.println("进入。。。");
        Tickt tickt = new Tickt();
        Thread thread1 = new Thread(tickt);
        Thread thread2 = new Thread(tickt);
        Thread thread3 = new Thread(tickt);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    //模拟银行取钱
    @Test
    public void test3(){
        AccountBank accountBank = new AccountBank("88888",10000);
        WithDrawThread withDrawThread1 = new WithDrawThread(accountBank,1000);
        WithDrawThread withDrawThread2 = new WithDrawThread(accountBank,1000);
        withDrawThread1.setName("线程小红！");
        withDrawThread1.start();
        withDrawThread2.setName("线程小明！");
        withDrawThread2.start();
    }
    @Test
    public void test4(){
        AccountBank accountBank = new AccountBank("88885",100000);
        AccountBankRunnable accountBankRunnable = new AccountBankRunnable(accountBank,10000);
        Thread thread1 = new Thread(accountBankRunnable);
        /*Thread thread2 = new Thread(accountBankRunnable);*/
        thread1.setName("小红！");
        thread1.start();
       /* thread2.setName("小明");
        thread2.start();*/

    }

    @Test
    public void test5(){
        /*AccountBank accountBank = new AccountBank("88885",100000);*/
        AccountBankRunnable accountBankRunnable = new AccountBankRunnable(1000,10000);
        Thread thread1 = new Thread(accountBankRunnable);
        /*Thread thread2 = new Thread(accountBankRunnable);*/
        thread1.setName("小红！");
        thread1.start();
       /* thread2.setName("小明");
        thread2.start();*/

    }
    @Test
    public void test6(){
        Money money = new Money();
        Thread thread1 = new Thread(money);
        thread1.setName("张三");
        Thread thread2 = new Thread(money);
        thread2.setName("李四");
        thread1.start();
        thread2.start();
    }

    @Test
    public void test7(){
        System.out.println("打印。。。。。");
    }
}
/**
 * 互锁
 */
class EachOther{
    public static StringBuffer sb1 = new StringBuffer();
    public static StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                synchronized (sb1){
                    sb2.append("白日依山尽");
                    System.out.println("进入sb1锁");
                    System.out.println(sb2.toString());
                }
                synchronized (sb2){
                    sb2.append("黄河入海流");
                    System.out.println("进入s2锁");
                    System.out.println(sb1.toString());
                }
            }
        }.start();

        new Thread(){
            public void run(){
                synchronized (sb2){
                    sb1.append("欲穷千里目");
                    System.out.println(sb1.toString());
                }

                synchronized (sb1){
                    sb1.append("更上一层楼");
                    System.out.println(sb1.toString());
                }
            }
        }.start();
    }


}

