package Sept30Task;

import java.util.Scanner;

public class CountVandC {
    public static void main(String[] args){
        int vow=0,con=0;

        String s="My name is Suneethaa" ;
       s= s.toLowerCase();
       for(int i=0;i<s.length();i++) {
           if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                   || s.charAt(i) == 'u') {

               vow++;
           } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

               con++;

           }

       }
        System.out.println("Total count of vowels :" + vow);
        System.out.println("Total count of consonets :" + con);
        }

    }

