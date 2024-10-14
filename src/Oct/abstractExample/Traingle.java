package Oct.abstractExample;

public class Traingle extends Shape{
 double side1;
 double side2;
 double side3;

 public Traingle(double side1,double side2, double side3){
     this.side1=side1;
     this.side2=side2;
     this.side3=side3;


 }

    @Override
    void calculateArea() {
        double s=(side1+side2+side3)/2;
      System.out.println( Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));

    }

    @Override
    void calculatePerimeter() {
            System.out.println(side1+side2+side3);
    }




}
