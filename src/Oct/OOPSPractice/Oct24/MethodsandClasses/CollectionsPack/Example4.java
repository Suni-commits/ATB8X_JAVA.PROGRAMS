package Oct.OOPSPractice.Oct24.MethodsandClasses.CollectionsPack;
import java.lang.reflect.Array;
import java.util.*;
public class Example4 {
    public static void main(String[] args){
        String s=new String();
        ArrayList al=new ArrayList();
        al.add(0,"Text");
        al.add(1,100);
        al.add(2,null);
        al.add(3,true);
        System.out.println(al.get(0));
        System.out.println(al.size());
        System.out.println(al.remove(null));
        System.out.println(al);
        al.add(2,"SUNEETHA");
        System.out.println(al);


    }
}
