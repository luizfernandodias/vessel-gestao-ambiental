package br.com.siga.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="Condicionante")
public class Condicionante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, nullable = false)
	private Integer id;
	
	@Column(name="descricao", nullable = false, length=500)
	private String detalhamento;
	
	@Column(name="observacao", nullable = false, length=250)
	private String observacao;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipoCondicionanteId", referencedColumnName = "id")
	private TipoCondicionante tipoCondicionante;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoCondicionante getTipoCondicionante() {
		return tipoCondicionante;
	}

	public void setTipoCondicionante(TipoCondicionante tipoCondicionante) {
		this.tipoCondicionante = tipoCondicionante;
	}
	
		
}
