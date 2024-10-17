package Oct.Enumprograms;

public class Directions {
    public enum direction{
        NORTH,
        SOUTH,
        WEST,
        EAST

    }
    public static void main(String[] args){
        direction d1=direction.SOUTH;
        direction d4=direction.EAST;
        System.out.println(d1);
        System.out.println(d4);
    }

}
