package one.digitalinnovation.gof.notification;

import one.digitalinnovation.gof.model.Cliente;

public class EmailSemDesconto extends NotificacaoViaEmail {


    @Override
    void preNotificacao(Cliente cliente) {
        super.conteudoEmail.setTitulo("Cadastro Realizado");
        super.conteudoEmail.setCorpoEmail("Bem Vindo, " + cliente.getNome()+ ".");
    }

    @Override
    void posNotificacao(Cliente cliente) {
        System.out.println("Email enviado com sucesso!");
    }
}
