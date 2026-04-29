package POO.heranca.exemplo3;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Livro", 59.99, "Jean");
        Product product = new Product("Coisa", 79.99);

        book.showInformation();
        System.out.println("-----------------------------");
        product.showInformation();
    }
}
