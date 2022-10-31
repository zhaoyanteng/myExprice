package practise;

public class Money implements  Runnable {
    private  static  int monye = 100000;
    @Override
    public void run() {
        synchronized (this){
            while (true){
                System.out.println("当前剩余"+(monye--));
            }

        }
    }
}
