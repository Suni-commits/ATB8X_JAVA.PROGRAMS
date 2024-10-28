package Oct25PracticeJava;
import java.util.*;
public class Example1 {
    public static void main(String[] args){
        //Count the number of words in a string
        String s=new String();
        s="one two three Four";
        int c=s.split("\\s").length;
        System.out.println(c);

        String s1="abc134@gmail.com";
        int i=s1.split("@").length;
        System.out.println(i);



    }
}
