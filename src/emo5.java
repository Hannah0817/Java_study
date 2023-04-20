/*5、现获取到如下数组,{1, 2, 0, 3, 4, 0, 0, 5};
        现在需要将其中的数据0，都放到数组的最后面，得到如下的结果：
        {1, 2, 3, 4, 5, 0, 0, 0}
        请编写程序，实现上述效果。不要改变元素的相对位置，无需排序

 */

public class emo5 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0,3,4,0,0,5};
        int count = 0;
        int index = 0;
        int[] Newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                Newarr[index++] = arr[i];
            }else{
                count++;
            }
        }
        while (count>0){
            Newarr[index++] = 0;
            count--;
        }
        System.out.println("新数组为:");
        for (int i = 0; i < Newarr.length; i++) {
            System.out.print(Newarr[i]+" ");
        }

    }

}