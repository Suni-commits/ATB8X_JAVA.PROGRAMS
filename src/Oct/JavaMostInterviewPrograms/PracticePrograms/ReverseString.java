package Oct.JavaMostInterviewPrograms.PracticePrograms;

public class ReverseString {
     String reverseText(String str){
        String rev="";
        for(int i=str.length()-1;i>0;i--){
            rev +=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        ReverseString rs=new ReverseString();
           String s= rs.reverseText("Automation");
       System.out.println("After reversed the string is " + s);
    }
}
