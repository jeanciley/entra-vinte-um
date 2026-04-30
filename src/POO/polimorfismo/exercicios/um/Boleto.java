package POO.polimorfismo.exercicios.um;

public class Boleto extends Pagamento{

    @Override
    public void processar() {
        System.out.println("Pagando com boleto.");
    }
}
