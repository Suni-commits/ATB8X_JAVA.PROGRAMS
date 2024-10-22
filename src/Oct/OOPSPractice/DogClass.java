package Oct.OOPSPractice;

public class DogClass {
    String name="";
    String breed="";

    DogClass(String name,String breed){
        this.name=name;
        this.breed=breed;

    }
String getName(){
        return name;
    }
String getBreed(){
        return breed;
}
public void setName(String name)
{
    this.name=name;
}
public void setBreed(String breed){
        this.breed=breed;
}

    public static void main(String[] args){
        DogClass dc=new DogClass("Remo","German Shepherd");
        System.out.println(dc.getName());
        System.out.println(dc.getBreed());

    }
}
