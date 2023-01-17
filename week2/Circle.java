package week2;
import static java.lang.Math.PI;

public class Circle extends Shape {
    public Circle(Double r) {
        area = PI*(r*r);
        name = "Circle";
    }

    public double getArea() {
        return area;
    }
}