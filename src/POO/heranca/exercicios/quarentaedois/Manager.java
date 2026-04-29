package POO.heranca.exercicios.quarentaedois;

public class Manager extends Employee {
    private double bonus;
    private double assistance;

    public Manager(String name, String cpf, double baseSalary, double bonus, double assistance) {
        super(name, cpf, baseSalary);
        this.bonus = bonus;
        this.assistance = assistance;
    }

    @Override
    public void calculatePayment() {
        System.out.println("Cargo: Gerente");
        super.calculatePayment();
        System.out.println("Pagamento: R$ " + (super.getBaseSalary() + this.bonus + this.assistance));
    }
}
