package November.HashMapExam;
import java.util.*;
import java.lang.*;
public class IterateMapxample2 {
    public static void main(String[] args){
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(101,"Ram");
        hm1.put(102,"Sam");
        hm1.put(103,"Jam");
        hm1.put(105,"Nam");
        hm1.put(106,"Wikky");
        System.out.println(hm1.entrySet());

        hm1.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });


    }
}
