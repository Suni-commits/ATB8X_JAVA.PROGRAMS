package Oct;

class Father{
    static void home()
    {
        System.out.println("Father has two individual houses");
    }
    void House()
    {
        System.out.println("This is one of the house among those two");
    }
}
class Child extends Father{
    static void home()
    {

        System.out.println("child has 3bhk flat");
    }
    void House()
    {
        System.out.println("child has 3bhk and 2 bhk flats");

    }
}

public class MethodHideAndOver {
    public static void main(String[] args)
    {
        Father f=new Child();
        f.home();
        f.House();
    }
}
