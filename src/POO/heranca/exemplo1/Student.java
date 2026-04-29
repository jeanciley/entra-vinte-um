package POO.heranca.exemplo1;

public class Student extends People {
    private String register;

    public Student(String nome, String cpf, int idade, String register) {
        super(nome, cpf, idade);
        this.register = register;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public void introduce(){
        System.out.println("Meu nome é " + super.getName() + " e sou aluno!");
    }
}
