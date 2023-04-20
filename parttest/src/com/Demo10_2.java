package com;

public class Demo10_2 {
    public static class Ticketwindow implements Runnable {
        private static int ticket = 100;

        @Override
        public void run() {
            while (true) {
                synchronized (this) {
                    if (ticket <= 0) {
                        break;
                    }
                        try {
                            Thread.sleep ( 10 );
                        } catch (InterruptedException e) {
                            e.printStackTrace ( );
                        }
                        System.out.println ( Thread.currentThread ( ).getName ( ) + "  票号为：" + ticket-- );
                        if ( ticket<=0){
                            break;
                        }
                    }
                }
            }
        }
    }

