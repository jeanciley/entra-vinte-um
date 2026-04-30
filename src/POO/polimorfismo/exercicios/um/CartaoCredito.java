package POO.polimorfismo.exercicios.um;

public class CartaoCredito extends Pagamento{

    @Override
    public void processar() {
        System.out.println("Pagando com cartão de crédito.");
    }
}
