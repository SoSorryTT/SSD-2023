package week2;

public class Square extends Shape {
    public Square(double side) {
        area = side*side;
        name = "Square";
    }

    public double getArea() {
        return area;
    }
}
