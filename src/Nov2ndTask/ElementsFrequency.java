package Nov2ndTask;
import java.util.*;
public class ElementsFrequency {
    public static void main(String[] args){
        Integer[] num={2,4,4,9,2,4,5,3,5,3,6,8,7,8};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer n:num){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            System.out.println("Elements "+entry.getKey() +" frequency " +entry.getValue());
        }
    }
}
