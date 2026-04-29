package POO.polimorfismo.exemplo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cart cart = new PaymentMethod();

        System.out.println("Bem-vindo!");
        System.out.print("Digite o valor da compra: R$");
        cart.setPurchasePrice(scanner.nextDouble());

        System.out.print("Escolha a forma de pagamento:\n" +
                "[1] - PIX\n" +
                "[2] - Boleto\n" +
                "[3] - Cartão de crédito\n" +
                "-> ");
        int option = scanner.nextInt();



        switch (option){
            case 1: {
                cart.makePurchase(new Pix());
                break;
            }
            case 2: {
                cart.makePurchase(new PaymentSlip());
                break;
            }
            case 3: {
                cart.makePurchase((new CreditCard()));
                break;
            }
            default:
                throw new IllegalArgumentException();
        }

        System.out.println(cart.getPurchasePrice());
    }
}
