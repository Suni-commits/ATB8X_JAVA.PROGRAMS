package Oct.OOPSPractice;

public class DefaultCat {
    private String cat_name;
    private int age;

    DefaultCat(String cat_name,int age)
    {
        this.cat_name=cat_name;
        this.age=age;
    }
    String getCat_name(){
        return cat_name;
    }
    int getAge(){
        return age;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
