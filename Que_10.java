
/*
    Construct a superclass called "Shape" with methods to calculate the area and
    perimeter. Create subclasses such as "Rectangle" and "Circle" that inherit from
    the Shape class and implement their specific area and perimeter calculations
*/
import java.util.*;
class Shapes{
    void area(){
        System.out.println("Shape doesn't have any Dimensions");
    }

    void perimeter(){
        System.out.println("Shape doesn't have any Dimensions");
    }
}

class Rectangle extends Shapes{
    int a;
    int b;
    int area;
    int per;

    @Override
    protected void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenth of Rectangle : ");
        a = sc.nextInt();
        System.out.println("Enter the width of Rectangle : ");
        b = sc.nextInt();
        area = a * b ;
        System.out.println("Area of Rectagle is : " + area);
    }

    @Override
    protected void perimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenth of Rectangle : ");
        a = sc.nextInt();
        System.out.println("Enter the width of Rectangle : ");
        b = sc.nextInt();
        per = 2 * (a + b);
        System.out.println("Perimeter of Rectagle is : " + per);
    }
}

class Circle extends Shapes{
    int radius;
    int area;
    int per;

    @Override
    protected void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle : ");
        radius = sc.nextInt();
        area = (int)Math.PI * radius * radius; 
        System.out.println("Area of Circle is : " + area);
    }
    
    @Override
    protected void perimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle : ");
        radius = sc.nextInt();
        per = 2 * (int) Math.PI * radius ;
        System.out.println("Perimeter of Circle is : " + per);
    }
}
public class Que_10 {
    public static void main(String[] args) {
        Shapes circle = new Circle();
        circle.area();
        circle.perimeter();

        Shapes rectangle = new Rectangle(); // Up casting allowed in java
        rectangle.area();
        rectangle.perimeter();
        try{
            Rectangle rectangle2 = (Rectangle) new Shapes(); // Down cast , thorws Exception.
            System.out.println(rectangle2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
