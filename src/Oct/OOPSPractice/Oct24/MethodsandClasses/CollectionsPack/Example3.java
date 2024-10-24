package Oct.OOPSPractice.Oct24.MethodsandClasses.CollectionsPack;
import java.util.*;
public class Example3 {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add("Test");
        al.add(100);
        al.add("Java");
        al.add(200);
        al.add(null);
        al.add("Test");
        al.add(true);
        System.out.println(al);
        System.out.println(al.contains("Java"));
        System.out.println(al.get(2));
        System.out.println(al.isEmpty());
    }
}
