package tcpdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        //socket对象
        ServerSocket serverSocket= new ServerSocket(10086);


        //
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                9,
                10,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<> (),
                new ThreadPoolExecutor.AbortPolicy ()
        );
            while (true) {
                Socket socket = serverSocket.accept();
                pool.submit (new FikeUploadThread (socket));
            }

    }
}
