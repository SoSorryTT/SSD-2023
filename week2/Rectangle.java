package week2;

public class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        area = width*height;
        name = "Rectangle";
    }

    public double getArea() {
        return area;
    }

}
