package NovemberStringBuffer;
import java.util.*;
public class StringBufferOperations {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" World !");
        sb.insert(6, "Java");
        System.out.println(sb);

        //reverse string
       // sb.reverse();
        //System.out.println(sb);
        // converting StringBuffer to String

     //   String s=sb.toString();
      //  System.out.println(s);

        //inserting
        sb.insert(11," , ");
        System.out.println(sb);

        sb.delete(6, 9);
        System.out.println(sb);
    }
}
