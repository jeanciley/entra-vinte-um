package POO.polimorfismo.exemplo2;

public class Employee {

    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
    }

    public double calculatePayment(){
        return getBaseSalary();
    }
}
