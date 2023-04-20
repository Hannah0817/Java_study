public class emo_5index {
    public static void main(String[] args) {
        int []arr= {1,2,3,5,6,7};
        int key=7;
        int index= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                index=i;
            }
        }
        System.out.println(index);
    }
}
