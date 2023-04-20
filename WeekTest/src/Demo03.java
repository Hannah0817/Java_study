import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //请通过键盘录入一段纯英文文本（无需校验数据的正确性，按要求录入即可），统计其中每个英文字符出现的次数，打印结果如下：要求按照字母的自然顺序输出。
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "请输入纯英文文本：" );//键盘输入
        String text = scanner.nextLine ( );//接收键盘录入
        int[] count = new int[26];//转化为数组
        int a = 0;//因为不太会，采用最笨的方法
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int ii = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < text.length ( ); i++) {//每个字母挨个加

            if (text.charAt ( i ) == 'a' || text.charAt ( i ) == 'A') {
                a++;
            }
            if (text.charAt ( i ) == 'b' || text.charAt ( i ) == 'B') {
                b++;
            }
            if (text.charAt ( i ) == 'c' || text.charAt ( i ) == 'C') {
                c++;
            } if (text.charAt ( i ) == 'd' || text.charAt ( i ) == 'D') {
                d++;
            } if (text.charAt ( i ) == 'e' || text.charAt ( i ) == 'E') {
                e++;
            } if (text.charAt ( i ) == 'f' || text.charAt ( i ) == 'F') {
                f++;
            } if (text.charAt ( i ) == 'g' || text.charAt ( i ) == 'G') {
                g++;
            } if (text.charAt ( i ) == 'h' || text.charAt ( i ) == 'h') {
                h++;
            } if (text.charAt ( i ) == 'i' || text.charAt ( i ) == 'i') {
                ii++;
            } if (text.charAt ( i ) == 'j' || text.charAt ( i ) == 'J') {
                j++;
            } if (text.charAt ( i ) == 'k' || text.charAt ( i ) == 'K') {
                j++;
            } if (text.charAt ( i ) == 'l' || text.charAt ( i ) == 'L') {
                l++;
            } if (text.charAt ( i ) == 'm' || text.charAt ( i ) == 'M') {
                m++;
            } if (text.charAt ( i ) == 'n' || text.charAt ( i ) == 'N') {
                n++;
            } if (text.charAt ( i ) == 'o' || text.charAt ( i ) == 'O') {
                o++;
            } if (text.charAt ( i ) == 'p' || text.charAt ( i ) == 'P') {
                p++;
            } if (text.charAt ( i ) == 'q' || text.charAt ( i ) == 'Q') {
                q++;
            } if (text.charAt ( i ) == 'r' || text.charAt ( i ) == 'R') {
                r++;
            } if (text.charAt ( i ) == 's' || text.charAt ( i ) == 'S') {
                s++;
            } if (text.charAt ( i ) == 't' || text.charAt ( i ) == 'T') {
                t++;
            } if (text.charAt ( i ) == 'u' || text.charAt ( i ) == 'U') {
                u++;
            } if (text.charAt ( i ) == 'v' || text.charAt ( i ) == 'V') {
                v++;
            } if (text.charAt ( i ) == 'w' || text.charAt ( i ) == 'W') {
                w++;
            } if (text.charAt ( i ) == 'x' || text.charAt ( i ) == 'X') {
                x++;
            } if (text.charAt ( i ) == 'y' || text.charAt ( i ) == 'Y') {
                y++;
            } if (text.charAt ( i ) == 'z' || text.charAt ( i ) == 'Z') {
                z++;
            }

        }

        System.out.println ( "b=" + b );
        System.out.println ( "c=" + c );
        System.out.println ( "d=" + d);
        System.out.println ( "e=" + e );
        System.out.println ( "f=" + f);
        System.out.println ( "g=" + g );
        System.out.println ( "h=" + h );
        System.out.println ( "i=" + ii );
        System.out.println ( "j=" + j );
        System.out.println ( "k=" + k );
        System.out.println ( "l=" + l );
        System.out.println ( "m=" + m );
        System.out.println ( "n=" + n );
        System.out.println ( "o=" + o );
        System.out.println ( "p=" + p );
        System.out.println ( "q=" + q );
        System.out.println ( "r=" + r );
        System.out.println ( "s=" + s );
        System.out.println ( "t=" + t );
        System.out.println ( "u=" + u );
        System.out.println ( "v=" + v );
        System.out.println ( "w=" + w );
        System.out.println ( "x=" + x );
        System.out.println ( "y=" + y );
        System.out.println ( "z=" + z );
    }
}