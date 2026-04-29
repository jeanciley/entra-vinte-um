package POO.polimorfismo.exemplo3;

public class PaymentSlip extends PaymentMethod{

    @Override
    public void PayFull() {
        System.out.println("Pagando com boleto");
    }
}
