package MergeSort_;

import java.util.Arrays;

public class MergeSort02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        merge ( arr );
        System.out.println( Arrays.toString (arr));
    }
    public  static void merge(int []arr){
        int[] temparr = new int[arr.length];
        merge ( arr,temparr,0,arr.length-1 );
    }
    public static void merge(int []arr,int[]temparr,int start,int end){
        int mid = (start+end)/2;
        merge(arr,temparr,start,mid);
        merge(arr,temparr,mid+1,end);

        int leftPos = start;
        int leftEnd= mid;

        int rightPos =mid+1;
        int rightEnd = end;

        int element = rightPos - leftPos+1;

        int tempIndex =leftPos;
        while(leftPos<=leftEnd && rightPos<=rightEnd){
            if(arr[leftPos]<=arr[rightPos]){
                temparr[leftPos] = arr[leftPos];
                leftPos++;
            }else{
                temparr[rightPos] = arr[rightPos];
                rightPos++;
            }
          while (leftPos<=leftEnd){
              temparr[tempIndex++] = arr[tempIndex++];
          }
          while (rightPos<=rightEnd){
              temparr[tempIndex+1] = arr[tempIndex+1];
          }
        }


    }
}
