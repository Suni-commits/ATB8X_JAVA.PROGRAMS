package Oct.ArrayListExcer;

import java.util.ArrayList;

public class deletemultiplevalues {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(200);
        al.add("COLORS");
        al.add(null);
        al.add(true);
        al.add(200);
        al.add(null);
        al.add("SUNEETHA");
        //remove multiple values randomly from list
        ArrayList mylist=new ArrayList();
        mylist.add("SUNEETHA");
        mylist.add(200);
        mylist.add(null);
        al.removeAll(mylist);
        System.out.println(al);


    }
}
