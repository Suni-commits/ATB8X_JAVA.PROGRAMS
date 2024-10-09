package Oct;

public class BikeStaticMethod {
    int wheel=2;
    String color="";

    static void brakes()
    {
        System.out.println("Bike will stop when we apply the brakes");
    }
    void mileage(int s){
        System.out.println(" mileage of the bike :" +s);

    }
    public static void main(String[] args){
        BikeStaticMethod  RoyalEnfield=new BikeStaticMethod ();
        BikeStaticMethod  R15=new BikeStaticMethod ();
        BikeStaticMethod  Duke=new BikeStaticMethod ();
        RoyalEnfield.brakes();
        R15.brakes();
        Duke.brakes();
        RoyalEnfield.mileage(90);
        R15.mileage(80);
        Duke.mileage(93);

    }
}
