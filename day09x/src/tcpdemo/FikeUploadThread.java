package tcpdemo;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class FikeUploadThread extends Thread {
    private Socket socket;
    public FikeUploadThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
       //
        FileOutputStream out = null;
        //
        try {
            InputStream in = socket.getInputStream();
            String name = UUID.randomUUID().toString().replaceAll ( "-","" );
            out = new FileOutputStream("day09x//"+name+".jpg");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer))!= -1) {
                out.write(buffer, 0, len);
            }
            //文件上传完毕，给出反馈
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter ( socket.getOutputStream () ) );
            writer.write ( "文件上传成功" );
            writer.newLine ();
            writer.flush ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }finally {
            if (out!=null) {
                try {
                    out.close ();
                } catch (IOException e) {
                    e.printStackTrace ( );
                }
            }
            {

            }
            }
        }
    }

