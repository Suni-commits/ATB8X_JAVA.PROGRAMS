package Oct25PracticeJava;
import java.util.*;
public class Example15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length;
        int width;
        double area;
        System.out.println("Enter the length of the rectangle");
        length=sc.nextInt();
        System.out.println("Enter the width of the rectangle");
        width=sc.nextInt();
        area=length*width;
        System.out.println("Area =  "+area);
    }
}
