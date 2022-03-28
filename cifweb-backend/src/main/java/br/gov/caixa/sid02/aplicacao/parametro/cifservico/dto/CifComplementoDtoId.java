package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

import javax.json.bind.annotation.JsonbTransient;

public class CifComplementoDtoId {

	private short nuAcaoVinculador;
	private short nuModoVinculador;
	private short nuGrupoVinculador;
	private int nuSqnclCifSrvcoVinculador;
	@JsonbTransient
	private Date inicioVigencia;

	public short getNuAcaoVinculador() {
		return nuAcaoVinculador;
	}

	public void setNuAcaoVinculador(short nuAcaoVinculador) {
		this.nuAcaoVinculador = nuAcaoVinculador;
	}

	public short getNuModoVinculador() {
		return nuModoVinculador;
	}

	public void setNuModoVinculador(short nuModoVinculador) {
		this.nuModoVinculador = nuModoVinculador;
	}

	public short getNuGrupoVinculador() {
		return nuGrupoVinculador;
	}

	public void setNuGrupoVinculador(short nuGrupoVinculador) {
		this.nuGrupoVinculador = nuGrupoVinculador;
	}

	public int getNuSqnclCifSrvcoVinculador() {
		return nuSqnclCifSrvcoVinculador;
	}

	public void setNuSqnclCifSrvcoVinculador(int nuSqnclCifSrvcoVinculador) {
		this.nuSqnclCifSrvcoVinculador = nuSqnclCifSrvcoVinculador;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

}
