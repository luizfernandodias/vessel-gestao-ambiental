package br.com.siga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siga.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUsuario(String usuario);
}
