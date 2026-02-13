package Inheritance;

import java.awt.*;

abstract class Shape {
    protected Color colour;
    protected Point position;


    public Shape(Color c, Point p) {
        this.colour = c;
        this.position = p;
    }

    public Color getColour() {
        return colour;
    }

    public Point getPosition() {
        return position;
    }

    public void setColour(Color c) {
        this.colour = c;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}

