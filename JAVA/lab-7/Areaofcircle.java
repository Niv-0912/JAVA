import java.util.*;

class Circle
{
    void area(double r)
    {
        double area =  3.14*r*r;
        System.out.println("Area of circle is :"+ area);
    }

}


public class Areaofcircle {

   public static void main(String[] args) {

        Circle c1 = new Circle();
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r here:");
        double r = sc.nextDouble();
        c1.area(r);

   }

     
}
