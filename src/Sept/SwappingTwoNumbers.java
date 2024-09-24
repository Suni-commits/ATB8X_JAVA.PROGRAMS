package Sept;

public class SwappingTwoNumbers {
    public static void main(String[] args){
        int num1= 40;
        int num2= 25;
        int temp;
        System.out.println("---Before Swapping---");
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("---After Swapping---");
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);


    }

}
