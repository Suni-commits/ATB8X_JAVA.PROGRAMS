package Oct25PracticeJava;

public class Example2 {
    // Reverse string
    public static void main(String[] args) {
        String s = "Hello";
        String rev="";
        System.out.println("Before reversing the string is "+s);
        for (int i = 0; i <s.length(); i++) {
            rev = s.charAt(i)+rev;
        }
        System.out.println("After reversed the string is "+rev);
    }
}
