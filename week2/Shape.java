package week2;

public abstract class Shape implements Comparable<Shape> {
    protected double area;
    protected String name;
    
    public abstract double getArea();

    public String getName() {
        return name;
    }

    public int compareTo(Shape s) {
        return (int)(area-(s.area));
    }
}
