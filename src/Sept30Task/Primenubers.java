package Sept30Task;
import java.util.Scanner;

public class Primenubers {

    static boolean isPrime(int n){
        if(n==1 || n==0)
            return false;
        for(int i=2; i<n;i++) {

            if (n % i == 0)
                return false;
        }
        return true;
        }

    public static void main(String[] args)
    {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        N=sc.nextInt();

        for(int i=1;i<N;i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
