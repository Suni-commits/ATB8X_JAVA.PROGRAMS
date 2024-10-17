package Oct.HashMapPractice;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args){
         HashMap<String,String> hm=new HashMap<String,String>();
            hm.put("England" ,"London");
            hm.put("Germany","Berlin");
            hm.put("Norway","Oslo");
            hm.put("India","New Delhi");
            System.out.println(hm);
            System.out.println(hm.get("Norway"));//print norway value as OSLO
            System.out.println(hm.keySet());// print only key
            System.out.println(hm.values()); //print only values




    }
}
