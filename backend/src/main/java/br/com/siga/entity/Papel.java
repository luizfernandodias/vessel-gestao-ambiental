package br.com.siga.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

@Entity(name="Papel")
public class Papel implements GrantedAuthority{

	private static final long serialVersionUID = 1L;
	
	public Papel(String nomePapel) {
		this.nomePapel = nomePapel;		
	}
	
	public Papel()
	{
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, nullable = false)
	private int id;
	
	@Column(name="nomePapel", length = 50)
	private String nomePapel;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomePapel() {
		return nomePapel;
	}

	public void setNomePapel(String nomePapel) {
		this.nomePapel = nomePapel;
	}

	@Override
	public String getAuthority() {
		return this.nomePapel;
	}

}
