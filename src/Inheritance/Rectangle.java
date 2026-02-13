package Inheritance;

import java.awt.*;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle (Color c, Point p, int a, int b) {
        super(c, p);
        this.sideA = a;
        this.sideB = b;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int i) {
        this.sideA = i;
    }

    public void setSideB(int i) {
        this.sideB = i;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double getCircumference() {
        return 2 * (sideA + sideB);
    }

    public String getCharacteristics() {
        return String.format("%s - Colour %s - Position %s - Area %.2f - Circumference %.2f",
                this.getClass(), this.colour, this.position, getArea(), getCircumference());
    }

}
