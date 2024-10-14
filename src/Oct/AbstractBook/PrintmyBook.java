package Oct.AbstractBook;

public class PrintmyBook extends Book {

    @Override
    public String getDetails() {
        return name + ", "+ author +", "+ price;
    }

    public PrintmyBook(String name, String author, double price){

      super(name,author,price);

    }
}
