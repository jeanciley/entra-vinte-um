package POO.polimorfismo.exemplo2;

public class Salesmen extends Employee {
    private double salesCommission;

    public Salesmen(double salesCommission) {
        this.salesCommission = salesCommission;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        if (salesCommission > 0)
            this.salesCommission = salesCommission;
    }

    @Override
    public double calculatePayment() {
        return super.getBaseSalary() + getSalesCommission();
    }
}
