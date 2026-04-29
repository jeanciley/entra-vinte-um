package POO.polimorfismo.exemplo3;

public class Pix extends PaymentMethod{

    @Override
    public void PayFull() {
        System.out.println("Pagando a vista com PIX.");
    }
}
