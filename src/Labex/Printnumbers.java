package Labex;

import java.util.Scanner;

public class Printnumbers {
    public static void main(String[] args){
        //Print even numbers
        int i=2,n;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a Number");
        n=sc.nextInt();
        while(i<=n)
        {
         if(i%2==0)
             System.out.println(i);
            i++;

        }
    }
}
