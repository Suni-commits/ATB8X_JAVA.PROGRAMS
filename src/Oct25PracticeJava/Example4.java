package Oct25PracticeJava;

public class Example4 {
    public static void main(String[] args){
        //Calculate the sum of  the arrays
        int[] myArray={45,87,49,61};
        int sum=0;

        for (int i=0;i<myArray.length;i++){
            sum +=myArray[i];
        }
        System.out.println("The sum of array elements = " +sum);
    }
}
