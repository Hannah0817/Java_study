package tcpdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        int port = 12345;
        DatagramSocket socket = new DatagramSocket ( port );

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket ( bytes, bytes.length );

        while (true) {
            socket.receive ( packet );
            int len = packet.getLength ( );
            String s = new String ( bytes, 0, len );
            String ip = packet.getAddress ( ).getHostAddress ( );
            System.out.println ( ip + ":" + s );
        }
    }
}
