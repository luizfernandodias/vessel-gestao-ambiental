package br.com.siga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.siga.details.UsuarioDetails;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{


	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByLogin(login);
		if (usuario == null) {
			throw new UsernameNotFoundException(String.format("Usuário não existe!", login));
		}
		return new UsuarioDetails(usuario);
	}

}
