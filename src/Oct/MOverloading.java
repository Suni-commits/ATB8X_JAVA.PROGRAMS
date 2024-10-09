package Oct;

public class MOverloading {
    static int addition(int a, int b,int c)
    {
        return a+b+c;
    }
    static double addition(double a, double b,int c)
    {
        return a+b+c;
    }
    static int addition(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args){
       System.out.println( addition(10,20,30));
        System.out.println( addition(12.3,34.2,12));
        System.out.println( addition(10,20));
    }
}
