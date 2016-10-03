package br.com.mario.abaco.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Analise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String proposito;
	private String fronteira;
	private String escopo;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate data;
	
	@Enumerated(EnumType.STRING)
	private TipoContagem tipoDeContagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}

	public String getFronteira() {
		return fronteira;
	}

	public void setFronteira(String fronteira) {
		this.fronteira = fronteira;
	}

	public String getEscopo() {
		return escopo;
	}

	public void setEscopo(String escopo) {
		this.escopo = escopo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public TipoContagem getTipoDeContagem() {
		return tipoDeContagem;
	}

	public void setTipoDeContagem(TipoContagem tipoDeContagem) {
		this.tipoDeContagem = tipoDeContagem;
	}

}