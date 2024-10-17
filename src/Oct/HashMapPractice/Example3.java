package Oct.HashMapPractice;
import java.util.HashMap;

public class Example3 {
    public static void main(String[] args){
        HashMap <Integer,String> hm1=new HashMap<Integer,String>();
            hm1.put(21,"MATHS");
            hm1.put(23,"PHYSICS");
            hm1.put(24,"MATHS");
            hm1.put(22,"CHEMISTRY");
            hm1.put(20,"SOCIAL");
           System.out.println(hm1);
      //  System.out.println(hm1.keySet());//[20, 21, 22, 23, 24]
        //System.out.println(hm1.values());//[SOCIAL, MATHS, CHEMISTRY, PHYSICS, MATHS]
        //System.out.println(hm1.entrySet());//[20=SOCIAL, 21=MATHS, 22=CHEMISTRY, 23=PHYSICS, 24=MATHS]
      //  hm1.remove(24);
       // System.out.println(hm1);//{20=SOCIAL, 21=MATHS, 22=CHEMISTRY, 23=PHYSICS}--After removing
      //  hm1.clear();
       // System.out.println(hm1);//{}---output
      //  System.out.println(hm1.isEmpty());


    }
}
