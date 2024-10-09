package Oct;

public class CallByValue {
    // call by value
    int a;
    int b;

    private static void add(int s, int t)
    {
        s=10;
        System.out.println((s+t));

    }
    public static void main(String[] args){
    CallByValue cv=new CallByValue();
    cv.a=2; cv.b=3;
    System.out.println("Before passing the digits : " + (cv.a+cv.b));
    add(cv.a,cv.b);
    System.out.println("Before passing the digits : " + (cv.a+cv.b));
    }
}
