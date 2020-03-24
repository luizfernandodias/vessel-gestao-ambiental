package br.com.vessel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vessel.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUsuario(String usuario);
}
