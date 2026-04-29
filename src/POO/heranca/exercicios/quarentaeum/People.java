package POO.heranca.exercicios.quarentaeum;

public class People {
    private String name;
    private int age;
    private String email;

    public People(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void showInformation(){
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("E-mail: " + this.email);
    }
}
