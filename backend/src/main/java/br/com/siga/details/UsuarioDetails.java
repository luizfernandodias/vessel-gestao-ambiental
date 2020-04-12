package br.com.siga.details;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.siga.entity.Usuario;

public class UsuarioDetails extends Usuario implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	
	public UsuarioDetails(Usuario usuario) {
		super();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.usuario.getPapeis();
	}

	@Override
	public String getPassword() {
		return this.usuario.getSenha();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.usuario.getUsuario();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		return this.usuario.getHabilitado();
	}

}
