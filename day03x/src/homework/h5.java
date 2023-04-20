package homework;
//5、二维数组遍历，求年度营业额
public class h5 {
    public static void main(String[] args) {
        int [][]arr={{10,58,62,},{45,23,78},{78,45,12,},{12,35,89}};
        int year =0;
        for (int i = 0; i <arr.length ; i++) {
            int season = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                season=arr[i][j]++;
            }
            System.out.println("第"+(i+1)+"个嫉妒营收额为"+season);
            year+=season;
        }
        System.out.println("年营收额为"+year);
    }

}
