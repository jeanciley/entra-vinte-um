package POO.polimorfismo.exercicios.um;

public class Pix extends Pagamento{

    @Override
    public void processar() {
        System.out.println("Pagando com PIX.");
    }
}
