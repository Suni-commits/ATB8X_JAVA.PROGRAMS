package November.HashMapExam;
import java.util.*;
public class IterateMapexample1 {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Apple");
        hm.put(2,"Grapes");
        hm.put(3,"Orange");
        hm.put(4,"Watermelon");
        hm.put(5,"Bananas");
        System.out.println(hm);
        System.out.println(hm.entrySet());
        for( Map.Entry<Integer,String> i:hm.entrySet()){
            Integer key=i.getKey();
            String values=i.getValue();
            System.out.println(key+ " = " +values);
        }

    }
}
