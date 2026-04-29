package POO.encapsulamento.exercicios.oito;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
}
