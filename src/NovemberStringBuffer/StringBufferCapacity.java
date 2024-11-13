package NovemberStringBuffer;
import java.util.*;
public class StringBufferCapacity {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello ! ");

        //System.out.println("After append : " + sb);
        System.out.println("Initial Capacity : " +sb.capacity());

        // After append capacity is
        sb.append("How are you ?,where are you from ?");
        System.out.println("After append capacity : " +sb.capacity());
        //capacity ensure by force chaging capacity
        sb.ensureCapacity(100);
        System.out.println("After force ensuring capacity : " +sb.capacity());

    }
}
