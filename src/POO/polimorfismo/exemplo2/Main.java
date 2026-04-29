package POO.polimorfismo.exemplo2;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager();
        Employee salesmen = new Salesmen(1_200d);
        Employee comumEmployee = new Employee();

        manager.setBaseSalary(5_000d);
        salesmen.setBaseSalary(3_000d);
        comumEmployee.setBaseSalary(2_000);


        System.out.println(manager.calculatePayment());
        System.out.println(salesmen.calculatePayment());
        System.out.println(comumEmployee.calculatePayment());
    }
}
