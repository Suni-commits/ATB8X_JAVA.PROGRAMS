package Oct.OOPSPractice;

public class Vehicle_Class {
    protected String brand="Ford";

    public void display()
    {
        System.out.println("This  is displaying my brand name");
    }
   static class Car extends Vehicle_Class{
        private String model_name="Mostage";

        public void display(){
            super.display();
            System.out.println("This is sub class which is derived from super class");
        }
    }

    public static void main(String[] args){
        Car c=new Car();
        System.out.println("Name of the brand is "+c.brand);
        System.out.println("sub name of the car is  "+c.model_name);
        c.display();


    }
}
