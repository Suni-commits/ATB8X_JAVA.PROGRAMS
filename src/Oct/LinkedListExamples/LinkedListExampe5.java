package Oct.LinkedListExamples;
import java.util.*;
public class LinkedListExampe5 {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.add("Horse");
        ll.add("Cat");
        ll.add("Lion");
        ll.add("tiger");
        System.out.println(ll);
        ll.addFirst("Cow");// it will add element in the first place
        System.out.println(ll);
       Object[] arr=ll.toArray();

       for(Object a:arr)
       {
          System.out.println(a);
       }

    }
}
