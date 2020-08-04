package br.com.siga.details;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.siga.entity.Papel;
import br.com.siga.entity.Usuario;

public class UsuarioDetails implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private List<Papel> papeis;	
	private String login;
	private String senha;
	private Boolean habilitado;
	private Date dataCriacao;
	
	
	public UsuarioDetails(Usuario usuario) {
		this.id = usuario.getId();
		this.papeis = usuario.getPapeis();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
		this.habilitado = usuario.getHabilitado();
		this.dataCriacao = usuario.getDataCriacao();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.papeis;
	}

	public String getLogin() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getPassword() {
        return this.senha;
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


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String getUsername() {
		return this.login;
	}
	
	public void setUsername(String username) {
		this.login = username;
	}
        
}
