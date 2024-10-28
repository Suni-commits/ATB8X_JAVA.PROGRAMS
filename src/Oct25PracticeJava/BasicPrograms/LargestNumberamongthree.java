package Oct25PracticeJava.BasicPrograms;
import java.util.*;
public class LargestNumberamongthree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        if(a>=b && a>=c ){
            System.out.println(a +" Nubmber is largest one");
        }
        else if(b>=a && b>=c){
            System.out.println(b+ " Second number is the largest number");
        }
        else{
            System.out.println(c+ " thid one is largest number");
        }


    }
}
