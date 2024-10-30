package Oct.LinkedListExamples;
import java.util.*;
public class LinkedListExample2 {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add(0,"Java");
        list.add(1,"Python");
        list.add(2,".NET");
        list.add(3,"Java Script");
        list.add(4,"React JS");

        System.out.println(list);
        //converting linkedlist to array
        String[] s=list.toArray(new String[0]);

        for(Object o:s)
        {
            System.out.println(o);
        }
        System.out.println(" The first element in the list is  "+list.getFirst());
        System.out.println(" The last element in the list is  "+list.getLast());
        System.out.println(list.clone());
        Collections.sort(list);//sorting the elements in the list
        System.out.println(list);//after sorting then list elements are
        System.out.println(list.size());//5
        System.out.println(list.isEmpty());//false

    }
}
