//2、定义方法实现，获取数组的一部分，
//  需要的参数是：一个数组，一个开始索引 off，一个长度 len，
//  实现的目标是从该索引off位置获取，一共获取len个元素，组成一个新数组
public class emo2 {
    public static int[] getSubArray(int[] arr, int off, int len) {
        // 定义新数组
        int[] newArr = new int[len];

        int index = 0; // 表示放入新数组的位置

        // 从off索引遍历原数组
        for (int i = off; i < off + len; i++) {
            // 放入新数组，要从0索引位置开始放
            newArr[index++] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int off=1;
        int len =5;
        int[]newArr=getSubArray(arr,off,len);
        for (int i = 0; i <newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
    }
}
