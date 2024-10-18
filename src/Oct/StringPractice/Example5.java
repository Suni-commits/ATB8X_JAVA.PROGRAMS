package Oct.StringPractice;

public class Example5 {
    public static void main(String[] args){
        //equals(),  equalsIgnoreCase---to compare the string
        String s="welcome";
        String s1="welcome";
        System.out.println(s==s1);//true
        System.out.println(s.equals(s1));//true
        System.out.println(s.equals("Welcome"));//false---becoz cassenstivie
        System.out.println(s.equalsIgnoreCase("Welcome"));//true



    }
}
