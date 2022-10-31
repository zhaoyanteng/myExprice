package practise;

public class WithDrawThread extends Thread{
    private AccountBank accountBank;
    //取款的额度
    private double withDraw;
    public WithDrawThread(){

    }
    public WithDrawThread(AccountBank accountBank,double withDraw){
        this.accountBank=accountBank;
        this.withDraw = withDraw;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+"进来了！");
        while (true){
        synchronized (WithDrawThread.class){
            if(accountBank.getBalance()==0.0){
                System.out.println(Thread.currentThread().getName()+"账户余额为0.0！");
                return;
            }
            else if(withDraw<=accountBank.getBalance()){
                accountBank.setBalance(accountBank.getBalance()-withDraw);
                System.out.println(Thread.currentThread().getName()+"当前账户取款成功，取现的金额为："+withDraw+"剩余："+accountBank.getBalance()+"元");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(withDraw>accountBank.getBalance()){
                System.out.println(Thread.currentThread().getName()+"当前账户取款失败，账户余额不足！当前账户余额为："+accountBank.getBalance());
                return;
            }
            }
        }
    }
}
