package Oct.Enumprograms;

public class Shapes {
    public enum Shape{
        SQUARE,
        TRAIANGLE,
        RECTANGLE,
        CIRCLE

    }

    public static void main(String[] args)
    {
        Shape s=Shape.CIRCLE;
        Shape s1=Shape.TRAIANGLE;
        System.out.println("Shape of the 4th one is : " +s);
        System.out.println("Shape of the 2nd one is : " +s1);

    }
}
