package POO.polimorfismo.dois;

public class Principal {
    public static void main(String[] args) {

        Notificacao[] notificacao = new Notificacao[3];

        notificacao[0] = new Cliente();
        notificacao[1] = new Fornecedor();
        notificacao[2] = new Funcionario();

        notificacao[0].enviarNotificacao("mensagem cliente");
        notificacao[1].enviarNotificacao("mensagem fornecedor");
        notificacao[2].enviarNotificacao("mensagem funcionario");
    }
}
