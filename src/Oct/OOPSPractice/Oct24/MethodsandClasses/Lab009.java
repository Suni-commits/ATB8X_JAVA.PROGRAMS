package Oct.OOPSPractice.Oct24.MethodsandClasses;

public class Lab009 {
    public static void main(String[] args) {
        CarModel cm = new CarModel("BMW", 2024, "IWMB");
        System.out.println("Name of the Car is "+cm.getCar_name());
        System.out.println("Model of the car is "+cm.getModel_name());
        System.out.println("Manufacturing year is "+cm.getYear());
    }
}
