package chapter13geometric;
import java.util.*;

public class Chapter13Geometric {

   
    public static void main(String[] args)
    {
        Circle cirlce1 = new Circle(2)
        {
        @Override
        public double getPerimeter() 
        {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        };
        Circle circle2 = new Circle(1) {
            @Override
            public double getPerimeter() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        System.out.println(GeometricObject.max(cirlce1, circle2));
    }
    
    
}
