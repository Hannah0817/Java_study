package homework;

//3、普通查找
public class h3 {
    public static void main(String[] args) {


        int[] arr = {1, 58, 52, 56, 24, 81, 96};
        int key = 81;
        for (int i = 0; i <arr.length ; i++) {
            if (key==arr[i]){
                System.out.println("要查找的元素在"+i);
                break;
            }else {
                System.out.println(-1);
            }
        }

    }
}