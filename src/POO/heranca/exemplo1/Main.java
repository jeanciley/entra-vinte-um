package POO.heranca.exemplo1;

import POO.encapsulamento.exemplo1.Pessoa;

public class Main {
    public static void main(String[] args) {
        People people = new People("Jean", "06196688901", 30);
        Student student = new Student("Luigi", "123456789", 25, "12345");

        student.introduce();


    }
}
