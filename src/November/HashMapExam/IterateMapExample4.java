package November.HashMapExam;
import java.util.*;
public class IterateMapExample4 {
    public static void main(String[] args){
        HashMap hm=new HashMap();
        hm.put(1,"Ram");
        hm.put(2,"Apple");
        hm.put(3,"Jan");

        for(Object i:hm.keySet()){
            System.out.println(i);
        }
        hm.forEach((key,value)->{
            System.out.println(key +" = "+ value);

        });
    }
}
