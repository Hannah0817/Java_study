package com;

public class Demo10_2test {
    public static void main(String[] args) {
        Demo10_2.Ticketwindow window = new Demo10_2.Ticketwindow ( );
        Runnable r = window;
        Thread a = new Thread ( "xiai" );
        a.start ( );



       /* new Thread ( window,"窗口一" ).start ();
        new Thread ( window,"窗口二" ).start ();*/
    }
}
