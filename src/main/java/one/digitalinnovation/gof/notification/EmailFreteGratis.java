package one.digitalinnovation.gof.notification;

import one.digitalinnovation.gof.model.Cliente;

public class EmailFreteGratis extends NotificacaoViaEmail {

    @Override
    void preNotificacao(Cliente cliente) {
        super.conteudoEmail.setTitulo("Cadastro Realizado - Cliente com Frete Gratuito");
        super.conteudoEmail.setCorpoEmail("Bem Vindo, " + cliente.getNome()+ "! Você mora na capital ( "+ cliente.getEndereco().getLocalidade() +" ) e por isso tem frete gratuito.");
    }

    @Override
    void posNotificacao(Cliente cliente) {
        System.out.println("Email enviado com sucesso!");
    }
}
