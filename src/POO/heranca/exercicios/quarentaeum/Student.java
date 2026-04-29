package POO.heranca.exercicios.quarentaeum;

public class Student extends People {
    private String register;
    private String course;

    public Student(String name, int age, String email, String register, String course) {
        super(name, age, email);
        this.register = register;
        this.course = course;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Matrícula: " + this.register);
        System.out.println("Curso: " + this.course);
    }
}
