package POO.polimorfismo.dois;

public class Cliente implements Notificacao {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando notificação para o cliente: " + mensagem);
    }
}
