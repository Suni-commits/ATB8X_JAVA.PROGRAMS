package Oct.ExceptionHandling;
import java.util.Scanner;
public class Practice4 {
    static void validate(int age) {
        if (age > 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            System.out.println("Age is invalid");
        }
    }

        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        try{
            int n=sc.nextInt();
            validate(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }

    }

