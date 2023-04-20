package homework2;

public class Circle  implements  Graph{
    private double radious;
//radious 半径
    public Circle(double radious){
        this.radious=radious;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*radious*2;
    }

    @Override
    public double getArea() {
        return Math.PI*radious*Math.pow(radious,2);
    }
}
