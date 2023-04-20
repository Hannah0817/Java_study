package homework;
//String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
    /*
        查找并截取
        hellojavaworldjavabigdatajavajava
        worldjavabigdatajavajava
        bigdatajavajava
        java
        ""
        方式2：改变查询的位置而不截取字符串
     */
public class emo4_2 {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajava";
        String substr = "java";
        int count = 0;
        int index = 0;
        while (true) {
            int i = str.indexOf("java", index);
            if (i != -1) {
                index = i + 4;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

}