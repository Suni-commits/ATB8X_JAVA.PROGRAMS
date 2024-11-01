package Oct.PatternPrograms;

public class NumberDiamondPattern {
    public static void main(String[] args){
        int rows=5;
        //upper half
       for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //lower half
      for(int i=rows-1;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
