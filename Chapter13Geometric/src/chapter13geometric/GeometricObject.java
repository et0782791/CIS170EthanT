package chapter13geometric;
import java.util.*;
public abstract class GeometricObject implements Comparable <GeometricObject>
{
  private String color = "white";
  private boolean filled;
  

  /** Construct a default geometric object */
  protected GeometricObject() 
  {
    
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) 
  {
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() 
  {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) 
  {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) 
  {
    this.filled = filled;
  }
  public static GeometricObject max(GeometricObject o1, GeometricObject o2)
  {
      return o1.compareTo(o2) == 1 ? o1 : o2;
  }

  @Override
  public String toString() {
    return "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}