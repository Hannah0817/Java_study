package homework;

import static jdk.nashorn.internal.objects.NativeString.search;

//4、String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
//    查找并截取
//    改变查询范围 不截取
public class emo4 {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajava";
        String target = "java";
        int count = search(str, target);
        System.out.println(count);
    }

    public static int search(String str, String target) {

        int count = 0;
        int index = 0;
        while ((index = str.indexOf(target)) != -1) {
            count++;
            str = str.substring(index + target.length());
        }
        return count;
    }
}
