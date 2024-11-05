package Nov2ndTask;
import java.util.*;
public class HashTableExample {
    public static void main(String[] args){
        Hashtable ht=new Hashtable();
        ht.put(1,"Text");
        ht.put(2,"Book");
        ht.put(3,"Jungle");
        ht.put(4,"Ramu");

        Collections.synchronizedMap(ht);
        System.out.println(ht);

        Enumeration key=ht.keys();
        while(key.hasMoreElements()){
            System.out.println(key.nextElement());
        }
        for (Object k : ht.keySet()) {
            System.out.println(k + " = " + ht.get(k));
        }

    }
}
