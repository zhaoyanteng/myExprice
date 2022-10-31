package test;

import practise.Account;
import practise.Tickt;

public class test {
    public static void main(String[] args) {
       /* Tickt tickt = new Tickt();
        Thread thread1 = new Thread(tickt);
        Thread thread2 = new Thread(tickt);
        Thread thread3 = new Thread(tickt);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();*/
       Account account = new Account();
       Thread thread4 = new Thread(account);
       Thread thread5 = new Thread(account);
       thread4.setName("线程4");
       thread5.setName("线程5");
       thread4.start();
       thread5.start();
    }
}
