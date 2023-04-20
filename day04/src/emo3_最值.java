public class emo3_最值 {
    public static void main(String[] args) {
        int[]arr={21,54,69,82,61};
        int max=21;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
