package Oct25PracticeJava;
import java.util.*;
public class Example13 {

    public static void main(String[] args){
        //Loop through hashmap
        HashMap h=new HashMap();
        h.put(101,"Sam");
        h.put(102,"Ram");
        h.put(103,"Jam");
        h.put(104,"John");
        h.put(105,"Ran");

        System.out.println(h.entrySet());
        for(Object O:h.keySet())
        {
            System.out.println("Key : " +" "+ O +" || "  +"Value : " + h.get(O));
        }

    }
}
