class Area {

    static double pi = 3.14159;
    double area = 0;

    public Area(double r)
    {
        this.area = r*r*pi;
    }

    void display()
    {
        System.out.println("Area is:" + area);
    }

}


public class AreaofCircle {
    public static void main(String[] args) {

        Area o1 =  new Area(10);
        o1.display();
        
    }
}
