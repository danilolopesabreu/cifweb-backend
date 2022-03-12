package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

import javax.json.bind.annotation.JsonbTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CifComplementoDto {

	private CifComplementoDtoId id;
	
//	@JsonBackReference
//	@JsonManagedReference 
	@JsonBackReference
	@JsonbTransient
	private CifServicoDto cifServicoByFkD02tb201D02tb200Vnclr;
	
	@JsonIgnoreProperties("cifComplementosForFkD02tb201D02tb200Vnclr")
	private CifServicoDto cifServicoByFkD02tb201D02tb200Vncdo;
	
	private TipoVinculoDto tipoVinculo;
	private char icMandatorio;
	private Date fimVigencia;
	private String coUsuario;

	public CifComplementoDtoId getId() {
		return id;
	}

	public void setId(CifComplementoDtoId id) {
		this.id = id;
	}

	public CifServicoDto getCifServicoByFkD02tb201D02tb200Vnclr() {
		return cifServicoByFkD02tb201D02tb200Vnclr;
	}

	public void setCifServicoByFkD02tb201D02tb200Vnclr(CifServicoDto cifServicoByFkD02tb201D02tb200Vnclr) {
		this.cifServicoByFkD02tb201D02tb200Vnclr = cifServicoByFkD02tb201D02tb200Vnclr;
	}

	public CifServicoDto getCifServicoByFkD02tb201D02tb200Vncdo() {
		return cifServicoByFkD02tb201D02tb200Vncdo;
	}

	public void setCifServicoByFkD02tb201D02tb200Vncdo(CifServicoDto cifServicoByFkD02tb201D02tb200Vncdo) {
		this.cifServicoByFkD02tb201D02tb200Vncdo = cifServicoByFkD02tb201D02tb200Vncdo;
	}

	public TipoVinculoDto getTipoVinculo() {
		return tipoVinculo;
	}

	public void setTipoVinculo(TipoVinculoDto tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public char getIcMandatorio() {
		return icMandatorio;
	}

	public void setIcMandatorio(char icMandatorio) {
		this.icMandatorio = icMandatorio;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public String getCoUsuario() {
		return coUsuario;
	}

	public void setCoUsuario(String coUsuario) {
		this.coUsuario = coUsuario;
	}

}
