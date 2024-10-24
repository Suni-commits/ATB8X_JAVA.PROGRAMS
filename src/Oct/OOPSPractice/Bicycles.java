package Oct.OOPSPractice;

public class Bicycles {
    String brand_name="";
    int tyres;
    boolean is_female_cycle;

    Bicycles(String brand_name,int tyres,boolean is_female_cycle){
        this.brand_name=brand_name;
        this.tyres=tyres;
        this.is_female_cycle=is_female_cycle;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public boolean isIs_female_cycle() {
        return is_female_cycle;
    }

    public void setIs_female_cycle(boolean is_female_cycle) {
        this.is_female_cycle = is_female_cycle;
    }
    public static void main(String[] args){
        Bicycles
         bi=new Bicycles("Hero",2,false);

        System.out.println("What is the brand of the cycle ? "+bi.getBrand_name());
        System.out.println("How many wheels does it have? "+bi.getTyres());
        System.out.println("Does it ladies cycle? "+bi.isIs_female_cycle());
    }
}
