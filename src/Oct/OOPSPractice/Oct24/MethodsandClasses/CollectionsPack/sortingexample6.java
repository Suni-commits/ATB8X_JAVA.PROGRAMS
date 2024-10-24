package Oct.OOPSPractice.Oct24.MethodsandClasses.CollectionsPack;
import java.util.*;
public class sortingexample6 {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add("BMW");
        al.add("Text");
        al.add("Java");
        al.add("Weagnor");
        al.add("Volvo");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        for(Object i:al)
        {
            System.out.println(i);
        }

    }
}
