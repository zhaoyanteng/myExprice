package practise;

public class TestAccountBank {
    public static void main(String[] args) {
       /* AccountBank accountBank = new AccountBank("88885",100000);
        AccountBankRunnable accountBankRunnable = new AccountBankRunnable(accountBank,10000);
        Thread thread1 = new Thread(accountBankRunnable);
        Thread thread2 = new Thread(accountBankRunnable);
        thread1.setName("小红！");
        thread1.start();
       thread2.setName("小明");
        thread2.start();*/
        AccountBank accountBank2 = new AccountBank("88885",100000);
       WithDrawThread withDrawThread1 = new WithDrawThread(accountBank2,10000);
       WithDrawThread withDrawThread2 = new WithDrawThread(accountBank2,10000);
       withDrawThread1.setName("小明");
       withDrawThread2.setName("小红");
       withDrawThread1.start();
       withDrawThread2.start();
    }
}
