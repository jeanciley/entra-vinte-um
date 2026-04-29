package POO.basico.exercicios;

public class Main {
    public static void main(String[] args) {

        //Aluno aluno1 = new Aluno("Jean", 30);
//
        //Aluno aluno2 = new Aluno("Luigi", 25);
//
        //aluno1.estudar();


        ContaBancaria conta = new ContaBancaria("Jean", "123456");

        conta.depositar(1500);
        System.out.println(conta.getSaldo());

        conta.sacar(1000);
        System.out.println(conta.getSaldo());

        conta.sacar(501);
        System.out.println(conta.getSaldo());
    }
}
