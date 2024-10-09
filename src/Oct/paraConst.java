package Oct;

public class paraConst {
        int c; String d;
    paraConst(int a,String b)
    {
        c=a;
        d=b;
    }

    public static void main(String[] args){
        paraConst pc=new paraConst(20,"SUNNY");
        System.out.println(pc.c + " " + pc.d);

    }
}
