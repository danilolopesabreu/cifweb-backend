package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoVinculo;

public class CifComplementoDto {

	private CifComplementoDtoId id;
	private CifServico cifServicoByFkD02tb201D02tb200Vnclr;
	private CifServico cifServicoByFkD02tb201D02tb200Vncdo;
	private TipoVinculo tipoVinculo;
	private char icMandatorio;
	private Date fimVigencia;
	private String coUsuario;

	public CifComplementoDtoId getId() {
		return id;
	}

	public void setId(CifComplementoDtoId id) {
		this.id = id;
	}

	public CifServico getCifServicoByFkD02tb201D02tb200Vnclr() {
		return cifServicoByFkD02tb201D02tb200Vnclr;
	}

	public void setCifServicoByFkD02tb201D02tb200Vnclr(CifServico cifServicoByFkD02tb201D02tb200Vnclr) {
		this.cifServicoByFkD02tb201D02tb200Vnclr = cifServicoByFkD02tb201D02tb200Vnclr;
	}

	public CifServico getCifServicoByFkD02tb201D02tb200Vncdo() {
		return cifServicoByFkD02tb201D02tb200Vncdo;
	}

	public void setCifServicoByFkD02tb201D02tb200Vncdo(CifServico cifServicoByFkD02tb201D02tb200Vncdo) {
		this.cifServicoByFkD02tb201D02tb200Vncdo = cifServicoByFkD02tb201D02tb200Vncdo;
	}

	public TipoVinculo getTipoVinculo() {
		return tipoVinculo;
	}

	public void setTipoVinculo(TipoVinculo tipoVinculo) {
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
