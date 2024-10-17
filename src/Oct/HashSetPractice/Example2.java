package Oct.HashSetPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args){
        HashSet hs=new HashSet();
        hs.add(200);
        hs.add("COLORS");
        hs.add(null);
        hs.add(300);
        hs.add(true);
        hs.add(400);
        hs.add("SUNEETHA");
        hs.add(null);
        hs.add(200);

        //converting hashset to arraylist
        ArrayList al=new ArrayList(hs);

        System.out.println(al);
        System.out.println(al.get(3));




    }
}
