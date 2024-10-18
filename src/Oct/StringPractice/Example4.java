package Oct.StringPractice;

public class Example4 {

    public static void main(String[] args)
    {
        String s="Welcome";
        System.out.println(s.contains("Wel"));//true, as because String always casesensitive
        System.out.println(s.contains("wel"));//false, as because String always casesensitive
        System.out.println(s.contains("come"));//true
        System.out.println(s.contains("WEL"));//false, as because String always casesensitive
        System.out.println(s.contains("COME"));//false, as because String always casesensitive


    }
}
