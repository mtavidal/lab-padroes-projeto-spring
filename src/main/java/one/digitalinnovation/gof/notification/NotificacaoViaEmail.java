package one.digitalinnovation.gof.notification;

import one.digitalinnovation.gof.model.Cliente;

public abstract class NotificacaoViaEmail {

    protected ConteudoEmail conteudoEmail = new ConteudoEmail();



    final void enviaNotificacao(){
        System.out.println(conteudoEmail.toString());
    }

    abstract void preNotificacao(Cliente cliente);
    abstract void posNotificacao(Cliente cliente);
    public final void enviaEmail(Cliente cliente){
        conteudoEmail.setCliente(cliente);
        preNotificacao(cliente);
        enviaNotificacao();
        posNotificacao(cliente);
    }
}
