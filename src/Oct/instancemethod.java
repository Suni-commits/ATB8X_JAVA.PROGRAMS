package Oct;

import java.util.Scanner;

public class instancemethod {

    //no return with arguments

    void min(int a,int b)
    {
        if(a>b)
            System.out.println("The maximum number is : " + a);
        else
            System.out.println("The maximum number is : " + b);
    }

    public static void main(String[] args){
        int c,d;
        instancemethod obj=new instancemethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("---Enter 2 numbers ---");
        c=sc.nextInt();
        d=sc.nextInt();
        obj.min(c,d);

    }
}
