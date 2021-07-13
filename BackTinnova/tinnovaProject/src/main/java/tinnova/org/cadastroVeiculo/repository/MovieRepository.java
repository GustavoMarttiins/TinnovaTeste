package tinnova.org.cadastroVeiculo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tinnova.org.cadastroVeiculo.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	public List<Movie> findAllByDescricaoContainingIgnoreCase( String descricao);
}
