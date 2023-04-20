package Thread2;

public class TicketWindow {
        public static void main(String[] args) {

            MyTicket window = new MyTicket();
            // 开启两条线程
            new Thread(window, "窗口一").start();
            new Thread(window, "窗口二").start();

        }
    }

