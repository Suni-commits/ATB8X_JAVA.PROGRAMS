package Oct25PracticeJava;
import java.util.*;
public class Example12 {
    public static void main(String[] args){
        // Loop through a HashMap
        HashMap hm=new HashMap();
        hm.put(101,"One");
        hm.put(102,"Two");
        hm.put(103,"Three");
        hm.put(104,"Four");
        hm.put(105,"Five");
        System.out.println(hm);
        System.out.println(hm.entrySet());

       for(Object o: hm.entrySet()){
           System.out.println(o);
       }
    }
}
