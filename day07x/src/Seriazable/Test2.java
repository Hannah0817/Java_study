package Seriazable;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      read();
       // write ();
    }

    private static void read() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day07x\\stu\\111.txt") );
        Object obj = ois.readObject();
        Student s = (Student)obj;
        System.out.println(s.getName () + ","+s.getAge ());
        ois.close();
    }
    //序列化

        private static void write() throws IOException {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("day07x\\stu\\111.txt"));
            oos.writeObject(new Student("张三",18));
            oos.close();
        }
    }
