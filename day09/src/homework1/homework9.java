package homework1;
//9、了解一下StringBuilder的扩容机制
public class homework9 {
    public static void main(String[] args) {
        //通过查看源码StringByuilder如何扩容
        /*StringBuilder s = new StringBuilder();
        //如果使用空参构造，默认创建了一个容量为16的字符数组
        System.out.println(s.capacity());//16
        s.append("xxxxxxxxxxxxxxxxx");//35
        System.out.println();
         */
        StringBuilder s2 = new StringBuilder("java");
        //带参构造，默认容量是参数字符串长度+16
        System.out.println(s2.capacity());
        s2.append("xxxxxxxxxx");
        System.out.println(s2.capacity());
        /*
        添加数据时会判断是否需要扩容，如果需要（原来的数据+添加的数据长度>数组长度），就扩容；扩容是扩容到当前数据长度的二倍加二。
        扩容之后如何还是装不下，那就使用需要的最小容量（原来的数据长度+添加的数据长度）作为新的容量，扩容之后，将源数组中的所有元素拷贝到新数组中。
         */
    }
}
