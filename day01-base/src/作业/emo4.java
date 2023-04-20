package 作业;
//4. 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
public class emo4 {
    public static void main(String[] args) {
      int a = 177;
      int b = 165;
      double x = (a+b)*1.08/2;
      double y = (0.923*a+b)*1.08/2;
      String n = "儿子预计身高为"+x+"cm";
      String m = "女子预计身高为"+y+"cm";
        System.out.println(n);
        System.out.println(m);

    }
}
