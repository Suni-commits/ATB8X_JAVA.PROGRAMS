package Oct.LinkedListExamples;
import java.util.*;
public class LinkedListOpearations {
    public static void main(String[] args){
        LinkedList mylist=new LinkedList();
        mylist.add("Test");
        mylist.add(200);
        mylist.add("SAM");
        mylist.add(null);
        mylist.add(true);
        mylist.add("Test");

        System.out.println(mylist);
        if(mylist.contains(100)){
            System.out.println("This Element is not available in the list");
        }
        else{
            System.out.println("This Element is available in the list");
        }

        Iterator it=mylist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        mylist.set(2,"Apple");
        System.out.println(mylist);
    }
}
