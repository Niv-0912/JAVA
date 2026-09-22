import java.util.*;
class AngelofTime
{
    void angel(double h, double m)
    {

        double angel = Math.abs(h-m);
        System.out.println("Angel between time is :"+angel);
        
    }
}


public class Angel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour here:");
        double h = sc.nextDouble();

        System.out.println("Enter Min here:");
        double m = sc.nextDouble();

        double min = m*6;
        double Hour = (h*30) + (min*0.5);

        AngelofTime a1 = new AngelofTime();
        a1.angel(Hour, min);
             
    }
    
}
