package Oct25PracticeJava;
import java.util.*;
public class Example16 {
    public static void main(String[] args){
        // check whether the given is even or odd
        int e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number...");
        e=sc.nextInt();
        if(e%2==0)
        {
            System.out.println(e + " is  even number");
        }
        else {
            System.out.println(e + " is  odd number");
        }
    }
}

