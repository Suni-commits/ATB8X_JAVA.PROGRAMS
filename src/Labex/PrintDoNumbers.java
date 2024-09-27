package Labex;

import java.util.Scanner;

public class PrintDoNumbers {
    public static void main(String[] args){
        // example for do---while
        int i=2,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        do {

                System.out.println(i);
                i++;

        } while(i<=n);

    }
}
