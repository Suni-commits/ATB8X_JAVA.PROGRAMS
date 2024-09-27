package Sept27;

import java.util.Scanner;

public class Lab003Sumofnumbers {
    public static void main(String[] args){
        //print the sum of 1 to 100 numbers
        int sum=0,n=1;
        while(n<=100)
        {
            sum += n;
            n++;
        }
        System.out.println("Sum of the numbers from   1 to 100 is " + sum);
    }
}
