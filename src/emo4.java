//4、定义方法实现，数组的反转，要在原数组上完成

public class emo4 {
    public static void main(String[] args) {


        int[]arr= {1,2,3,4,5};

            fanzhuan(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }


            public static void fanzhuan(int[]arr){
                int start = 0;
                int end = arr.length-1;

                while (start<end){
                int temp = arr[start];
                arr [start] = arr[end];
                arr[end] = temp;

                start++;
                end--;

            }
            }
}