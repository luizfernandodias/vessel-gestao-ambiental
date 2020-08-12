package br.com.siga.components;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.siga.dominio.DominioPapel;
import br.com.siga.entity.Papel;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.PapelRepository;
import br.com.siga.repository.UsuarioRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PapelRepository papelRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {

        List<Usuario> usuarios = usuarioRepository.findAll();

        if (usuarios.isEmpty()) {
            createUser("admin", "admin", passwordEncoder().encode("admin"), DominioPapel.ROLE_ADMIN);
            createUser("cliente", "cliente", passwordEncoder().encode("admin"), DominioPapel.ROLE_CLIENTE);
        }

    }

    public void createUser(String name, String email, String password, String roleName) {

        Papel papel = new Papel(roleName);

        this.papelRepository.save(papel);
        Usuario usuario = new Usuario();
        usuario.setLogin(name);
        usuario.setPapeis(Arrays.asList(papel));
        usuario.setSenha(password);
        usuarioRepository.save(usuario);
    }
    
    

}