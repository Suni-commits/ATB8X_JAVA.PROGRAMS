package Sept;

public class CalcSwitch {
    public static void main(String [] args){
        int num1 = 40;
        int num2 = 30;
        char operator = '+';

        switch (operator){
            case '+' :
                System.out.println("Addition of two numbers :" + (num1+num2));
                break;
            case '-' :
                System.out.println("Subtraction of two numbers :" + (num1-num2));
                break;
            case '*' :
                System.out.println("Multiplication of two numbers :" + (num1*num2));
                break;
            case '/' :
                System.out.println("Division of two numbers :" + (num1/num2));
                break;
            case '%' :
                System.out.println("Modulus of two numbers :" + (num1%num2));
                break;



        }





    }
}
