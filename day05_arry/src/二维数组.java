public class 二维数组 {
    public static void main(String[] args) {
        int[][]arr={{4,5,6},{7,8,9},{10,11,12},{1,2,3}};
        int year=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"个季度销售额为：");
            int season= 0 ;
            for (int j = 0; j < arr[i].length; j++) {
                season+=arr[i][j];

        }
            System.out.println(season);
            year+=season;

    }
        System.out.println(year);
}
}
