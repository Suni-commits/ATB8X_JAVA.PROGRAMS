package Oct.PatternPrograms;

public class PascalsTraingle {
    public static void main(String[] args){
        int rows=5;
        int num=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num * (i-j)/(j+1);
            }
            System.out.println();
        }

    }
}
