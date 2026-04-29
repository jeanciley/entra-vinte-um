package POO.heranca.exemplo3;

public class Book extends Product{

    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Autor: " + this.author);
    }
}
