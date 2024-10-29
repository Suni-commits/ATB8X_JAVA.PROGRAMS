package Oct.JavaMostInterviewPrograms.PracticePrograms;
import java.util.*;
public class ArrayListtoArray {
    public static void main(String[] args){
        ArrayList colors=new ArrayList();
        colors.add("Green");
        colors.add("white");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Maroon");
        colors.add("Yellow");

        String[] carray=new String[colors.size()];
        colors.toArray(carray);
        System.out.println("Below are showing in array wise");
        for(Object O:colors){
            System.out.println("   "+O);
        }

    }
}
