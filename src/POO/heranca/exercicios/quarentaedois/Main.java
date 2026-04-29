package POO.heranca.exercicios.quarentaedois;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Jean", "123456789", 10_000, 2_000, 1_200);
        manager.calculatePayment();

        System.out.println("--------------");

        Salesmen salesmen = new Salesmen("Luigi", "987654321", 3_000, 800, 1_200, 2_500);
        salesmen.calculatePayment();

        System.out.println("--------------");

        Intern intern = new Intern("Fernando", "333222111", 1_500, 600);
        intern.calculatePayment();
    }
}
