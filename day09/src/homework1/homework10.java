package homework1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//10、实现日期对象和字符串之间的相互转换
//    格式化 format     解析 parse
public class homework10 {
    public static void main(String[] args)throws ParseException {
//将日期对象转化为字符串--格式化 format
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S E");
        String s = format.format(date);
        System.out.println(s);
        //
    }
}