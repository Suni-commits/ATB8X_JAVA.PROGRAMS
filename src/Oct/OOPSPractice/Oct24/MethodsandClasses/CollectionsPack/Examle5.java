package Oct.OOPSPractice.Oct24.MethodsandClasses.CollectionsPack;
import java.util.*;
public class Examle5 {
    public static void main(String[] args){

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(101,"SAM");
        hm.put(102,"JAM");
        hm.put(103,"RAM");
        hm.put(104,"John");
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.size());
        System.out.println(hm.containsKey(103));
        System.out.println(hm.entrySet());
    }
}
