package br.com.siga.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Licenca")
public class Licenca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, nullable = false)
	private Integer id;

	private String nomeEmpreendimento;
	
	private Date dataValidade;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEmpreendimento() {
		return nomeEmpreendimento;
	}

	public void setNomeEmpreendimento(String nomeEmpreendimento) {
		this.nomeEmpreendimento = nomeEmpreendimento;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
		
}
