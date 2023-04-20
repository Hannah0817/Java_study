public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 1, 6, 7, 2};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mark = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mark]) {
                    mark = j;
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
