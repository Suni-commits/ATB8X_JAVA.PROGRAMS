package Oct.StringBUildandBuffer;

public class Stringimmutable {

    public static void main(String[] args)
    {
        String s=new String("Welcome");
        s.concat("to Java");
        System.out.println(s);// we cannot change original string
        String s1=s.concat(" to Java");
        System.out.println(s1);

    }
}
