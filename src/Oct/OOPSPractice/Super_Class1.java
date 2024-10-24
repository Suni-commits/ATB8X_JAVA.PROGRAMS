package Oct.OOPSPractice;

public class Super_Class1 {
    int age=35;
    Super_Class1(int age)
    {
        this.age=age;
    }
    public void getAge()
    {
        System.out.println("This is age of the super class "+ age);
    }
   static class Sub_Class1 extends Super_Class1{
        Sub_Class1(int age){
            super(age);
        }
        @Override
        public void getAge() {
            super.getAge();
        }

    }

    public static void main(String[] args){
        Sub_Class1 sb=new Sub_Class1(45);
        sb.getAge();

    }
}
