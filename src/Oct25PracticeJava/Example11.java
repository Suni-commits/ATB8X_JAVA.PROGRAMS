package Oct25PracticeJava;
import java.util.*;

public class Example11 {
    public static void main(String[] args){
        //loop through an arraylist
        ArrayList al=new ArrayList();
        al.add(0,"TEST");
        al.add(1,"ENGLISH");
        al.add(2,"SCIENCE");
        al.add(3,"SOCIAL");
        System.out.println(al);
        Collections.sort(al);
        for(Object i:al)
        {
            System.out.println(i);
        }
       System.out.println("The size of the arrayy = "+al.size());
    }
}
