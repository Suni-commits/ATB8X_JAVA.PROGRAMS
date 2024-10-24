package Oct.OOPSPractice.Oct24.MethodsandClasses;

public class Pattern {
    //method without parameterised constructor
    public void display(){
        for(int i=0;i<10;i++){
            System.out.println("*");
        }
    }
    //method with parameterised
    public void display(char symbol){
        for(int i=0;i<10;i++) {
            System.out.println(symbol);
        }
    }
}
