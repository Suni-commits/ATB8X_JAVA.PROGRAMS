package Oct.OOPSPractice;

public class Calculation {
    int addition(int x, int y) {
        return x + y;

    }

    int subtraction(int a, int b) {
        return a - b;
    }
}
    class My_Calculation extends Calculation {
        double multiplcation(int s, int t) {
            return s * t;
        }

public static void main(String[] args){
    My_Calculation mc=new My_Calculation();
   System.out.println( "The addition of the two numbers = "+mc.addition(30,89));
    System.out.println("The  subractin of the two numbers = "+mc.subtraction(40,60));
    System.out.println("The multiplication of the two numbers = "+mc.multiplcation(20,70));


    }
}
