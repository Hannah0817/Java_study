public class 选择text {
    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 1, 6, 7, 2};
        selectionOrt(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionOrt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mark = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mark]) {
                    j = mark;
                }
            }
            if (mark != i) {
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
    }
}


