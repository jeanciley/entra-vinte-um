package POO.basico.exercicios;

public class ContaBancaria {

    String nomeDono;
    String numeroConta;
    double saldo;

    public ContaBancaria(String nomeDono, String numeroConta) {
        this.nomeDono = nomeDono;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
