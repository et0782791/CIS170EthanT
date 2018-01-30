
package chapter13geometric;

import java.util.*;

public abstract class Circle extends GeometricObject
{
    private double radius;
    
    public Circle()
    {
        this(1.0);
    }
    
    public Circle(double radius)
    {
        this(radius, "white", false);
    }
    public Circle(double radius, String color, boolean filled)
    {
        super (color, filled);
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius()
    {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public double getPerimiter()
    {
        return 2*radius*Math.PI;
    }
    public boolean equals(Circle circle)
    {
        return this.radius == circle.getRadius();
    }
    @Override
    public String toString()
    {
        return "[Circle] radius = " + radius;
    }
    @Override
    public int compareTo(GeometricObject o)
    {
        if (getArea() > o.getArea())
            return 1;
        else if(getArea() < o.getArea())
            return 0;
        else 
            return -1;
    }
}
