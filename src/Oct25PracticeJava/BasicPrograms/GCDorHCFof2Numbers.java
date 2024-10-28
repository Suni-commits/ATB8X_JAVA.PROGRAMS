package Oct25PracticeJava.BasicPrograms;
import java.util.*;
public class GCDorHCFof2Numbers {
    public  int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args){
        GCDorHCFof2Numbers gc=new GCDorHCFof2Numbers();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        int gcdValue=gc.gcd(num1,num2);
        System.out.println("The GCD (HCF) of " + num1 + " and " + num2 + " is: " + gcdValue);
        sc.close();
    }

}

