package Oct.JavaMostInterviewPrograms.PracticePrograms;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args){
        HashSet hs=new HashSet();
        hs.add("Apple");
        hs.add("WaterMelon");
        hs.add("Gauva");
        hs.add("Bananas");
        hs.add("Graphs");
        hs.add("Orange");
        hs.add("Bananas");
        // to sort hashset then need to arraylist
        ArrayList al=new ArrayList(hs);
        Collections.sort(al);
        System.out.println(al);

        for(Object o:hs){
            System.out.println(hs);
        }
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        if(hs.contains("Orange")){
            System.out.println("This element is available in the list");
        }
        else{
            System.out.println("This element is not available in the list");
        }
        System.out.println(hs.remove("Bananas"));
        System.out.println(hs);
    }
}
