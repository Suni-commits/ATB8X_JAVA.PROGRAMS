package Oct25PracticeJava;

public class Example10 {
    public static void main(String[] args){
        //Find the smallest number from array
        int[] i={10,8,4,9,11,7};
        int l=i[0];

        for(int j:i)
        {
            if(l>j){
                l=j;
            }
        }
        System.out.println(l);
    }
}
