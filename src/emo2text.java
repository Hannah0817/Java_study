//2、定义方法实现，获取数组的一部分，
//  需要的参数是：一个数组，一个开始索引 off，一个长度 len，
//  实现的目标是从该索引off位置获取，一共获取len个元素，组成一个新数组
public class emo2text {
    public static int[] getsubArray(int[] arr, int off, int len) {

        int[] newArr = new int[len];

        int index = 0;
        for (int i = off; i < off + len; i++) {
            newArr[index++] = arr[i];
        }
        return newArr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int off = 1;
        int len = 5;
        int[]newArr = getsubArray(arr, off, len);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
