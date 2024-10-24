package Oct.OOPSPractice.Oct24.MethodsandClasses.CollectionsPack;
import java.util.*;
public class Example2 {
    public static void main(String[] args){
        String[] student_name={"Ram","Sam","John","Smith"};
        System.out.println(student_name[2]);
       ArrayList <String> al=new ArrayList<String>();
       Collections.addAll(al,student_name);
       System.out.println(al);
    }
}
