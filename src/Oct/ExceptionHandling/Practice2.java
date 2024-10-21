package Oct.ExceptionHandling;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        //Arthemetic exception

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        try {
            System.out.println(100 / n);//if we enter 0 instead of any other number then we will get arthmetic exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
