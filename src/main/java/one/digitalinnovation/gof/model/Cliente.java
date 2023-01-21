package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.strategy.DescontoStrategy;

import javax.persistence.*;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	private DescontoStrategy descontoStrategy;

	public DescontoStrategy getDescontoStrategy() {
		return descontoStrategy;
	}

	public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
		this.descontoStrategy = descontoStrategy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
