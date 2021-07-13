package tinnova.org.cadastroVeiculo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_dados")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nomeVeiculo;

	@NotNull
	private String nomeMarca;

	@NotNull
	private Long anoVeiculo;

	@NotNull
	private String descricao;

	@NotNull
	private Boolean statusVenda;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	public Long getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(Long anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	public Boolean getStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(Boolean statusVenda) {
		this.statusVenda = statusVenda;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescricao() {
		return descricao;
	}

	public Movie(Long id, String nomeVeiculo, String nomeMarca, Long anoVeiculo, String descricao, Boolean statusVenda,
			Date date) {
		this.id = id;
		this.nomeVeiculo = nomeVeiculo;
		this.nomeMarca = nomeMarca;
		this.anoVeiculo = anoVeiculo;
		this.descricao = descricao;
		this.statusVenda = statusVenda;
		this.date = date;
	}

}
