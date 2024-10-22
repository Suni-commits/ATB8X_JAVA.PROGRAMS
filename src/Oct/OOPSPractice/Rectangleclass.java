package Oct.OOPSPractice;

public class Rectangleclass {
    int height;
    int width;
     Rectangleclass(int height, int width){
         this.height=height;
         this.width=width;

     }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void getArea(){
         System.out.println(width * height);
    }
    public void getPerimeter(){
    System.out.println(2*(width+height));

    }
    public static void main(String[] args){
         Rectangleclass rc=new Rectangleclass(26,28);
       rc.getArea();
       rc.getPerimeter();

    }
}
