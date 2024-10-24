package Oct.OOPSPractice.Oct24.MethodsandClasses;

public class CarModel {
   private String Car_name;
   private int year;
    private String model_name;

    CarModel(String Car_name,int year,String model_name)
    {
        this.Car_name=Car_name;
        this.year=year;
        this.model_name=model_name;
    }
    public String getCar_name() {
        return Car_name;
    }

    public int getYear() {
        return year;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setCar_name(String car_name) {
        Car_name = car_name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
}
