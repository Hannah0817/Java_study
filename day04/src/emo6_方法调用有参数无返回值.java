public class emo6_方法调用有参数无返回值 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4};
                prinArray(arr);
                prinArray(arr);
                prinArray(arr);

    }
        public static void prinArray(int[]arr){
            System.out.print("[");

            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]);

                if (i!=arr.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
}
