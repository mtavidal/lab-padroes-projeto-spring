package one.digitalinnovation.gof.notification;

import one.digitalinnovation.gof.model.Cliente;

public class ConteudoEmail {
    private String titulo;
    private Cliente cliente;
    private String corpoEmail;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCorpoEmail() {
        return corpoEmail;
    }

    public void setCorpoEmail(String corpoEmail) {
        this.corpoEmail = corpoEmail;
    }

    @Override
    public String toString() {
        return "ConteudoEmail{" +
                "titulo='" + titulo + '\'' +
                ", corpoEmail='" + corpoEmail + '\'' +
                '}';
    }
}
