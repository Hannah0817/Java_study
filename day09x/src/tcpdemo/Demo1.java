package tcpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String date = "i am 小高 ，飞飞 我来了";
        byte[] bytes = date.getBytes();
        InetAddress address =InetAddress.getByName ( "192.168.62.180" );
        int port = 8888;
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,port);
        socket.send ( packet );
        socket.close();
    }
}
