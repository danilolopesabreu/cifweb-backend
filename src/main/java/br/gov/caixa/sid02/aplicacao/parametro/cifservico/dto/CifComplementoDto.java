package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

import javax.json.bind.annotation.JsonbTransient;

public class CifComplementoDto {

	@JsonbTransient
	private CifServicoDto cifServicoByFkD02tb201D02tb200Vnclr;
	
	private CifServicoDto cifServicoVinculado;
	
	@JsonbTransient
	private CifComplementoDtoId id;
	
	private TipoVinculoDto tipoVinculo;
	
	private char icMandatorio;
	
	@JsonbTransient
	private Date fimVigencia;
	
	@JsonbTransient
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

	public CifServicoDto getCifServicoVinculado() {
		return cifServicoVinculado;
	}

	public void setCifServicoVinculado(CifServicoDto cifServicoByFkD02tb201D02tb200Vncdo) {
		this.cifServicoVinculado = cifServicoByFkD02tb201D02tb200Vncdo;
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
