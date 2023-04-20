package homework2;

public class Rectangle implements Graph{
    private double width;
    private double height;
//Rectangle矩形
    public Rectangle (double width,double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
