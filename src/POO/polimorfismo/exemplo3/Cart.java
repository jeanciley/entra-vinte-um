package POO.polimorfismo.exemplo3;

public class Cart {

    private double purchasePrice;

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void makePurchase(PaymentMethod paymentMethod){
        paymentMethod.PayFull();
        System.out.println("Compra realizada com sucesso!");
    }
}
