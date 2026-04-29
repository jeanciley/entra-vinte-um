package POO.heranca.exercicios.quarentaedois;

public class Employee {
    private String name;
    private String cpf;
    private double baseSalary;

    public Employee(String name, String cpf, double baseSalary) {
        this.name = name;
        this.cpf = cpf;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void calculatePayment(){
        System.out.println("Nome: " + this.name);
    }
}
