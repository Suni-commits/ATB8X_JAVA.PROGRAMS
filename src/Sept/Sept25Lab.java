package Sept;

import java.util.Scanner;

public class Sept25Lab {
  public static void main(String[] args){
    //Print the table 10
    int i,num=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number: ");
   num=sc.nextInt();
   for (i=1; i<=num;i++)
   {
     System.out.println(num + "*" +i +"=" +num*i);
   }


  }

}
