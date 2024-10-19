package Oct.StringBUildandBuffer;

public class StringBulderandbufferexp {
    public static void main(String[] args)
    {
        //StringBuffer example, string buffer mutable, we can change value of text
        StringBuffer sb=new StringBuffer("Welcome");
        sb.append(" to Java");
        System.out.println(sb);
        //String Builder example, string builder mutable, we can change vlue of text

        StringBuilder sb1=new StringBuilder("Automation");
        sb1.append(" Testing");
        System.out.println(sb1);


    }
}
