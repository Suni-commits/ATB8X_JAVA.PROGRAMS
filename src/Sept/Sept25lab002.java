package Sept;

import java.util.Scanner;

public class Sept25lab002 {
    public static void main(String[] args) {
        // Finding factorial number for 5
        int i, n,res=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        for (i=1; i<=n; i++) {
            res *= i;
            System.out.println("the factorial of number 5  :" + res);

        }
    }
}
