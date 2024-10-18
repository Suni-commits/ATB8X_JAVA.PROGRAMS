package Oct.StringPractice;

public class Example1 {
    public static void main(String[] args)
    {
        String s=new String("Welcome");
        String s1=" To Java";
        String s2=" Automation";
        System.out.println(s.concat(s1));// Two string concatanation
        System.out.println(s.concat(s1).concat(s2)); // multiple string concatanation
        System.out.println(s.length());// length of the string(no.of characters)
        System.out.println(s.toLowerCase());//changed to lower case all the characters
        System.out.println(s.toUpperCase());// changed to Uppper case all the chars
        System.out.println(s.contains(s));//true
        System.out.println(s.isBlank());//false


    }
}
