package practise;

public class AccountBankRunnable implements  Runnable {
    private AccountBank accountBank;
    private  int money;
    //取款的额度
    private double withDraw;
    public AccountBankRunnable (){

    }
    public AccountBankRunnable(AccountBank accountBank,double withDraw){
       this.accountBank = accountBank;
       this.withDraw = withDraw;
    }
    public AccountBankRunnable(int money,double withDraw){
        this.money = money;
        this.withDraw = withDraw;
    }
    @Override
    public void run() {
        {
            System.out.println(Thread.currentThread().getName()+"进来了！");
            while (true){
           synchronized (this){

                notify();
                if(accountBank.getBalance()==0.0){
                    System.out.println(Thread.currentThread().getName()+"账户余额为0.0！");
                    return;
                }
                else if(withDraw<=accountBank.getBalance()){
                    accountBank.setBalance(accountBank.getBalance()-10000);
                    System.out.println(Thread.currentThread().getName()+"当前账户取款成功，取现的金额为："+withDraw+"剩余金额为："+accountBank.getBalance()+"元");
                   /* try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
                else if(withDraw>accountBank.getBalance()){
                    System.out.println(Thread.currentThread().getName()+"当前账户取款失败，账户余额不足！当前账户余额为："+accountBank.getBalance());
                    return;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               }
            }
        }
    }
}
