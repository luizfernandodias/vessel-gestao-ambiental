package br.com.siga.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import br.com.siga.details.UsuarioDetails;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{


	private UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = this.usuarioRepository.findByUsuario(username);
		if(usuario == null) {
			throw new UsernameNotFoundException(String.format("Usuário não encontrado!",username));
		}
		return new UsuarioDetails(usuario);
	}
	
}
