public class maopaotext {
    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 1, 6, 7, 2};
        maopaopsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void maopaopsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

