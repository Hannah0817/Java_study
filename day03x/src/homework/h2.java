package homework;

//2、数组反转
public class h2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] );
            }
        }
    }}
