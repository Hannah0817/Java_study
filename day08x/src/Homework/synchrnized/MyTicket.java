package Homework.synchrnized;

public class MyTicket implements Runnable{
    //用成员变量表示票
    private int ticket=100;
    @Override
    public void run() {
        //卖票
        while (true){
            //如果票卖完了
            synchronized (this){
                if (ticket<=0){
                    break;
                }
                ///卖出一张
                //模拟出票时间
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace ( );
                }
                System.out.println (Thread.currentThread ().getName () +"正在出售第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
