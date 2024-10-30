package Oct.LinkedListExamples;
import java.util.*;
public class LinkedlistExample4 {
    public static void main(String[] args){
        LinkedList mylist=new LinkedList();
        mylist.add("Dog");
        mylist.add("Cat");
        mylist.add("Cow");
        mylist.add("Tiger");
        mylist.add("Lion");

        System.out.println(mylist);
        System.out.println(mylist.peek());
        System.out.println(mylist.getLast());
        Object[] s=mylist.toArray(new Object[0]);

        for(Object o:s){
            System.out.println(o);
        }
        Collections.sort(mylist);
        System.out.println(mylist.indexOf("Cow"));//1
        System.out.println(mylist.indexOf("Dog"));//2
        System.out.println(mylist.indexOf("Lion"));//3
        System.out.println(mylist.indexOf("Cat"));//0
        System.out.println(mylist.indexOf("Tiger"));//4
        mylist.addLast("Jam");
        System.out.println(mylist);

    }
}
