package br.com.vessel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="Telefone")
public class Telefone implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="codigoPais")
	private String codigoPais;
	
	@Column(name="ddd")
	private String ddd;
			
	@Column(name="numero")
	private String numero;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "tipoTelefoneID", nullable = false)
	private TipoTelefone tipoTelefone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
