package homework;
//6、定义方法实现，获取数组的一部分，
//（需要的参数是：一个数组，一个开始索引 fromIndex，一个长度 len，
// 实现的目标是从该索引fromIndex位置获取，一共获取len个元素，组成一个新数组）
public class h6 {
    public static void main(String[] args) {
            //数组的截取 截取的是12 6 43 2
            //         0  1  2  3  4  5 6 7
            //截取的索引号是2-6：要前不要后
            int[] arr={23,45,12,6,43,2,4,89};
            //定义截取范围
        int start = 2;
        int end = 6;
        //定义新新数组 进行接收 截取片段 0 1 2 3
        int []newArr=new int [end-start];
        //将截取片段 添加到新数组中0-3
        //start+i 从2-5
        for (int i = 0; i <newArr.length ; i++) {
            newArr[i]=arr[start+i];
        }
        //打印新数组的值
        for (int j = 0; j <newArr.length; j++) {
            System.out.println(newArr[j]);

        }
        }
    }

