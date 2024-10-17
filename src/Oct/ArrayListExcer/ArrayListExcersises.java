package Oct.ArrayListExcer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExcersises {
    public static void main(String[] args){

        List <String> al=new ArrayList<String>();
        al.add("RED");
        al.add("YELLOW");
        al.add("GREEN");
        al.add("BLUE");
        al.add("MEGENTA");
        System.out.println("All the colors : " +al);//List of all the colors will display
        // modifying color name
        al.set(4,"PINK");
        System.out.println("Change the name of the color as " +al.get(4));//retrieved 4th index value as PINK
        al.add(null);
        System.out.println(al.get(5));//Arraylist accepts multiple null values and duplicate values
        al.add("RED");
        System.out.println("All the colors : " +al); //[RED, YELLOW, GREEN, BLUE, PINK, null, RED]
        //find the size of the arraylist
        System.out.println(al.size());
        //Removing  specific value from list
        al.remove(3);
        System.out.println(al);//value removed from the list
        //for...each loop
        for(String x: al)
        {
            System.out.println(x);
        }

        //Using iterator
        Iterator it=al.iterator();

        while(it.hasNext())
        {
          System.out.println(it.next());
        }


    }
}
