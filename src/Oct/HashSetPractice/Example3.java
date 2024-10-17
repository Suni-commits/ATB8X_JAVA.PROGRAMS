package Oct.HashSetPractice;

import java.util.HashSet;
import java.util.Iterator;

public class Example3 {
    public static void main(String[] args){
        HashSet myset=new HashSet();
        myset.add(100);
        myset.add("colors");
        myset.add(true);
        myset.add(null);

        //read the elements and we cannot use normal for loop as it is not support to indexing
      /*  for( Object x:myset)
        {
            System.out.println(x);
        }*/

        Iterator it=myset.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
