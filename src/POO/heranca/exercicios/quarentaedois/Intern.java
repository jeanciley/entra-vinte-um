package POO.heranca.exercicios.quarentaedois;

public class Intern extends Employee {
    private double assistance;

    public Intern(String name, String cpf, double baseSalary, double assistance) {
        super(name, cpf, baseSalary);
        this.assistance = assistance;
    }

    @Override
    public void calculatePayment() {
        System.out.println("Cargo: Estagiário");
        super.calculatePayment();
        System.out.println("Pagamento: R$ " + (super.getBaseSalary() + this.assistance));
    }
}
