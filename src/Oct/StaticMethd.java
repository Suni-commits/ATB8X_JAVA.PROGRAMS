package Oct;
import java.util.Scanner;
public class StaticMethd {
    //static method not require to create object reference
    // no return type with arguments passing

    static void Min(int a, int b)
    {
        if(a>b)
            System.out.println("The maximum number is : " + a);
        else

            System.out.println("The maximum number is : " +b);
    }
    public static void main(String[] args){
        int c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        c=sc.nextInt();
        d=sc.nextInt();
        Min(c,d);


    }

}
