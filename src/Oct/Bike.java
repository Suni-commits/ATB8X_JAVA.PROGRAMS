package Oct;

public class Bike {
    static int wheels=2;
    String color="";
    public static void main(String[] args){
        Bike RoyalEnfield=new Bike();
        Bike R15=new Bike();
        Bike Duke=new Bike();
       System.out.println("No. of wheels are : " + RoyalEnfield.wheels);
        System.out.println("No. of wheels are : " + R15.wheels);
        System.out.println("No. of wheels are : " + Duke.wheels);
        RoyalEnfield.color="Black";
        R15.color="Blue";
        Duke.color="Orange";

        System.out.println(" " + RoyalEnfield.color);
        System.out.println(" " + R15.color);
        System.out.println(" " + Duke.color);
    }
}
