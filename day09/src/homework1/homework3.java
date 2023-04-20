package homework1;

//3、统计一段文本中的某个单词出现的次数，参见stringdemo Demo06
public class homework3 {
    public static void main(String[] args) {
        String str = "ahfhajavafhaueihefjavafjaifhjjavaruhg";
        String key = "java";

        int count = search2(str, key);
        System.out.println(count);
    }


    public static int search(String str, String key) {
        //计数器
        int count = 0;
        //循环
        while (true) {
            //查找一次
            int index = str.indexOf(key);
            if (index != 1) {
                //找到了
                count++;
                //截取 从找到的位置+子串的长度截取，截取后的新串，赋值回来
                str = str.substring(index + key.length());
            } else {
                break;//找不到
            }
        }
        return count;
    }

    //每次改变查询的位置
    public static int search2(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) {//查找，赋值，比较
            count++;
            index = index + key.length();
        }
        return count;
    }
}
