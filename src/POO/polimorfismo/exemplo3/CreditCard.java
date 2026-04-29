package POO.polimorfismo.exemplo3;

public class CreditCard extends PaymentMethod{

    @Override
    public void PayFull() {
        System.out.println("Pagando a vista com cartão de crédito.");
    }
}
