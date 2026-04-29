package POO.heranca.exercicios.quarentaeum;

public class Teacher extends People {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String email, String subject, double salary) {
        super(name, age, email);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Disciplina: " + this.subject);
        System.out.println("Salário: R$ " + this.salary);
    }
}
