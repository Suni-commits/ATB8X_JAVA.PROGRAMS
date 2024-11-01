package Oct.LinkedListExamples;
import java.util.*;
public class LinkedListExampe6 {
    public static void main(String[] args){
      // String str=new String();
       LinkedList ll=new LinkedList();
       ll.add("SAM");
       ll.add("RAM");
       ll.add("JAM");
       ll.add("JOHN");
       ll.add("Smith");
      System.out.println(ll);

      Iterator it=ll.iterator();
      while(it.hasNext()){
          System.out.println(it.next());
      }
      System.out.println(ll.contains("RAM"));
      System.out.println(ll.get(0));
      System.out.println(ll.indexOf("SAM"));//0
        System.out.println(ll.indexOf("JOHN"));//3
        Object[] name=new String[5];
        name=ll.toArray(name);
        for(Object o:name){
            System.out.println(o);
        }

    }
}
