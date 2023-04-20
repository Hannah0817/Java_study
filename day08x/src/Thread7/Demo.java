package Thread7;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //用阻塞队列实现等待唤醒机制
        ArrayBlockingQueue<String>queue = new ArrayBlockingQueue<> ( 3 );
        //一条线程不断的存
        new Thread(()->{
            while (true){
                try {
                    queue.put ( "汉堡包" );
                    System.out.println ( Thread.currentThread ( ) );
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }).start ();

//一条线程不断的取
        new Thread(()->{
            while (true){
                try {
                    String s = queue.take ( );
                    System.out.println (Thread.currentThread ( ) );
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }).start ();

       /* private void
        queue.put ( "hello" );
        queue.put ( "world" );
        queue.put ( "java" );
        
        */


    }
}
