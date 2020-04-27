package br.com.siga.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="Endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, nullable = false)
	private Integer id;

	@Column(name="cep", nullable = false, length= 15)
	private String cep;
	
	@Column(name="bairro", nullable = false, length= 200)
	private String bairro;
	
	@Column(name="logradouro", nullable = false, length= 200)
	private String logradouro;
	
	@Column(name="numero", nullable = false)
	private Integer numero;
	
	@Column(name="endereco", nullable = false, length= 200)
	private String endereco;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cidadeId", referencedColumnName = "id")
	private Cidade cidade;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estadoId", referencedColumnName = "id")
	private Estado estado;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paisId", referencedColumnName = "id")
	private Pais pais;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
			
}
