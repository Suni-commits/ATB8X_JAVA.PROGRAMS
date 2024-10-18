package Oct.StringPractice;

import java.lang.reflect.Array;

public class Example8 {
    public static void main(String[] args){

        //split()--split the string multiple parts based on the delimiter
        String s="abc@gmail.com";
       String a[]=s.split("@");
       System.out.println(a[0]);//abc
        System.out.println(a[1]);//gmail.com
        String amount="$16,78,38";
        System.out.println(amount.replace("$",""));//16,78,38
        System.out.println(amount.replace("$","").replace(",",""));//167838
        //example2
        String s1="abc,1223@xys";
        //first we have to remove comma from string
        String a1[]=s1.split(",");
        System.out.println(a1[0]);//abc
        //wanted to split entire text with delimiter @
        String a2[]=a1[1].split("@");
        System.out.println(a2[0]);//1223
        System.out.println(a2[1]);//xys

        //example3
        s="abc 123";
        String a3[]=s.split(" ");
        System.out.println(a3[0]);//abc
        System.out.println(a3[1]);//123

        //exmple 4
        String name="Java Selenium";
        //wanted to check whether java is avaialble in the string or not without using ==,equalsignorecase
        System.out.println(name.contains("Java"));//true
        System.out.println(name.contains("java"));//false
        System.out.println(name.replace('J','j').contains("java"));//true
        System.out.println(name.toLowerCase().contains("java"));

    }
}
