package br.com.siga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.siga.dominio.DominioPapel;
import br.com.siga.entity.Usuario;
import br.com.siga.repository.PapelRepository;
import br.com.siga.repository.UsuarioRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Secured({DominioPapel.ROLE_ADMIN})
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        usuario = this.usuarioRepository.save(usuario);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

    @Secured({DominioPapel.ROLE_ADMIN})
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<Usuario> edit(@RequestBody Usuario usuario){
        usuario = this.usuarioRepository.save(usuario);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

    @Secured({DominioPapel.ROLE_CLIENTE, DominioPapel.ROLE_ADMIN})
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Usuario> listUser(){
        return this.usuarioRepository.findAll();
    }

}
