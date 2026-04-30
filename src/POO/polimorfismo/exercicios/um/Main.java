package POO.polimorfismo.exercicios.um;

public class Main {
    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new Boleto();
        pagamentos[1] = new Pix();
        pagamentos[2] = new CartaoCredito();

        pagamentos[0].processar();
        pagamentos[1].processar();
        pagamentos[2].processar();

    }
}
