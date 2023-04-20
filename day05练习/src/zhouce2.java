import java.util.Random;

public class zhouce2 {
    //现有如下两个数组，元素如下：
    //  数组a：{11, 33, 55, 77}
    //  数组b：{22, 44, 66, 88}
    //  请编写程序，将两个数组合并为一个数组c；要求包含a、b数组的所有元素即可，无需排序。
    //  即结果为：{11, 33, 55, 77, 22, 44, 66, 88}
    public static void main(String[] args) {
        int[] arr1 = new int[]{11, 33, 55, 77};
        int[] arr2 = new int[]{22, 44, 66, 88};
        int[] arr3 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = 4; j < arr2.length+4; j++) {
            arr3[j]=arr2[j-4];
        }
        for (int z = 0; z < arr3.length; z++) {
            System.out.print(arr3[z]+" ");
        }
    }
}

