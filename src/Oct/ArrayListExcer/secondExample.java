package Oct.ArrayListExcer;

import java.util.ArrayList;
import java.util.Iterator;

public class secondExample {
    public static void main(String[] args){
        ArrayList al=new ArrayList();

        al.add(101);
        al.add(300);
        al.add("Welcome to ArrayList");
        al.add(true);
        al.add(300);
        al.add(false);
        al.add("Colors");
       // System.out.println("Display the list of array is :" +al);
        al.set(2,"CHANGED VALUE");
        al.set(4,null);
       // System.out.println(al);
        //using for loop to read all the elements
      /*  for(int i=0;i<=al.size()-1;i++)
        {
            System.out.println(al.get(i));
        }*/

       /* for(Object x:al)
        {
           System.out.println(x);
        }*/
            al.remove(3);
            System.out.println(al);
      /*  Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/

    }
}
