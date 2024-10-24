package Oct.OOPSPractice.Oct24.MethodsandClasses.CollectionsPack;
import java.util.*;
public class ReverseExample {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        //reverse order
        al.add("Text Book");
        al.add("Science");
        al.add("Social");
        al.add("English");
        al.add("Telugu");
        al.add("Hindi");
        System.out.println(al);
        Collections.reverse(al);
        Collections.sort(al);
        for(Object i:al){
            System.out.println(i);
        }


    }
}

