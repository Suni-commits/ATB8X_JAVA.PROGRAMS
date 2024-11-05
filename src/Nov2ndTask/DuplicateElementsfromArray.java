package Nov2ndTask;
import java.util.*;
public class DuplicateElementsfromArray {
    public static void main(String[] args){
        Integer[] number={2,4,8,1,3,5,1,4,2};

        Set<Integer> s1=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for(int num:number){
            if(s1.contains(num)){
                duplicates.add(num);
            }else {
                s1.add(num);
            }
        }
        System.out.println("Duplicate elements : " +duplicates);
    }
}
