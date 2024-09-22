package Sept;

public class CompareThree {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c = 45;

        int g= (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);
        System.out.println("The maximum number among three numbers; " + g);


    }
}
