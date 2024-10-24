package Oct.OOPSPractice.Oct24.MethodsandClasses;

public class Lamp {
    boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("The switch off the light "+ isOn);
    }
    void turnOff(){
        isOn=false;
        System.out.println("The switch off the light " + isOn);
    }
    public static void main(String[] args){
        Lamp l=new Lamp();
        l.turnOn();
        l.turnOff();
    }
}
