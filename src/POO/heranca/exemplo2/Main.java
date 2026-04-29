package POO.heranca.exemplo2;

public class Main {
    public static void main(String[] args) {
        Salesmen salesmen = new Salesmen("Jean", 100_000, 500_000);

        System.out.println("O salário total de " + salesmen.getName() + " é: R$" + salesmen.getPayment());
    }




}
