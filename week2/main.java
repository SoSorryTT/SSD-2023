package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // Example 1
        // List<String> list = new ArrayList<String>();
        // list.add("b");
        // list.add("a");
        // list.add("somcahi");
        // list.add("bob");

        // Collections.sort(list);

        // for(String s : list) {
        //     System.out.println(s);

        // Example 2
        // Person p1 = new Person("Bob", 33);
        // Person p2 = new Person("Somchai", 20);
        // Person p3 = new Person("Alice", 8);
        // Person p4 = new Person("Alice", 1);
        // List<Person> list = new ArrayList<Person>();
        // list.add(p1);
        // list.add(p2);
        // list.add(p3);
        // list.add(p4);
        // Collections.sort(list);
        // for(Person s : list) {
        //     System.out.println(s.getName()+", "+s.getAge());
        // }

        // Example 3
        Circle circle = new Circle(33.0);
        equilateralTriangle equilateralTriangle = new equilateralTriangle(20.0);
        Isoscelestriangle isoscelestriangle = new Isoscelestriangle(20.0, 8.8);
        Rectangle rectangle = new Rectangle(15, 1);
        Square square = new Square(1);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        List<Shape> list = new ArrayList<Shape>();
        list.add(circle);
        list.add(equilateralTriangle);
        list.add(isoscelestriangle);
        list.add(rectangle);
        list.add(square);
        list.add(triangle);
        Collections.sort(list);
        for(Shape s : list) {
            System.out.println(s.getName()+" "+s.getArea());
        }
    }
}
