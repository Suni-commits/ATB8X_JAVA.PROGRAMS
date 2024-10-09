package Oct;

import java.sql.Ref;

public class CallByRef {
    // call by reference
    int a,b;
    private static void add(CallByRef s, CallByRef t)
    {
        s.a=10;
        System.out.println((s.a+s.b));

    }
    public  static void main(String[] args){
        CallByRef s=new CallByRef();
        CallByRef t=new CallByRef();
        s.a=2;
        s.b=3;
        System.out.println("before passing: "+(s.a+s.b));
        add(s,s);
        System.out.println("After passing: "+ (s.a+s.b));
    }
}
