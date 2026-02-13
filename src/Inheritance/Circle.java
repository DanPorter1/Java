package Inheritance;

import java.awt.*;

public class Circle extends Shape{
    protected int radius;

    public Circle(Color c, Point p, int r) {
        super(c,p);
        this.radius = r;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.pow(radius,3);
    }

    public double getDiameter() {
        return radius * 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public String getCharacteristics() {
        return String.format("%s - Colour %s - Position %s - Area %.2f - Circumference %.2f - Diameter %.2f - Radius %d",
                this.getClass(), this.colour, this.position, getArea(), getCircumference(), getDiameter(), getRadius());
    }
}
