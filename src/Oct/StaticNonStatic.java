package Oct;

public class StaticNonStatic {
    int i=20;
    static String s="Rosy";

    public static void main(String[] args){
        StaticNonStatic obj=new StaticNonStatic();
        System.out.println(" My age is :"+obj.i); // non-static variable should require to create object reference to  the value
        System.out.println("My name is :"+s); // static variable not required to create object reference


    }

}
