package br.com.siga.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TipoLicenca")
public class TipoLicenca implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="tipoLicenca")
	private String tipoLicenca;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoLicenca() {
		return tipoLicenca;
	}

	public void setTipoLicenca(String tipoLicenca) {
		this.tipoLicenca = tipoLicenca;
	}
	
	
}
