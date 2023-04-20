package tcpdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C://Users//高新廷//Pictures//IMG_0543(20230327-123613).JPG");
        Socket socket = new Socket( InetAddress.getByName("localhost"),10086);
        OutputStream out = socket.getOutputStream ();

        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read (bytes))!=-1) {
            out.write (bytes,0,len);
            out.flush ();
        }
          socket.shutdownOutput ();
        //
        BufferedReader reader = new BufferedReader (new InputStreamReader (socket.getInputStream ()));
        String result = reader.readLine ();
        System.out.println (result);

        in.close ();
        socket.close ();


    }
}
