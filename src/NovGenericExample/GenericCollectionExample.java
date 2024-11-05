package NovGenericExample;
import java.util.*;
public class GenericCollectionExample {
    public static void main(String[] args){

        ArrayList<String> al=new ArrayList<>();
        al.add("Telugu");
        al.add("Hindi");
        al.add("Social");
        al.add("Science");

        ArrayList<Integer> alint=new ArrayList<>();
        alint.add(10);
        alint.add(13);
        alint.add(24);
        alint.add(18);
        System.out.println("Text Books List : ");
        for(String s:al){
            System.out.println(s);
        }
        System.out.println("Integer List : ");
        Iterator it=alint.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
