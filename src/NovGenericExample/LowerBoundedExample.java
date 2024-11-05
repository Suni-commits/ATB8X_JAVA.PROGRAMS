package NovGenericExample;
import java.util.*;
public class LowerBoundedExample {

    public static void printNumbers(List<? extends Number> numbers){
        for(Number num:numbers){
            System.out.println(num);
        }
    }
    public static void main(String[] args){
        List<Integer> list1=List.of(1,3,8,9,17,100);
        List<Double> list2=List.of(2.4,87.8,1.08,9.81,1.0);

        System.out.println("Integer List : ");
        printNumbers(list1);
        System.out.println("Double List : ");
        printNumbers(list2);
    }
}
