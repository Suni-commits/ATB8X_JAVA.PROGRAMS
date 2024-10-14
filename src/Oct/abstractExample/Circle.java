package Oct.abstractExample;

public class Circle extends Shape {
 double radius;
 public  Circle(double radius){
     this.radius=radius;

 }
    @Override
    void calculateArea() {
        System.out.println( Math.PI * radius * radius);
    }

    @Override
    void calculatePerimeter() {
        System.out.println( 2 * Math.PI * radius);
    }
}
