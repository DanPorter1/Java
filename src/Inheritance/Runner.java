package Inheritance;

import java.awt.*;
import java.util.ArrayList;

public class Runner {

    public static ArrayList<Shape> shapes = new ArrayList<>();

    static void main(String[] args) {
        Rectangle r1 = new Rectangle(Color.BLACK, (new Point (100,20)), 1,2);
        Rectangle r2 = new Rectangle(Color.BLUE, (new Point (7,25)), 8,3);
        Rectangle r3 = new Rectangle(Color.GREEN, (new Point (5,200)), 6,2);

        Circle c1 = new Circle(Color.BLUE, (new Point(1,2)),2);
        Circle c2 = new Circle(Color.ORANGE, (new Point(9,3)),5);
        Circle c3 = new Circle(Color.PINK, (new Point(5,1)),7);

        Sphere s1 = new Sphere(Color.GRAY, (new Point(2,9)), 4);
        Sphere s2 = new Sphere(Color.ORANGE, (new Point(7,9)), 8);
        Sphere s3 = new Sphere(Color.BLUE, (new Point(3,9)), 9);

        shapes.add(r1);
        shapes.add(r2);
        shapes.add(r3);
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(c3);
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);

        for (Shape s: shapes) {
            System.out.printf("%s - %s\n",s.getColour(), s.getPosition());
        }

//        System.out.println(r1.getCharacteristics());
//        System.out.println(r2.getCharacteristics());
//        System.out.println(r3.getCharacteristics());
//        System.out.println(c1.getCharacteristics());
//        System.out.println(c2.getCharacteristics());
//        System.out.println(c3.getCharacteristics());
//        System.out.println(s1.getCharacteristics());
//        System.out.println(s2.getCharacteristics());
//        System.out.println(s3.getCharacteristics());
    }
}
