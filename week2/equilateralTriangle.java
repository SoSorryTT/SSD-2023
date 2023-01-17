package week2;
import static java.lang.Math.sqrt;

public class equilateralTriangle extends Shape {
    public equilateralTriangle(Double side) {
        area = sqrt(3)/4*side*side;
        name = "equilateralTriangle";
    }

    public double getArea() {
        return area;
    }
}