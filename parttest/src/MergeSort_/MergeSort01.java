package MergeSort_;

import java.util.Arrays;

public class MergeSort01 {
    public static void main(String[] args) {
        //MergeSort
        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[]arr){
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);


    }
    public static void mergeSort(int[] arr, int[]tempArr , int start,int end) {
      if (start<end){
          int mid = (start + end) / 2;
          mergeSort(arr, tempArr, start, mid);
          mergeSort(arr, tempArr, mid + 1, end);

          int leftPos = start;
          int leftEnd = mid ;

          int ringhtPos = mid+1;
          int rightEnd= end;

          int elementNum = rightEnd - leftEnd +1;


          int tempIndex =leftPos;
          while (leftPos <= leftEnd && ringhtPos <= rightEnd){
              if (arr[leftPos] <= arr[ringhtPos]){
                  tempArr[tempIndex++] = arr[leftPos++];
              }else {
                  tempArr[tempIndex++] = arr[ringhtPos++];
              }
          }
          while (leftPos <= leftEnd){
              tempArr[tempIndex++] = arr[leftPos++];
          }
          while (ringhtPos <= rightEnd){
              tempArr[tempIndex++] = arr[ringhtPos++];
          }
          for (int i = 0; i < elementNum; i++,rightEnd--) {
              arr[rightEnd]=tempArr[rightEnd];

          }
      }
    }
}
