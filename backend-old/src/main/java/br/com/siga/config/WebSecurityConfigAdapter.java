package br.com.siga.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.siga.details.UsuarioDetails;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.UsuarioRepository;

@Configuration
@EnableWebSecurity(debug=true)
public class WebSecurityConfigAdapter extends WebSecurityConfigurerAdapter {

	@Bean  
    public static BCryptPasswordEncoder passwordEncoder() {  
        return new BCryptPasswordEncoder();  
    }

	@Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
        return authenticationManagerBean();
    }
    
    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder builder, UsuarioRepository usuarioRepository) throws Exception {
        if (usuarioRepository.count() == 0) {
            Usuario usuario = new Usuario();
            usuario.setUsuario("admin");
            usuario.setSenha(passwordEncoder().encode("admin"));
            usuario.setDataCriacao(new Date());
            usuarioRepository.save(usuario);
        }
        System.out.println(usuarioRepository.count());
        builder.userDetailsService(usuario -> new UsuarioDetails(usuarioRepository.findByUsuario("admin"))).passwordEncoder(passwordEncoder());        
        
    }
    
    
    
}