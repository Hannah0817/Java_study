package HuiWenShu;

import sun.font.FontRunIterator;

public class shuzu {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44};
        int[] b = {55, 66, 77, 88};

        int[] newarr = new int[a.length + b.length];

        for (int i = 0; i < newarr.length; i++) {
            if (i<a.length) {
                newarr[i] = a[i];
            }else  {
                newarr[i] = b[i - b.length];

            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}



