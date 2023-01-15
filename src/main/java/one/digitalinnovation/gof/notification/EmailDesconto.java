package one.digitalinnovation.gof.notification;

import one.digitalinnovation.gof.model.Cliente;

public class EmailDesconto extends NotificacaoViaEmail {


    @Override
    void preNotificacao(Cliente cliente) {
        super.conteudoEmail.setTitulo("Cadastro Realizado - Cliente com Desconto no Frete");
        super.conteudoEmail.setCorpoEmail("Bem Vindo, " + cliente.getNome()+ "! Você mora na região metropolitana ( "+ cliente.getEndereco().getLocalidade() +" ) e por isso recebe um desconto de 50% no frete.");
    }

    @Override
    void posNotificacao(Cliente cliente) {
        System.out.println("Email enviado com sucesso!");
    }
}
