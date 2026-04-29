package POO.heranca.exercicios.quarentaeum;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jean", 30, "jean@senac.com.br", "12345", "ADS");

        student.showInformation();
        System.out.println("----------------");

        Teacher teacher = new Teacher("Fernando", 24, "fernando@senac.com", "Java", 15_000);
        teacher.showInformation();
    }
}
