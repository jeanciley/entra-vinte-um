package POO.polimorfismo.exemplo2;

public class Manager extends Employee{

    @Override
    public double calculatePayment() {
        return super.getBaseSalary() + 1_000d;
    }
}
