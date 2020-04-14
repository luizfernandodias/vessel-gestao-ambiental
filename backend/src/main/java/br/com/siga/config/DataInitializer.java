package br.com.siga.config;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import br.com.siga.entity.Papel;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.PapelRepository;
import br.com.siga.repository.UsuarioRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PapelRepository papelRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<Usuario> lista = usuarioRepository.findAll();
		
		if(lista != null && lista.isEmpty())
		{
			this.criarUsuario("admin", this.passwordEncoder.encode("admin"),"PAPEL_ADMIN");
			this.criarUsuario("cliente",this.passwordEncoder.encode("cliente"),"PAPEL_CLIENTE");
		}
		
	}
	
	private void criarUsuario(String nome, String senha, String nomePapel) {
		Papel papel = new Papel(nomePapel);
		this.papelRepository.save(papel);
		
		Usuario usuario = new Usuario();
		usuario.setDataCriacao(new Date());
		usuario.setHabilitado(Boolean.TRUE);
		usuario.setSenha(senha);
		usuario.setPapeis(Arrays.asList(papel));
		usuario.setUsuario(nome);
		this.usuarioRepository.save(usuario);
		
	}
	

}
