package Oct25PracticeJava;

public class Example8 {
    public static void main(String[] args){
        //Find the average of the array elements
        int i[]={6,9,10,24,18,5};
        int length,sum=0,avg;
        length=i.length;
        for(int j:i)
        {
            sum+=j;
        }
        avg=sum/length;
        System.out.println("The average of the number = "+avg);
    }
}
