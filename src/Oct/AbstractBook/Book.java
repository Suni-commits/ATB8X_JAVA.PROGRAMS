package Oct.AbstractBook;


abstract class Book {
    String name;
    String author;
    double price;
    public abstract String getDetails();
    public Book(String name, String author,double price)
    {
        this.name=name;
        this.author=author;
        this.price=price;
    }
}
