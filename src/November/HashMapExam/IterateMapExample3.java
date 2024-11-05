package November.HashMapExam;
import java.util.*;
public class IterateMapExample3 {
    public static void main(String[] args){
        HashMap hm=new HashMap();
        hm.put(11,"Avakaya");
        hm.put(12,"Amla");
        hm.put(13,"Mango");
        hm.put(14,"Apple");

       System.out.println(hm.get(12));
        Iterator it=hm.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
