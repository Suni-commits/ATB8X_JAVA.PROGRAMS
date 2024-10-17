package Oct.HashSetPractice;

import java.util.HashSet;

public class Example1 {
    public static void main(String[] args){
        HashSet hs=new HashSet();
            hs.add(200);
            hs.add("SUNEETHA");
            hs.add(null);
            hs.add(200);
            hs.add(true);
            hs.add(400);
            hs.add("SUNEETHA");
            hs.add(null);
            //Duplicate and multiple nulls will not print at run time
            //System.out.println(hs);//[null, 400, 200, SUNEETHA, true]
            //System.out.println(hs.size());

            hs.remove("SUNEETHA");
            System.out.println(hs);

    }
}
