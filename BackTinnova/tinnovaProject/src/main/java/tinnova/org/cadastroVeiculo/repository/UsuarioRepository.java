package tinnova.org.cadastroVeiculo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tinnova.org.cadastroVeiculo.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
