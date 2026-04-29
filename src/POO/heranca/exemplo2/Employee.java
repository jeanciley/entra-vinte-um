package POO.heranca.exemplo2;

public class Employee {
    private String name;
    private double basePayment;

    public Employee(String name, double basePayment) {
        this.name = name;
        this.basePayment = basePayment;
    }

    public String getName() {
        return name;
    }

    public double getBasePayment() {
        return basePayment;
    }
}
