package Oct25PracticeJava;

public class Example9 {
    public static void main(String[] args){
        //How to find smallest element in the an array
        int ages[] ={24,81,67,10,81};
        int lowestAge=ages[0];
        for(int age:ages){
            if(lowestAge > age){
                lowestAge=age;
            }
        }
        System.out.println("The lowest age in the array = " + lowestAge);
    }
}
