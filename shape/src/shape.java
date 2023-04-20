import java.util.Arrays;
public class shape {
    // 希尔排序
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int a[]) {
         int d = a.length;//gap的值
        while (true) {
            d = d / 2;//每次都将gap的值减半
            for (int x = 0; x < d; x++) {//对于gap所分的每一个组
                for (int i = x + d; i < a.length; i = i + d) {      //进行插入排序
                    int temp = a[i];
                    int j;
                    for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1) {//gap==1，跳出循环
                break;
            }
        }
    }
}
