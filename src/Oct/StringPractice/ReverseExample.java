package Oct.StringPractice;

public class ReverseExample {
    public static void main(String[] args)
    {
        String s="Automation";
        String rev="";
        //approach 1 for reverse string using length() and charAt() methods
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("The revese string is :" +rev);
        //Approach 2---by converting string to char array type means without using string methods
        String s1="Selenium";
        String rev1="";
        char a[]=s1.toCharArray();
        for(int i= a.length-1;i>=0;i--)//here length is not string method
        {
            rev1=rev1+a[i];

        }
        System.out.println("The second string after reversed  is : " +rev1);



    }
}
