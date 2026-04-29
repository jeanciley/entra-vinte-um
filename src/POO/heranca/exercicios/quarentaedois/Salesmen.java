package POO.heranca.exercicios.quarentaedois;

public class Salesmen extends Employee {
    private double bonus;
    private double assistance;
    private double salesCommission;

    public Salesmen(String name, String cpf, double baseSalary, double bonus, double assistance, double salesCommission) {
        super(name, cpf, baseSalary);
        this.bonus = bonus;
        this.assistance = assistance;
        this.salesCommission = salesCommission;
    }

    @Override
    public void calculatePayment() {
        System.out.println("Cargo: Vendedor");
        super.calculatePayment();
        System.out.println("Pagamento: R$ " + (super.getBaseSalary() + this.bonus + this.assistance + this.salesCommission));
    }
}
