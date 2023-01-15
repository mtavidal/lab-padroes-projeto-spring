package one.digitalinnovation.gof.request;

import one.digitalinnovation.gof.strategy.DescontoStrategy;

public class ClienteDTO {

    private String nome;
    private String cep;
    private DescontoStrategy descontoStrategy;

    public DescontoStrategy getDescontoStrategy() {
        return descontoStrategy;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
