package homework;

//二分查找
public class h4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20, 21};
        int start = 0;
        int end = arr.length - 1;
        int key = 18;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else if (key == arr[mid]) {
                System.out.println("要找的数在" + mid + "索引");
                break;
            }
        }
        if (start>end){
            System.out.println("不存在" );
        }
    }
}



