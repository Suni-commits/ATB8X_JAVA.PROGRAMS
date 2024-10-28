package Oct25PracticeJava;
import java.util.*;
public class Example17 {
    public static void main(String[] args){
        // Verify the given number is positive or negative
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ...");
        int i=sc.nextInt();
        if(i>0){
            System.out.println("Number "+ i +" is positive");
        }
        else if(i<0){
            System.out.println("Number "+ i +" is negative");
        }
        else{
            System.out.println("Entered number is  " +i);
        }


    }
}
