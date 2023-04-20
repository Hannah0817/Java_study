//冒泡
public class 作业3 {
    public static void main(String[] args) {
        int[]arr= {8,9,5,1,6,7,2};
         maopaosort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void maopaosort(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr [j]>arr[j+1]){
                    int stem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=stem;
                }

            }
        }
    }
}
