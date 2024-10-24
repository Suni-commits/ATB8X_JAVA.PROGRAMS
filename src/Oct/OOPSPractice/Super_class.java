package Oct.OOPSPractice;

public class Super_class {
    int n=20;
   public void display()
    {
        System.out.println("This display is from the super calss");
    }
    static class sub_class extends Super_class{
        int n=10;
      public  void display(){
            System.out.println("This display is sub class which is extends from super class");
        }
        public void my_method(){
            sub_class sb=new sub_class();
            sb.display();
            super.display();
            System.out.println("The number of sub class is " +sb.n);
            System.out.println("The number of super calss is "  + super.n);

        }

    }
    public static void main(String[] args){
    sub_class sub=new sub_class();
    sub.my_method();


    }
}
