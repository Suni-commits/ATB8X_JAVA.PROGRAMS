package Oct.ArrayListExcer;


import java.util.ArrayList;

public class removingexam {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add("SUNEETHA");
        al.add(6021225);
        al.add("suneethaila@gmail.com");
        al.add("HYDERABAD");
        al.add(500043);
        al.add(null);
        al.add(true);
        al.add("SUNEETHA");
        al.add(null);

      //  System.out.println(al.size());
       al.clear();
       System.out.println(al);
       System.out.println(al.isEmpty());



    }
}
