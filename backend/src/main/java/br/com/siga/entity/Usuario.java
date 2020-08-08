package br.com.siga.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity(name="Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, nullable = false)
	private int id;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="usuarioPapel", joinColumns=@JoinColumn(name="usuarioID"), inverseJoinColumns=@JoinColumn(name="papelID"))
	private List<Papel> papeis;	
	
	@Column(name="usuario", nullable = false, unique = true, length= 75)
	private String usuario;
	
	@Column(name="senha", length = 150)
	private String senha;
	
	@Column(name="habilitado")
	private Boolean habilitado;
	
	@Column(name="dataCriacao")
	private Date dataCriacao;
	
	public Usuario() {
		
	}
	
	public Usuario(Usuario usuario)
	{
		super();
		this.setDataCriacao(usuario.getDataCriacao());
		this.setHabilitado(usuario.getHabilitado());
		this.setUsuario(usuario.getUsuario());
		this.setSenha(usuario.getSenha());
		this.setPapeis(usuario.getPapeis());
		this.setId(usuario.getId());	
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
				
	
}
