package Oct;

public class Lab0024 {
    // lamp switch on and off
    boolean ison;
    void istrunon()
    {
        ison=true;
        System.out.println("Light on : "+ison);
    }
    void isturnoff()
    {
        ison=false;
        System.out.println("Light off : "+ison);

    }
    public static void main(String[] args)
    {
        Lab0024 lamp=new Lab0024();
        Lab0024 lamp1=new Lab0024();
        lamp.istrunon();
        lamp1.isturnoff();



    }
}
