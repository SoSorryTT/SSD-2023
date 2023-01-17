package week2;
import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    public Triangle(Double sideA, double sideB, double sideC) {
        double s = sideA+sideB+sideC;
        area = sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        name = "Triangle";
    }

    public double getArea() {
        return area;
    }
}