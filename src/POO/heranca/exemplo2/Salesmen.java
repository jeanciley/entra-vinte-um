package POO.heranca.exemplo2;

public class Salesmen extends Employee {
    private double salesCommission;

    public Salesmen(String name, double basePayment, double salesCommission) {
        super(name, basePayment);
        this.salesCommission = salesCommission;
    }

    public double getPayment() {
        return this.getBasePayment() + salesCommission;
    }
}
