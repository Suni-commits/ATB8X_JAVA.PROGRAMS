package Nov2ndTask;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(4);
        al.add(8);
        al.add(2);
        al.add(7);

        System.out.println("Before reversed the list "+ al);
        int left=0;
        int right=al.size()-1;

        while(left<right){
            Integer temp=al.get(left);
            al.set(left,al.get(right));
            al.set(right,temp);
            left++;
            right--;



        }
        System.out.println("After reversed the list : "+ al);

    }
}
