package practise;

public class Tickt implements Runnable {
    private int tickts = 100;
    @Override
    public synchronized void  run() {
        System.out.println("进入Run方法。。");

            while (true) {
                if (tickts > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("正在出售第" + (tickts--) + "张票！" + "当前线程为：" + Thread.currentThread().getName());


                } else {
                    System.out.println("票已经售完！");
                    break;
                }
            }

    }
}
