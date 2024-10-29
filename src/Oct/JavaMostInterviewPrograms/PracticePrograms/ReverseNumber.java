package Oct.JavaMostInterviewPrograms.PracticePrograms;
import java.util.*;
public class ReverseNumber {
     static int reversenum(int num){
         int rev=0;
         while( num>0)
         {
             int digit=num%10;
             rev=rev*10+digit;
             num /= 10;
         }
         return rev;
     }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int number2=reversenum(number);
        System.out.println("After reversed the number is  "+number2 );
    }
}
