package Oct25PracticeJava.BasicPrograms;

public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }

        }
        return true;
}

    public static void main(String[] args){
        System.out.println("Prime numbers from 1 to 100... ");
        for(int number=2;number<=100;number++){
            if(isPrime(number)){
                System.out.println("  " + number);
            }
        }
    }
}
