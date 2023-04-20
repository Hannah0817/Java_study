package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//8、完成Date对象和字符串的互换
    //    SimpleDateFormat
public class emo8 {
        public static void main(String[] args) throws ParseException {
            Date date = new Date();
            System.out.println(date);
            //格式化成字符串
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String str = sdf.format(date);
            System.out.println(str);


            //字符串解析成日期对象
            String str2 = "1999-09-09 11:11:11";
            // SimpleDateFormat 格式必须按照字符串的格式进行编写
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date2 = sdf2.parse(str2);
            System.out.println(date2);
        }
}
