
import java.util.*;
abstract class shape{
    Scanner sc = new Scanner(System.in);
    abstract void area();
}
class circle extends shape{
    void area(){
        System.out.println("\nEnter the radius: ");
        float r = sc.nextFloat();
        float area;
        area = (float) (3.14 * r * r);
        System.out.println("Area of circle is " + area);
        
    }
}
class triangle extends shape{
    void area(){
        System.out.println("\nEnter the height and base: ");
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float area;
        area =  (float) (0.5*h*b);
        System.out.println("Area of triangle is " + area);
        
    }
}
class rectangle extends shape{
    void area(){
        System.out.println("\nEnter the length and breadth: ");
        float b= sc.nextFloat();
        float l=sc.nextFloat();
        float area;
        area= l*b;
        System.out.println("Area of rectangle is " + area);
       
    }
}
public class Area {
    public static void main(String args[])throws Exception{
        shape obj1= new circle();
        obj1.area();

        shape obj2= new triangle();
        obj2.area();

        shape obj3= new rectangle();
        obj3.area();

    }
    
}
