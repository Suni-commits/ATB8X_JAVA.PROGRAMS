package Oct.JavaMostInterviewPrograms.PracticePrograms;
import java.util.*;
public class PalindromProgram {
    static boolean palindromnumber(int num){
        int original=num;// storing values
        int rev=0;
        while(num >0){
                int digit=num %10;
                rev=rev*10+digit;
                num /= 10;
        }

            return original==rev;
    }

    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ..");
        int number=sc.nextInt();
       if(palindromnumber(number)){
           System.out.println(number + " is a palindrom");
       }else {
           System.out.println(number + " is not a palindrom");
       }

    }
}
