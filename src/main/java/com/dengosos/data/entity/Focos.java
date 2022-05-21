package com.dengosos.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dengosos.data.dto.FocosDTO;


@Entity
public class Focos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Date data;
	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	
	public Focos() {
		super();
	}

	public Focos(Integer id, String descricao, Date data, String cep, String logradouro, String bairro,
			String localidade, String uf) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public FocosDTO getDTO() {
		return new FocosDTO(getId(),
				getDescricao(),
				getData(),
				getCep(),
				getLogradouro(),
				getBairro(),
				getLocalidade(),
				getUf());
	}

}
