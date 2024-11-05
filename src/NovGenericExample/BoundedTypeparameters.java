package NovGenericExample;

public class BoundedTypeparameters {

    public static <T extends Number> void printNumber(T number){
        System.out.println("Number : "+number);
    }
    public static void main(String[] args){
        printNumber(123);
        printNumber(3.42);
        printNumber(3.98f);
        printNumber(124L);
    }
}
