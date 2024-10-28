package Oct25PracticeJava;
import java.util.*;
public class Example7 {
    public static void main(String[] args){
        //sorting numbers
        int[] i={3,8,1,10,5,4};
        int sum=0;
        Arrays.sort(i);
        for(int j:i){
            sum+=j+sum;
            System.out.println(j);

        }
            System.out.println("Sum of the integers is "+sum);
    }
}
