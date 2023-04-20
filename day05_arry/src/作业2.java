//2、二分查找
public class 作业2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 15, 18, 19, 21, 26};
        int key = 21;
        int index = binarrsearch(arr,key);
        System.out.println(index);
    }
    public static int binarrsearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = (start+end)/2;
            if (key<arr[mid]){
                end=mid-1;
            }else if (key>arr[mid]){
            start=mid+1;
            }else {
                return mid;
            }
        }
            return -1;
    }
}
