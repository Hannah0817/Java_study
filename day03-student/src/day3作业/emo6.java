package day3作业;
//6. 一张纸的厚度为0.2毫米，世界上最高的山峰珠穆朗玛峰的高度为8848米，在理论情况下，请问这张纸折叠多少次可以超过珠峰的高度？
public class emo6 {
    public static void main(String[] args) {
        int zf = 8848000;
       double zhi = 0.1;
       int count = 0;

        while (zhi<=zf){
           zhi= zhi*2;
           count++;
        }
        System.out.println(count);
    }
}
