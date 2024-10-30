package Oct.LinkedListExamples;
import java.util.*;
public class LinkedlistExample3 {
    public static void main(String[] args){
        List li=new LinkedList();
        li.add(100);
        li.add(10);
        li.add(200);
        li.add(5);
        li.add(14);

        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);

        for(Object o:li){
            System.out.println(li);
        }
        li.set(3,49);
        System.out.println(li);

    }

}
