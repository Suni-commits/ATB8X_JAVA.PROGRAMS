package Oct.HashMapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example2 {
    public static void main(String[] args)
    {
        HashMap <Integer,String> hm=new HashMap<Integer, String>();
        hm.put(101,"John");
        hm.put(102,"RAM");
        hm.put(103,"MAAM");
        hm.put(102,"JAM");
        hm.put(104,"FAME");
        hm.put(105,"RAM");

        System.out.println(hm);
        //read elements using for...each
      /*  for( Object x:hm.keySet())
        {
            System.out.println("No.of employees : " + x + "  " +hm.get(x));
        }*/
        //Read elements using Iterator
        Iterator<Integer> it=hm.keySet().iterator();
        while(it.hasNext())
        {
            int key=(int) it.next();
            System.out.println(key +"  " +hm.get(key) );

        }

    }
}
