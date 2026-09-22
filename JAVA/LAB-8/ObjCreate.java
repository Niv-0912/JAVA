class Count{
    static int count;

    public Count() {
        count++;
    }

    void  getter()
    {
        System.out.println("Object count is :" + count);
    }
}


public class ObjCreate {
    public static void main(String[] args) {

        Count o1 = new Count();
        Count o2 = new Count();
        Count o3 = new Count();

        o3.getter();
        
    }
}
