package Nov2ndTask;
import java.util.*;
public class ArrayListReverse {
    public static void main(String[] args){

        ArrayList al=new ArrayList();
        al.add(20);
        al.add(8);
        al.add(67);
        al.add(12);
        al.add(2);

        Collections.reverse(al);

        System.out.println("After reversed number list : "+ al);
        Collections.sort(al);
        System.out.println("After sorted the elements : " +al);

        ArrayList list=new ArrayList();
        list.add("Test");
        list.add("Next");
        list.add("Rest");
        list.add("Mest");
        Collections.reverse(list);
        System.out.println("List after reversed : "+list);
        Collections.sort(list);
        System.out.println("After sorted the list : " +list);
    }
}
