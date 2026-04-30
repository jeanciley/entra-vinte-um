package POO.polimorfismo.exercicios.dois;

public class Fornecedor implements Notificacao{

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando mensagem para fornecedor: " + mensagem);
    }
}
