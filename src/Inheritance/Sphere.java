package Inheritance;

import java.awt.*;

public class Sphere extends Circle{

    public Sphere(Color c, Point p, int r) {
        super(c, p, r);
    }

    public double getVolume() {
         return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getCharacteristics() {
        return String.format("%s - Colour %s - Position %s - Area %.2f - Circumference %.2f - Diameter %.2f - Radius %d - Volume %.2f",
                this.getClass(), this.colour, this.position, getArea(), getCircumference(), getDiameter(), getRadius(), getVolume());
    }
}
