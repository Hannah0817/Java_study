public class jidutext {
    public static void main(String[] args) {
        int[][] arr = {{10, 11, 15}, {30, 35, 20}, {9, 8, 10}, {55, 66, 44}};
        int year = 0;
        for (int i = 0; i <arr.length ; i++) {
            int season = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                season+=arr[i][j];
            }
            System.out.println(season);
            year+=season;
        }

        System.out.println(year);
    }
}
