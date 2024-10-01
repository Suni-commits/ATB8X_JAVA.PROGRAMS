package Sept30Task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int i,n=1,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("....Enter a Number....");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact =fact*i;
            System.out.println(fact);
        }

    }
}
