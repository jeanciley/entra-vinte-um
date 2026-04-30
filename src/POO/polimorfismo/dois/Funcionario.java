package POO.polimorfismo.dois;

public class Funcionario implements Notificacao{

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando notificação para funcionário: " + mensagem);
    }
}
