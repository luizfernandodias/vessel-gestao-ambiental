package br.com.sigaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.siga.details.UsuarioDetails;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.UsuarioRepository;

public class UsuarioService implements UserDetailsService{

	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = UsuarioRepository.findByUsuario(username);
		if(usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new UsuarioDetails(usuario);

	}

}
