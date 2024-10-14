package Oct.abstractExample;

public class Lab007 {
    public static void main(String[] args){
        double r=4.0;
        double s1=6,s2=9,s3=5.6;

        Circle c=new Circle(r);
        System.out.println("The radius of the circle is : " + r);
        c.calculateArea();
        c.calculatePerimeter();
        Traingle t=new Traingle(s1,s2,s3);

        System.out.println("The sides of the traingle are " + s1 +" ," +s2 + "," +s3);
        t.calculateArea();
         t.calculatePerimeter();

    }
}
