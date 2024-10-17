package Oct.ArrayListExcer;

import java.util.ArrayList;
import java.util.Iterator;

public class Firstexample {
  public static void main(String[] args){
      ArrayList list=new ArrayList();
      list.add(100);
      list.add(10.5);
      list.add("Welcome");
      list.add(true);
      list.add("SUNEETHA");
      list.add(100);
      list.add(null);
      list.add(false);

     // System.out.println("print the values in the list " +list);
      //Print the size the arraylist
     // System.out.println("print the size in the list " +list.size());
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
  }

}
