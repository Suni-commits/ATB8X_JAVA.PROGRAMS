package Sept;

public class Set25Lab002
{

public static void main(String[] args){
    int n = 100; // Change 'n' to the desired range
    System.out.println("Prime numbers from 1 to " + n + ":");

    for (int i = 2; i <= n; i++) {
        boolean isPrime = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(i + " ");
        }
    }

}

}
