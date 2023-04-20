package homework2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class GraphTest {
    public static void main(String[] args) {

        Circle c = new Circle(1.5);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());



        Rectangle rectangle= new Rectangle(2.0,7);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
